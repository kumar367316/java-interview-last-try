package comc.ore.designpattern.factory;

import java.util.List;

abstract class ProductItemDetailsProvider {

	abstract List<PODetails> getPoItemDetails();
	
	public void showdetails() {
		System.out.println("Show Product Details");
	}
}
