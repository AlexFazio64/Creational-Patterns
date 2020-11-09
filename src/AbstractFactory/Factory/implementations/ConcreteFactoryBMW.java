package AbstractFactory.Factory.implementations;

import AbstractFactory.Factory.abstractions.AbstractFactory;
import AbstractFactory.Factory.abstractions.Product;
import AbstractFactory.Factory.products.BmwFamiliare;
import AbstractFactory.Factory.products.BmwLavoro;
import AbstractFactory.Factory.products.BmwSportiva;

public class ConcreteFactoryBMW extends AbstractFactory {
	@Override
	public Product factoryMethodFamiliare() {
		return new BmwFamiliare();
	}
	
	@Override
	public Product factoryMethodSportiva() {
		return new BmwSportiva();
	}
	
	@Override
	public Product factoryMethodLavoro() {
		return new BmwLavoro();
	}
}
