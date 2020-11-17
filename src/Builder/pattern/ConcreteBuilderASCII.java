package Builder.pattern;

public class ConcreteBuilderASCII implements Builder {
	ASCIIString string;
	
	@Override
	public void Build(String input) {
		string = new ASCIIString();
		string.setString(input);
	}
	
	@Override
	public String getResult() {
		return string.getResult();
	}
}
