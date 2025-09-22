package lk.ijse.elite_driving_school_orm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Appinitializer {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}