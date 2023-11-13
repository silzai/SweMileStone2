package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProvidePaperDetailsController {

    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;

    @FXML
    void onButtonPressedBack(ActionEvent event) throws IOException {
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SelectConferenceScene.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedNext(ActionEvent event) {

    }

}
