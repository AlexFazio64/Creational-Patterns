package AbstractFactory.Factory.implementations;

import AbstractFactory.Factory.abstractions.AbstractFactory;
import AbstractFactory.Factory.abstractions.Product;
import AbstractFactory.Factory.products.FiatFamiliare;
import AbstractFactory.Factory.products.FiatLavoro;
import AbstractFactory.Factory.products.FiatSportiva;

public class ConcreteFactoryFiat extends AbstractFactory {
	@Override
	public Product factoryMethodFamiliare() {
		return new FiatFamiliare();
	}
	
	@Override
	public Product factoryMethodSportiva() {
		return new FiatSportiva();
	}
	
	@Override
	public Product factoryMethodLavoro() {
		return new FiatLavoro();
	}
}
