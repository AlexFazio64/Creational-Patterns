package AbstractFactory;

import AbstractFactory.Factory.abstractions.Product;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InfoWindow extends Stage {
	public static Product prodotto;
	
	public InfoWindow() {
		super();
		Parent root = null;
		
		try {
			root = FXMLLoader.load(getClass().getResource("view/car_info_window.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//noinspection ConstantConditions
		this.setScene(new Scene(root, 600, 400));
		this.setTitle("Informazioni Automobile");
		this.setResizable(false);
		this.show();
	}
	
}