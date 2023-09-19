module dev.baumgaertner.multipletool {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens dev.baumgaertner.multipletool to javafx.fxml;
    exports dev.baumgaertner.multipletool;
}