package Builder.pattern;

public class Director {
	protected Builder builder;
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void buildProduct(String input) {
		builder.Build(input);
	}
	
	public Builder getBuilder() {
		return builder;
	}
}
