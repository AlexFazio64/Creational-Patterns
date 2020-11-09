package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class FiatFamiliare extends Product {
	public FiatFamiliare() {
		this.marca = "FIAT";
		this.nome = "Punto";
		this.prezzo = 6500f;
		this.numero_porte = 2;
		this.numero_sedili = 4;
		this.ibrida = false;
		this.filepath = "AbstractFactory/rsc/Punto.png";
	}
}
