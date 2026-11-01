/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BmiResult;
import model.Person;

/**
 * FXML Controller class
 *
 * @author Riyan
 */
public class BmiController implements Initializable {

    @FXML
    private TextField tinggiBadanInput;
    @FXML
    private TextField beratBadanInput;
    @FXML
    private Button hitungButton;
    @FXML
    private Label hasilLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hasilLabel.setText("");
    }

    @FXML
    private void calculateBmi(ActionEvent event) {
        double berat = Double.parseDouble(beratBadanInput.getText());
        double tinggi = Double.parseDouble(tinggiBadanInput.getText()) / 100;

        Person person = new Person(berat, tinggi);

        BmiResult hasil = person.calculateBmi();

        String teksParagraf = String.format(
                "Skor BMI Anda adalah %.1f, dan masuk ke dalam kategori %s. ",
                hasil.getScore(), hasil.getCategory()
        );

        // Menampilkan paragraf tersebut langsung ke hasilLabel
        hasilLabel.setText(teksParagraf);
    }

}
