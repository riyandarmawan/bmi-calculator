/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Riyan
 */
public class Person {
    private double beratBadan, tinggiBadan;

    public Person(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }
    
    public BmiResult calculateBmi() {
        double score = beratBadan / Math.pow(tinggiBadan, 2);
        String category;

        // Menentukan kategori berdasarkan skor standar WHO
        if (score < 18.5) {
            category = "Underweight (Kurus)";
        } else if (score < 25.0) {
            category = "Normal (Ideal)";
        } else if (score < 30.0) {
            category = "Overweight (Gemuk)";
        } else {
            category = "Obese (Obesitas)";
        }

        // Mengembalikan data dalam bentuk Objek hasil
        return new BmiResult(score, category);
    } 
}
