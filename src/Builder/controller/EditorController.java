package Builder.controller;

import Builder.pattern.ConcreteBuilderASCII;
import Builder.pattern.ConcreteBuilderScript;
import Builder.pattern.Director;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class EditorController {
	public TextField input;
	public TextArea asciiArea;
	public HBox graphicsPane;
	
	Director director;
	
	public void initialize() {
		director = new Director();
	}
	
	
	public void buildChar(KeyEvent keyEvent) {
		if ( keyEvent.getCode() == KeyCode.ENTER ) {
			director.setBuilder(new ConcreteBuilderASCII());
			director.buildProduct(input.getText());
			asciiArea.setText((String) director.getBuilder().getResult());
			
			director.setBuilder(new ConcreteBuilderScript());
			director.buildProduct(input.getText());
			ArrayList<ImageView> pics = ( (ConcreteBuilderScript) director.getBuilder() ).getResult();
			graphicsPane.getChildren().clear();
			graphicsPane.getChildren().addAll(pics);
			input.setText("");
		}
	}
}
