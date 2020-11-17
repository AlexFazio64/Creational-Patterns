package Builder.pattern;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ConcreteBuilderScript implements Builder {
	ScriptString string;
	
	@Override
	public void Build(String input) {
		string = new ScriptString();
		string.setString(input);
	}
	
	@Override
	public ArrayList<ImageView> getResult() {
		return string.getResult();
	}
}
