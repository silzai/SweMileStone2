package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
import model.Author;
import model.Conference;
import model.ConferenceContainer;
import model.Reviewer;
import model.User;
import model.UserContainer;
import model.Venue;

public class SelectConferenceController implements Initializable {
	
    @FXML
    private TableView<Conference> conferencesTable;
	
	@FXML
    private TableColumn<Conference, String> conferenceDateColumn;

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
    private TableColumn<Conference, String> submissionDateColumn;

    @FXML
    private TableColumn<Conference, String> venueColumn;
    
    public static Author LoggedInUser;
    
    @FXML
    void onButtonPressedNext(ActionEvent event) throws IOException {
    	// change scene to providePaperDetails
		Stage currentStage = (Stage)nextButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ProvidePaperDetails.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedSave(ActionEvent event) {
    	if (conferencesTable.getSelectionModel().getSelectedItem() != null) {
    		if(LoggedInUser.getSelectedConference()!=null) {
    			selectConferenceLabel.setText("You have already selected: " + 
    		LoggedInUser.getSelectedConference().getName() + "! You cannot register in anymore conferences." );
    			UserContainer.storeData();
    		}else {
    		LoggedInUser.setSelectedConference(conferencesTable.getSelectionModel().getSelectedItem());
    		selectConferenceLabel.setText("Your selected conference has been saved!");
    	}}

    }
    
    //adding initialize method to initialize the conference TableView
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	makeConferencesTable();
    }
    
    public void makeConferencesTable() {
    	
    	Conference c1 = new Conference();
    	c1.setName("Hassams Conference");
    	c1.setConferenceDate(Calendar.getInstance());
    	c1.setPaperSubmissionDate(Calendar.getInstance());
    	c1.setVenue(new Venue("Hassams Venue", "Matar Qadeem"));
    	List<Reviewer> rvs = new ArrayList<>();
    	rvs.add(new Reviewer("hassam", "khaili", "123"));
    	c1.setReviewersList(rvs);
    	
    	Conference c2 = new Conference();
    	c2.setName("Basils Conference");
    	c2.setConferenceDate(Calendar.getInstance());
    	c2.setPaperSubmissionDate(Calendar.getInstance());
    	c2.setVenue(new Venue("Basils Venue", "Wakrah"));
    	rvs.add(new Reviewer("Basil", "Saeed", "456"));
    	c2.setReviewersList(rvs);
    	
    	if(ConferenceContainer.getConferences().size()==0) {
    	
    	ConferenceContainer.addConference(c1);
    	ConferenceContainer.addConference(c2);
    	}
    	
    	ObservableList<Conference> listOfConferences = FXCollections.observableArrayList(ConferenceContainer.getConferences());
		conferencesTable.setItems(listOfConferences);
		
		nameColumn.setCellValueFactory(new PropertyValueFactory<Conference, String>("Name"));
    	conferenceDateColumn.setCellValueFactory(new PropertyValueFactory<>("ConferenceDateString"));
    	submissionDateColumn.setCellValueFactory(new PropertyValueFactory<>("PaperSubmissionDateString"));
    	venueColumn.setCellValueFactory(new PropertyValueFactory<>("VenueName"));
    	reviewersColumn.setCellValueFactory(new PropertyValueFactory<>("ReviewersList"));
		
    }
    
    public static void getUserAfterLogging(User user) {
    	LoggedInUser = (Author) user;
    }
}

