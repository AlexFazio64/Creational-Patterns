package AbstractFactory.Factory.products;

import AbstractFactory.Factory.abstractions.Product;

public class FiatSportiva extends Product {
	public FiatSportiva() {
		this.marca = "FIAT";
		this.nome = "124 Spider";
		this.prezzo = 16500f;
		this.numero_porte = 2;
		this.numero_sedili = 2;
		this.ibrida = true;
		this.filepath = "AbstractFactory/rsc/124.png";
	}
}
