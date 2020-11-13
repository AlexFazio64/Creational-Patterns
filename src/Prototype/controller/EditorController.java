package Prototype.controller;

import Prototype.Client;
import Prototype.pattern.Product;
import Prototype.pattern.Prototype;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class EditorController {
	@FXML
	public Canvas canvas;
	@FXML
	public VBox slotsBox;
	private Image current;
	
	public void initialize() {
		Prototype palette = Client.palette;
		Image background = new Image("Prototype/resources/backdrop.jpg");
		canvas.getGraphicsContext2D().drawImage(background, 0, 0);
		
		for (int i = 0; i < palette.getSize(); i++) {
			BorderPane pane = new BorderPane();
			pane.setMaxWidth(128);
			pane.setMaxHeight(128);
			pane.setCenter(new ProductImage(palette.makeProduct(i), i, pane));
			pane.setPadding(new Insets(0, 0, 20, 10));
			slotsBox.getChildren().add(pane);
		}
	}
	
	public void draw(MouseEvent mouseEvent) {
		if ( current != null ) {
			canvas.getGraphicsContext2D().drawImage(current, mouseEvent.getSceneX() - ( current.getWidth() / 2 ) - 128, mouseEvent.getSceneY() - ( current.getHeight() / 2 ));
		}
	}
	
	private final class ProductImage extends ImageView {
		private final int localIndex;
		public final Image image;
		
		public ProductImage(Product product, int i, BorderPane pane) {
			this.localIndex = i;
			this.image = new Image(product.getFilename(), product.getW(), product.getH(), true, true);
			Image icon = new Image(product.getFilename(), 96, 96, true, true);
			this.setImage(icon);
			
			Tooltip tip = new Tooltip(product.getType());
			tip.setFont(new Font(16));
			Tooltip.install(pane, tip);
			
			pane.setOnMouseClicked(event -> {
				for (Node child: slotsBox.getChildren()) {
					child.setOpacity(.25);
				}
				current = this.image;
				slotsBox.getChildren().get(this.localIndex).setOpacity(1);
			});
		}
		
		public int getIndex() {
			return localIndex;
		}
	}
	
	
}