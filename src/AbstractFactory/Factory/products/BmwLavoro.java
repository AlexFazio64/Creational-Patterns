package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class BmwLavoro extends Product {
	public BmwLavoro() {
		this.marca = "BMW";
		this.nome = "X3";
		this.prezzo = 15600f;
		this.numero_porte = 4;
		this.numero_sedili = 6;
		this.ibrida = false;
		this.filepath = "AbstractFactory/rsc/X3.png";
	}
}
