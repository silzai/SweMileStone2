package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Author;
import model.DataBuffer;
import model.UserContainer;

public class RegisterUserController {

    @FXML
    private Button backButton;

    @FXML
    private Label credentialsLabel;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private Button registerButton;

    @FXML
    void onButtonPressedBack(ActionEvent event) throws IOException {
    	Stage currentStage = (Stage)backButton.getScene().getWindow();
		currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Login.fxml")), 600, 400));
    }

    @FXML
    void onButtonPressedRegister(ActionEvent event) {
    	Author author = new Author(firstNameTextField.getText(), lastNameTextField.getText(), idTextField.getText());
    	//displaying the credentials to the user by adding the username/password to the label
    	credentialsLabel.setText("Username: " + author.getUsername() + "\npassword: " + author.getPassword());
<<<<<<< HEAD
    	//storing the author in file permanently
    	DataBuffer.authors.add(author);
    	DataBuffer.storeAuthors();
=======
    	UserContainer.storeData();
>>>>>>> 7073c44
    }

}

