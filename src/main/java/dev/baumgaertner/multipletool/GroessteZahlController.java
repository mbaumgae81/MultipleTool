package dev.baumgaertner.multipletool;

import dev.baumgaertner.multipletool.Utils.Greatest;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GroessteZahlController {
    public TextField eingabeGroessterWert;
    public TextField groessterWert;
    public Button naechsterWert;
    public Button back;
    public Label Fehler;
    Greatest myGreates;

    @FXML
    private void initialize() {
         myGreates  = new Greatest();
        Fehler.setText("");

    }
    public void OnKeyPressed(KeyEvent keyEvent) {
        if( keyEvent.getCode() == KeyCode.ENTER ){
            int eingabe = 0;
            try {
            eingabe = Integer.parseInt(eingabeGroessterWert.getText());
            } catch (NumberFormatException w){
                Fehler.setText(" Bitte anständige Zahlen eingeben");
            }
            myGreates.addWert(eingabe);
            groessterWert.setText(String.valueOf(myGreates.getBiggest()));
            eingabeGroessterWert.setText("");
        }
    }

    public void OnNaechsterWert(ActionEvent actionEvent) {
        int eingabe =0;
        Fehler.setText("");
        try {
             eingabe = Integer.parseInt(eingabeGroessterWert.getText());
        } catch (NumberFormatException w){
            Fehler.setText(" Bitte anständige Zahlen eingeben");
        }
        myGreates.addWert(eingabe);
        groessterWert.setText(String.valueOf(myGreates.getBiggest()));
    }

    public void onBack(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void OnMouseClear(MouseEvent mouseEvent) {
        eingabeGroessterWert.setText("");
    }
}
