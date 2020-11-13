package Prototype;

import Prototype.pattern.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application {
	public static Prototype palette;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/editor.fxml"));
		Stage mainStage = new Stage();
		mainStage.setScene(new Scene(loader.load()));
		mainStage.setWidth(1280.0);
		mainStage.setHeight(720.0);
		mainStage.setTitle("Editor");
		mainStage.setResizable(false);
		mainStage.show();
	}
	
	public static void main(String[] args) {
		palette = new Prototype(new Bat(), new BatGroup(), new Jack_O_Lantern(), new Moon(), new Cat());
		launch(args);
	}
}
