package swemilestone2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(final Stage stage) throws Exception {
		// TODO change the fxml class here
		Pane root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
		stage.setScene(new Scene(root, 600, 400));
		stage.setTitle("Submit Paper for Conference");
		stage.show();
	}

	public static void main(String[] arguments) {
		Application.launch(arguments);
	}
}

