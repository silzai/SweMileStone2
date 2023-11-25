package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.Author;
import model.ConferenceContainer;
import model.Paper;
import model.User;
import model.UserContainer;

public class ProvidePaperDetailsController {

	   @FXML
	    private Button backButton;

	    @FXML
	    private TextField keywordsTextField;

	    @FXML
	    private TextField listAuthorsTextField;

	    @FXML
	    private Button nextButton;

	    @FXML
	    private TextArea paperAbstractTextArea;

	    @FXML
	    private Label paperNumberLabel;

	    @FXML
	    private TextField paperTitleTextField;

	    @FXML
	    private Button saveButton;
	    

    @FXML
    void onButtonPressedBack(ActionEvent event) throws IOException {
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SelectConferenceScene.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedNext(ActionEvent event) throws IOException {
    	// change scene to uploadPaper
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UploadPaper.fxml")), 600, 400));
    }
    
    @FXML
    void onButtonPressedSave(ActionEvent event) throws IOException {
    	System.out.println(SelectConferenceController.LoggedInUser.getPapersList());
    	if(SelectConferenceController.LoggedInUser.getPapersList().size()<3)   {
    	List<String> listOfAuthors = new ArrayList<>();
    	//checking if there are multiple authors
    	if (listAuthorsTextField.getText().contains(","))
    		listOfAuthors = Arrays.asList( listAuthorsTextField.getText().split(","));
    	else listOfAuthors.add(listAuthorsTextField.getText());
    	
    	List<String> listOfKeywords = new ArrayList<>();
    	//checking if there are multiple keywords
    	if (keywordsTextField.getText().contains(","))
    		listOfKeywords = Arrays.asList( keywordsTextField.getText().split(","));
    	else listOfKeywords.add(keywordsTextField.getText());
    	
     	Paper paper = new Paper(paperTitleTextField.getText(), listOfAuthors, listOfKeywords, paperAbstractTextArea.getText());
     	//displaying generated paper number
     	paperNumberLabel.setText("Paper Number: " + String.valueOf(paper.getPaperNumber()) + ", The paper details have been saved.");
     	
     	SelectConferenceController.LoggedInUser.addPapersList(paper);
     	SelectConferenceController.LoggedInUser.getSelectedConference().addInitiallySubmittedPapersList(paper);
     	UserContainer.storeData();
     	ConferenceContainer.storeConferenceData();
    	} else {
    	displayMessage("The number of papers exceeded the limit, session has been terminated.", AlertType.ERROR);
    	// change scene to login (terminating the session)
    	Stage currentStage = (Stage)nextButton.getScene().getWindow();
    	currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Login.fxml")), 600, 400));
    	paperNumberLabel.setText("The number of papers exceeded the limit!");
    	}
    	
    }
    
	public void displayMessage(String message, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle("System Message");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
   
}
