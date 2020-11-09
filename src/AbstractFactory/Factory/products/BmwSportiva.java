package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class BmwSportiva extends Product {
	public BmwSportiva() {
		this.marca = "BMW";
		this.nome = "Serie 8";
		this.prezzo = 21000f;
		this.numero_porte = 2;
		this.numero_sedili = 2;
		this.ibrida = false;
		this.filepath = "AbstractFactory/rsc/bmw8.png";
	}
}
