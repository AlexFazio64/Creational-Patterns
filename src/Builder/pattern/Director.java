package Builder.pattern;

public class Director {
	protected Builder builder;
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
		this.builder.initialize();
	}
	
	public void buildProduct(String input) {
		input = input.toLowerCase();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if ( c >= 'a' && c <= 'z' ) {
				builder.Build(c);
			}
		}
	}
	
	public Builder getBuilder() {
		return builder;
	}
}
