package dev.baumgaertner.multipletool;

import dev.baumgaertner.multipletool.Utils.CheckForValidDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.NumberFormat;

public class PruefeValidesDatumController {
    public Button back;
    public Button checkDate;
    public Label LabelB;
    public Label labelA;
    public TextField inputYear;
    public TextField inputMonth;
    public TextField inputDay;

    @FXML
    private void initialize(){
        labelA.setText("");
        LabelB.setText("");
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onCheckDate(ActionEvent actionEvent) {

        int day =0;
        int month = 0;
        int year =0 ;

        try {
             day = Integer.parseInt(inputDay.getText());
             month = Integer.parseInt(inputMonth.getText());
             year = Integer.parseInt(inputYear.getText());
        } catch (RuntimeException e){

            labelA.setText("Bitte nur Zahlen eingeben");
        }
        if (CheckForValidDate.checkIsValid(year, month,day)){
            labelA.setText("Der " + day + "."+month+"."+year+" ist ein GültigesDatum");
            if (CheckForValidDate.isSchaltjahr(year)){
                LabelB.setText("Das Jahr " + year + " ist ein Schaltjahr");
            } else {
                LabelB.setText("Das Jahr " + year + " ist kein Schaltjahr");
            }
        }else{
            labelA.setText(" Datum ist ungültig");
        }



    }
}
