package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SelectConferenceController {
	
    @FXML
    private TableView<?> conferencesTable;
	
	@FXML
    private TableColumn<?, ?> conferenceDateColumn;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private Button nextButton;

    @FXML
    private TableColumn<?, ?> reviewersColumn;
    
    @FXML
    private Button saveButton;

    @FXML
    private Label selectConferenceLabel;

    @FXML
    private TableColumn<?, ?> submissionDateColumn;

    @FXML
    private TableColumn<?, ?> venueColumn;
    
    @FXML
    void onButtonPressedNext(ActionEvent event) throws IOException {
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ProvidePaperDetails.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedSave(ActionEvent event) {
    	
    }

}

