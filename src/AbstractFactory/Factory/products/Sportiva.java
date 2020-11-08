package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class Sportiva extends Product {
	public Sportiva() {
		this.nome = "124 Spider";
		this.prezzo = 16500f;
		this.numero_porte = 2;
		this.numero_sedili = 2;
		this.ibrida = true;
		this.filepath = "AbstractFactory/rsc/124.png";
	}
}
