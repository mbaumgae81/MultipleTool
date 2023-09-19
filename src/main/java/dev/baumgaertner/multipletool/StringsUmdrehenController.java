package dev.baumgaertner.multipletool;

import dev.baumgaertner.multipletool.Utils.StringsUmdrehen;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StringsUmdrehenController {
    public TextField input;
    public TextField output;
    public Button umkehren;
    public Button back;

    public void onClickUmkehren(ActionEvent actionEvent) {
        String umkehren = StringsUmdrehen.doStringUmkehren(input.getText());
        output.setText(umkehren);
    }

    public void onClickedBack(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
