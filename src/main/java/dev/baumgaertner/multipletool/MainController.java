package dev.baumgaertner.multipletool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {


    public Button ExitButton;
    public Button durchschnitt;
    public Button biggestNum;
    public Button CtoF;
    public Button Stb;
    public Button CvD;


    @FXML
    public void onDurchschnittPressed(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) durchschnitt.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("durchschnitt.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void onBiggestNum(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) biggestNum.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("groesste-zahl.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onCtoF(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) CtoF.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("CelsiusToFahrenheit.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onStringBackward(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) Stb.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("StringsUmdrehen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void ocCheckValideDate(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) CvD.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("pruefeValidesDatum.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void unExit(ActionEvent actionEvent) {
        Stage stage = (Stage) ExitButton.getScene().getWindow();

        stage.close();
    }
}