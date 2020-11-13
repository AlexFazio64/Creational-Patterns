package Prototype.pattern;

public abstract class Product implements Cloneable {
	protected Integer W, H;
	protected String type;
	protected String filename;
	
	public Integer getW() {
		return W;
	}
	
	public Integer getH() {
		return H;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public String getType() {
		return type;
	}
	
	public Product copy() {
		try {
			return (Product) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}