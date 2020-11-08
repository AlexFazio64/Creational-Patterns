package AbstractFactory.Factory.abstractions;

public abstract class Product {
	protected String nome;
	protected Float prezzo;
	protected Integer numero_porte;
	protected Integer numero_sedili;
	protected Boolean ibrida;
	protected String filepath;
	
	public String getNome() {
		return nome;
	}
	
	public Float getPrezzo() {
		return prezzo;
	}
	
	public Integer getNumero_porte() {
		return numero_porte;
	}
	
	public Integer getNumero_sedili() {
		return numero_sedili;
	}
	
	public Boolean getIbrida() {
		return ibrida;
	}
	
	public String getFilepath() {
		return filepath;
	}
}
