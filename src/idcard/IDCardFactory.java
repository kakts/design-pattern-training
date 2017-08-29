package idcard;

import java.awt.List;
import java.util.*;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
	private List owners = new List();
	
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
}
