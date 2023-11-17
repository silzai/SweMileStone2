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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Author;
import model.Paper;
import model.PaperContainer;

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
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UploadPaper.fxml")), 600, 400));
    }
    
    @FXML
    void onButtonPressedSave(ActionEvent event) {
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
     	PaperContainer.addPaper(paper);
     	PaperContainer.storeData();
    }
}
