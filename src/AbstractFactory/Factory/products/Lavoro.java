package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class Lavoro extends Product {
	public Lavoro() {
		this.nome = "Nuova 500XL";
		this.prezzo = 10200f;
		this.numero_porte = 4;
		this.numero_sedili = 6;
		this.ibrida = false;
		this.filepath = "AbstractFactory/rsc/500XL.png";
	}
}
