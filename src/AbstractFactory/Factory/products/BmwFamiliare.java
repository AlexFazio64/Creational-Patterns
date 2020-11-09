package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class BmwFamiliare extends Product {
	public BmwFamiliare() {
		this.marca = "BMW";
		this.nome = "Serie 5";
		this.prezzo = 10000f;
		this.numero_porte = 4;
		this.numero_sedili = 5;
		this.ibrida = true;
		this.filepath = "AbstractFactory/rsc/serie5.png";
	}
}
