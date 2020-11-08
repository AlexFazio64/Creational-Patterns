package FactoryMethod;

import FactoryMethod.Factory.abstractions.Creator;
import FactoryMethod.Factory.abstractions.Product;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InfoWindow extends Stage {
	public static Product prodotto;
	
	public InfoWindow(Creator creatore) {
		super();
		Parent root = null;
		
		try {
			prodotto = creatore.factoryMethod();
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