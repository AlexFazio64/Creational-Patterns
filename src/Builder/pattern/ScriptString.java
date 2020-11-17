package Builder.pattern;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ScriptString {
	String string;
	private static ArrayList<Image> chars;
	
	public ScriptString() {
		string = "";
		chars = new ArrayList<>();
		for (char i = 'a'; i < 'a' + 26; i++) {
			chars.add(new Image(getClass().getClassLoader().getResource("Builder" + "/resources/" + i + ".png").toString(), 250, 250, true, true));
		}
	}
	
	public void setString(String string) {
		this.string = sanitize(string);
	}
	
	private String sanitize(String s) {
		StringBuilder sanitized = new StringBuilder();
		s = s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if ( c >= 'a' && c <= 'z' ) {
				sanitized.append(s.charAt(i));
			}
		}
		
		return sanitized.toString();
	}
	
	public ArrayList<ImageView> getResult() {
		ArrayList<ImageView> ai = new ArrayList<>();
		for (int i = 0; i < string.length(); ++i)
			ai.add(new ImageView(chars.get(string.charAt(i) - 'a')));
		
		return ai;
	}
}
