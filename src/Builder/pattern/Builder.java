package Builder.pattern;

public interface Builder {
	void initialize();
	
	void Build(char token);
	
	Object getResult();
}
