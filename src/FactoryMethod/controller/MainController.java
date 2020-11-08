package FactoryMethod.controller;

import FactoryMethod.Factory.concrete_creators.ConcreteCreatorFamiliare;
import FactoryMethod.Factory.concrete_creators.ConcreteCreatorLavoro;
import FactoryMethod.Factory.concrete_creators.ConcreteCreatorSportiva;
import FactoryMethod.InfoWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class MainController {
	@FXML
	public Label work;
	@FXML
	public Label sport;
	@FXML
	public Label family;
	
	InfoWindow iw;
	ArrayList<Label> labels;
	
	public void initialize() {
		labels = new ArrayList<>();
		labels.add(family);
		labels.add(sport);
		labels.add(work);
	}
	
	public void showFamily(MouseEvent mouseEvent) {
		iw = new InfoWindow(new ConcreteCreatorFamiliare());
	}
	
	public void showSport(MouseEvent mouseEvent) {
		iw = new InfoWindow(new ConcreteCreatorSportiva());
	}
	
	public void showWork(MouseEvent mouseEvent) {
		iw = new InfoWindow(new ConcreteCreatorLavoro());
	}
	
	public void focusFamily(MouseEvent mouseEvent) {
		labels.get(0).setTextFill(Color.RED);
		labels.get(1).setTextFill(Color.BLACK);
		labels.get(2).setTextFill(Color.BLACK);
	}
	
	public void focusSport(MouseEvent mouseEvent) {
		labels.get(1).setTextFill(Color.BLUE);
		labels.get(0).setTextFill(Color.BLACK);
		labels.get(2).setTextFill(Color.BLACK);
	}
	
	public void focusWork(MouseEvent mouseEvent) {
		labels.get(2).setTextFill(Color.RED);
		labels.get(1).setTextFill(Color.BLACK);
		labels.get(0).setTextFill(Color.BLACK);
	}
	
	public void loseFocus(MouseEvent mouseEvent) {
		labels.forEach(e -> e.setTextFill(Color.BLACK));
	}
}
