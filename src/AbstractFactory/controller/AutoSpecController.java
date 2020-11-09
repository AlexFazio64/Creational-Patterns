package AbstractFactory.controller;

import AbstractFactory.Factory.abstractions.Product;
import AbstractFactory.InfoWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AutoSpecController {
	@FXML
	public ImageView autoPic;
	@FXML
	public Label nameLbl;
	@FXML
	public Label priceLbl;
	@FXML
	public Label doorsLbl;
	@FXML
	public Label seatsLbl;
	@FXML
	public Label engineLbl;
	
	public void initialize() {
		Product p = InfoWindow.prodotto;
		autoPic.setImage(new Image(p.getFilepath()));
		nameLbl.setText(p.getNome());
		priceLbl.setText(p.getPrezzo().toString());
		doorsLbl.setText(p.getNumero_porte().toString());
		seatsLbl.setText(p.getNumero_sedili().toString());
		engineLbl.setText(p.getIbrida() ? "SI" : "NO");
	}
}
