package Builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/editor.fxml"));
		Stage mainStage = new Stage();
		mainStage.setScene(new Scene(loader.load()));
		mainStage.setWidth(700);
		mainStage.setHeight(400);
		mainStage.setResizable(false);
		mainStage.setTitle("Character Creation");
		mainStage.show();
	}
}
