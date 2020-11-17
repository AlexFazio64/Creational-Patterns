package Builder.pattern;

import java.util.ArrayList;

public class ASCIIString {
	ArrayList<String> string;
	
	public ASCIIString() {
		string = new ArrayList<>();
	}
	
	public void appendString(String s) {
		this.string.add(s);
	}
	
	public String getResult() {
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < 7; i++) {
			for (String s: string) {
				result.append(s.split("\\|")[i]);
				result.append("  ");
			}
			result.append('\n');
		}
		
		return result.toString();
	}
}
