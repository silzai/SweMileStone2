package controller;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class UploadPaperController {

    @FXML
    private Button backButton;

    @FXML
    private Button exitButton;

    @FXML
    private Label locationOfFileLabel;

    @FXML
    private Button submitPaperButton;

    @FXML
    private Label successLabel;
    
    @FXML
    void onButtonPressedBack(ActionEvent event) throws IOException {
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)backButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ProvidePaperDetails.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedExit(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML
    void onButtonPressedSubmitPaper(ActionEvent event) {
    	Stage currentStage = (Stage)backButton.getScene().getWindow();
    	//opening fileChooser dialog
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Select File to Submit to Conference");
    	
    	File selectedFile = fileChooser.showOpenDialog(currentStage);
    	if (selectedFile != null) {
    		String filePath = selectedFile.getPath();
    		locationOfFileLabel.setText(filePath);
    		successLabel.setText("Your paper has been successfully submitted");
    		
    	}
    }
}

