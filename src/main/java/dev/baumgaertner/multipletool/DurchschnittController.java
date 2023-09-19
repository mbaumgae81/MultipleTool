package dev.baumgaertner.multipletool;

import dev.baumgaertner.multipletool.Utils.durchschnitt;
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
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;

public class DurchschnittController {
    @FXML
    private TextField eingabeDsch;
    @FXML
    private Label FehlerEingabe;
    @FXML
    private TextField aktDschn;
    @FXML
    private Button back;
    durchschnitt myDurchschnitt;

    @FXML
    private void initialize() {
        myDurchschnitt = new durchschnitt();

        FehlerEingabe.setDisable(false);
        FehlerEingabe.setVisible(false);
    }

    public void OnKeyPressed(KeyEvent keyEvent) {
        if( keyEvent.getCode() == KeyCode.ENTER ){
            try {
                myDurchschnitt.addList(Double.parseDouble(eingabeDsch.getText()));
                FehlerEingabe.setVisible(false);
            } catch (NumberFormatException ne) {
                System.out.println(" falsche eingabe");
                FehlerEingabe.setVisible(true);

            }
            aktDschn.setText(String.valueOf(myDurchschnitt.getDurchschnitt()));
            eingabeDsch.setText("");
        }
    }

    public void OnNaechsterWert(ActionEvent actionEvent) {
        try {
            myDurchschnitt.addList(Double.parseDouble(eingabeDsch.getText()));
            FehlerEingabe.setVisible(false);
        } catch (NumberFormatException ne) {
            System.out.println(" falsche eingabe");
            FehlerEingabe.setVisible(true);

        }
        aktDschn.setText(String.valueOf(myDurchschnitt.getDurchschnitt()));


    }

    public void onBack(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public void OnMouseClear(MouseEvent mouseEvent) {
        eingabeDsch.setText("");
    }

}
