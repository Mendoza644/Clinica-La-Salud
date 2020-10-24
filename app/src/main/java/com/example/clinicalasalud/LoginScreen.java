package com.example.clinicalasalud;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginScreen extends AppCompatActivity {

    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextPassword;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = firebaseAuth.getCurrentUser();
        updateUI(user);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        firebaseAuth = FirebaseAuth.getInstance();

        textInputEditTextEmail = findViewById(R.id.input_email);
        textInputEditTextPassword = findViewById(R.id.input_password);
        textInputLayoutEmail = findViewById(R.id.layout_email);
        textInputLayoutPassword = findViewById(R.id.layout_password);
    }

    public void makeLogin(View view) {
        String email = textInputEditTextEmail.getText().toString().trim();
        String password = textInputEditTextPassword.getText().toString().trim();
        if (email.isEmpty() && !password.isEmpty()) {
            textInputLayoutEmail.setError(getResources().getString(R.string.empty_email));
        } else if (!email.isEmpty() && password.isEmpty()) {
            textInputLayoutPassword.setError(getResources().getString(R.string.empty_password));
        } else if (email.isEmpty() && password.isEmpty()) {
            textInputLayoutEmail.setError(getResources().getString(R.string.empty_email));
            textInputLayoutPassword.setError(getResources().getString(R.string.empty_password));
        } else {
            signIn(email, password);
        }
    }

    private void signIn(String email, String password) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, task -> {
            if (task.isSuccessful()) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                updateUI(user);
            } else {
                Toast.makeText(this, getResources().getString(R.string.warning), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Log.e("Login", "Error Login");
        }
    }
}