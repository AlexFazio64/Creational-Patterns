package FactoryMethod.Factory.concrete_creators;

import FactoryMethod.Factory.abstractions.Creator;
import FactoryMethod.Factory.abstractions.Product;
import FactoryMethod.Factory.products.Familiare;

public class ConcreteCreatorFamiliare extends Creator {
	@Override
	public Product factoryMethod() {
		return new Familiare();
	}
}
