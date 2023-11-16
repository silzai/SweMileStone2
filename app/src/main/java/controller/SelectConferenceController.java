package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Conference;

public class SelectConferenceController implements Initializable {
	
	private ObservableList<Conference> observableList;
	
    @FXML
    private TableView<Conference> conferencesTable;
	
	@FXML
    private TableColumn<Conference, Date> conferenceDateColumn;

    @FXML
    private TableColumn<Conference, String> nameColumn;

    @FXML
    private Button nextButton;

    @FXML
    private TableColumn<Conference, String> reviewersColumn;
    
    @FXML
    private Button saveButton;

    @FXML
    private Label selectConferenceLabel;

    @FXML
    private TableColumn<Conference, Date> submissionDateColumn;

    @FXML
    private TableColumn<Conference, String> venueColumn;
    
    @FXML
    void onButtonPressedNext(ActionEvent event) throws IOException {
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ProvidePaperDetails.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedSave(ActionEvent event) {
    	
    }
    
    //adding initialize method to initialize the conference TableView
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//    	nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
//    	conferenceDateColumn.setCellValueFactory(new PropertyValueFactory<>("ConferenceDate"));
//    	submissionDateColumn.setCellValueFactory(new PropertyValueFactory<>("PaperSubmissionDate"));
//    	venueColumn.setCellValueFactory(new PropertyValueFactory<>("Venue"));
//    	reviewersColumn.setCellValueFactory(new PropertyValueFactory<>("ReviewersList"));
//		observableList = FXCollections.observableArrayList(//PASS A LIST<> OF CONFERENCES AFTER FETCHING FROM .dat file);
    	 
    }
    

}

