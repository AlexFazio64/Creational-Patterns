package AbstractFactory;

import AbstractFactory.Factory.abstractions.AbstractFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Client extends Application {
	
	public static void main(String[] args) {
		String[] possibleValues = {"Fiat", "BMW"};
		String class_name = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]).toString();
		
		try {
			AbstractFactory.init(class_name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view/main_window.fxml"));
		primaryStage.setTitle("Concessionaria");
		primaryStage.setScene(new Scene(root, 600, 400));
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
