/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Riyan
 */
public class BmiResult {
    private final double score;
    private final String category;

    public BmiResult(double score, String category) {
        this.score = score;
        this.category = category;
    }

    public double getScore() {
        return score;
    }

    public String getCategory() {
        return category;
    }

}
