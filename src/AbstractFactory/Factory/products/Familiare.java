package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class Familiare extends Product {
	public Familiare() {
		this.nome = "Punto";
		this.prezzo = 6500f;
		this.numero_porte = 2;
		this.numero_sedili = 4;
		this.ibrida = false;
		this.filepath = "AbstractFactory/rsc/Punto.png";
	}
}
