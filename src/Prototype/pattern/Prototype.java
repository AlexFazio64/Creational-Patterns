package Prototype.pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Prototype {
	ArrayList<Product> slots;
	
	public Prototype(Product... p) {
		this.slots = new ArrayList<>();
		slots.addAll(Arrays.asList(p));
	}
	
	public Product makeProduct(int index) {
		return slots.get(index).copy();
	}
	
	public int getSize() {
		return slots.size();
	}
}
