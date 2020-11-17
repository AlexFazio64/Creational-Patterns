package Builder.pattern;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ConcreteBuilderScript implements Builder {
	private ScriptString string;
	private static ArrayList<Image> chars;
	
	public ConcreteBuilderScript() {
		chars = new ArrayList<>();
		for (char i = 'a'; i < 'a' + 26; i++)
			chars.add(new Image(getClass().getClassLoader().getResource("Builder/resources/" + i + ".png").toString(), 250, 250, true, true));
	}
	
	@Override
	public void initialize() {
		string = new ScriptString();
	}
	
	@Override
	public void Build(char token) {
		ImageView ch = new ImageView(chars.get(token - 'a'));
		string.appendComponent(ch);
	}
	
	@Override
	public ArrayList<ImageView> getResult() {
		return string.getResult();
	}
}
