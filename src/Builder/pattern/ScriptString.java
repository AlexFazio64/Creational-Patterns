package Builder.pattern;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ScriptString {
	ArrayList<ImageView> ai;
	
	public ScriptString() {
		ai = new ArrayList<>();
	}
	
	public void appendComponent(ImageView ch) {
		ai.add(ch);
	}
	
	public ArrayList<ImageView> getResult() {
		return ai;
	}
}
