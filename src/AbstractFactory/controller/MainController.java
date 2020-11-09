package AbstractFactory.controller;

import AbstractFactory.Factory.abstractions.AbstractFactory;
import AbstractFactory.Factory.implementations.ConcreteFactoryBMW;
import AbstractFactory.Factory.implementations.ConcreteFactoryFiat;
import AbstractFactory.InfoWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
public class MainController {
	@FXML
	public ImageView fiatImg;
	@FXML
	public ImageView bmwImg;
	@FXML
	public Label familiareLbl;
	@FXML
	public Label sportivaLbl;
	@FXML
	public Label lavoroLbl;
	@FXML
	public BorderPane modelsPane;
	@FXML
	public BorderPane fiatPane;
	@FXML
	public BorderPane bmwPane;
	
	ArrayList<Label> labels;
	AbstractFactory factory;
	InfoWindow iw;
	
	public void initialize() {
		fiatImg.setImage(new Image("AbstractFactory/rsc/FiatLogo.png"));
		bmwImg.setImage(new Image("AbstractFactory/rsc/BMWLogo.png"));
		
		labels = new ArrayList<>();
		labels.addAll(Arrays.asList(familiareLbl, sportivaLbl, lavoroLbl));
	}
	
	public void loseFocus(MouseEvent mouseEvent) {
		loseFocus();
	}
	
	private void loseFocus() {
		labels.forEach(e -> e.setTextFill(Color.BLACK));
	}
	
	public void showFamiliare(MouseEvent mouseEvent) {
		iw = new InfoWindow(factory.factoryMethodFamiliare());
	}
	
	public void showSportiva(MouseEvent mouseEvent) {
		iw = new InfoWindow(factory.factoryMethodSportiva());
	}
	
	public void showLavoro(MouseEvent mouseEvent) {
		iw = new InfoWindow(factory.factoryMethodLavoro());
	}
	
	public void focusFamiliare(MouseEvent mouseEvent) {
		loseFocus();
		labels.get(0).setTextFill(Color.RED);
	}
	
	public void focusSportiva(MouseEvent mouseEvent) {
		loseFocus();
		labels.get(1).setTextFill(Color.RED);
	}
	
	public void focusLavoro(MouseEvent mouseEvent) {
		loseFocus();
		labels.get(2).setTextFill(Color.RED);
	}
	
	public void selectFiat(MouseEvent mouseEvent) {
		fiatPane.setOpacity(1.0);
		bmwPane.setOpacity(.3);
		factory = new ConcreteFactoryFiat();
		modelsPane.setVisible(true);
	}
	
	public void selectBmw(MouseEvent mouseEvent) {
		bmwPane.setOpacity(1.0);
		fiatPane.setOpacity(.3);
		factory = new ConcreteFactoryBMW();
		modelsPane.setVisible(true);
	}
}
