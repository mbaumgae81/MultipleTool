package dev.baumgaertner.multipletool;

import dev.baumgaertner.multipletool.Utils.celsiusToFahrenheit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CelsiusToFahrenheitController {
    public TextField input;
    public TextField output;
    public Button umrechnen;
    public Button back;
    public Label quellLabel;
    public Label zielLabel;
    public Label Fehler;
    private boolean schalter = false;

    @FXML
    private void initialize() {
        Fehler.setText("");
//        umrechnen.setDisable(true);
    }


    public void onUmrechnen(ActionEvent actionEvent) {
        double eingabe =0;
        Fehler.setText("");
        try {
             eingabe = Double.parseDouble(input.getText());
        } catch (RuntimeException w){
            Fehler.setText("Bitte anständige Zahlen eingeben");
        }
        if (schalter){
            output.setText(String.valueOf(celsiusToFahrenheit.doUrechnungFtC(eingabe)));
        } else {
            output.setText(String.valueOf(celsiusToFahrenheit.doUmrechnungCtF(eingabe)));
        }
    }

    public void onBack(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onTextChanged(MouseDragEvent mouseDragEvent) {

        System.out.println(" on text changed");
        try {
            double eingabe = Double.parseDouble(input.getText());
        } catch (NumberFormatException e) {
            System.out.println(" Fehler falsche Zahl not Possible");
        }
        umrechnen.setDisable(false);
    }


    public void onKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            double eingabe = Double.parseDouble(input.getText());
            output.setText(String.valueOf(celsiusToFahrenheit.doUmrechnungCtF(eingabe)));
        }
    }

    public void OnChange(ActionEvent actionEvent) {
        schalter = !schalter;

        if (schalter) {
            quellLabel.setText("Fahrenheit");
            zielLabel.setText("Celsius");
        } else {
            quellLabel.setText("Celsius");
            zielLabel.setText("Fahrenheit");
        }
    }

    ;
}
