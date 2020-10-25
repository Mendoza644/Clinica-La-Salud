package com.example.clinicalasalud;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.clinicalasalud.models.Dossiers;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class CreateLog extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_log);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        /*Dossiers dossiers = new Dossiers("02/10/2020", "22:50", "Erika Roxana López", 30, 65, "20103040", "Dolor", "Presenta dolor de cabeza y hormigueo desde hace dos días.", "Hipertensión arterial tratamiento, enalapril 20 mg cada día Alérgica a Sulfas", "TA 120/80 FC 80 FR 18 Pulmones ventilados Cardiovascular ritmo regular no soplos Abdomen personalismo positivo normal No masas no dolor");
        firebaseFirestore.collection("Dossiers")
                .add(dossiers)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(this, "Document added.", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("ErrorInserting", "Error adding document.", e);
            }
        });*/
    }

    public void createDossier(View view){

    }
}