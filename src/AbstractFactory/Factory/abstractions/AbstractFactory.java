package AbstractFactory.Factory.abstractions;

public abstract class AbstractFactory {
	private static String className = null;
	private static AbstractFactory instance = null;
	
	protected AbstractFactory() {
	}
	
	public static void init(String family) throws Exception {
		if ( className != null ) {
			throw new Exception("Already initialized");
		}
		className = "AbstractFactory.Factory.implementations.ConcreteFactory" + family;
	}
	
	public static AbstractFactory getInstance() throws Exception {
		if ( instance == null ) {
			try {
				instance = (AbstractFactory) Class.forName(className).newInstance();
			} catch (Exception e) {
				throw new Exception("Unable to find brand");
			}
		}
		return instance;
	}
	
	public static String getClassName() {
		return className;
	}
	
	public abstract Product factoryMethodFamiliare();
	
	public abstract Product factoryMethodSportiva();
	
	public abstract Product factoryMethodLavoro();
}
