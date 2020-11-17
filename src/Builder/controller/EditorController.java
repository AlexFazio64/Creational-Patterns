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
	
	Director directorASCII;
	Director directorScript;
	
	public void initialize() {
		directorASCII = new Director();
		directorScript = new Director();
		
		directorASCII.setBuilder(new ConcreteBuilderASCII());
		directorScript.setBuilder(new ConcreteBuilderScript());
	}
	
	
	public void buildChar(KeyEvent keyEvent) {
		if ( keyEvent.getCode() == KeyCode.ENTER ) {
			directorScript.buildProduct(input.getText());
			directorASCII.buildProduct(input.getText());
			
			asciiArea.setText((String) directorASCII.getBuilder().getResult());
			
			ArrayList<ImageView> pics = ( (ConcreteBuilderScript) directorScript.getBuilder() ).getResult();
			graphicsPane.getChildren().clear();
			graphicsPane.getChildren().addAll(pics);
		}
	}
}
