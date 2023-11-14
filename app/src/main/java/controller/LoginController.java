package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.User;
import model.UserContainer;

public class LoginController {
	@FXML
	private PasswordField password;

	@FXML
	private TextField username;

	@FXML
	private Button loginButton;

	@FXML
	void login(ActionEvent event) throws IOException {
		User user = UserContainer.login(username.getText(), password.getText());
		if (user != null && user.isLogged()) {
			displayMessage("Welcome " + user.getUsername() + ". You have successfully logged in.", AlertType.CONFIRMATION);
			username.clear();
			password.clear();
			// change scene to select conference
			Stage currentStage = (Stage)loginButton.getScene().getWindow();
			currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SelectConferenceScene.fxml")), 600, 400));
//			((Window) loginButton.getScene().getWindow()).hide();
		} else
			displayMessage("Generated credentials based on the provided information, you will now be logged in.", AlertType.INFORMATION);
			// change scene to select conference
			Stage currentStage = (Stage)loginButton.getScene().getWindow();
			currentStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SelectConferenceScene.fxml")), 600, 400));
	}

	public void displayMessage(String message, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle("System Message");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
}