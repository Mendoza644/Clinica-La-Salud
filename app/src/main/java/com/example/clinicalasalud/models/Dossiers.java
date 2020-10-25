package com.example.clinicalasalud.models;

public class Dossiers {
    private String date;
    private String time;
    private String name;
    private int age;
    private float weight;
    private String phone;
    private String sickness;
    private String history;
    private String backgroundRecord;
    private String physicalTest;
    private String diagnose;
    private String treatment;

    public Dossiers() {
    }

    public Dossiers(String date, String time, String name, int age, float weight, String phone, String sickness, String history, String backgroundRecord, String physicalTest, String diagnose, String treatment) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.phone = phone;
        this.sickness = sickness;
        this.history = history;
        this.backgroundRecord = backgroundRecord;
        this.physicalTest = physicalTest;
        this.diagnose = diagnose;
        this.treatment = treatment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getBackgroundRecord() {
        return backgroundRecord;
    }

    public void setBackgroundRecord(String backgroundRecord) {
        this.backgroundRecord = backgroundRecord;
    }

    public String getPhysicalTest() {
        return physicalTest;
    }

    public void setPhysicalTest(String physicalTest) {
        this.physicalTest = physicalTest;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}