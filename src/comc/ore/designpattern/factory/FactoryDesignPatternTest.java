package comc.ore.designpattern.factory;

import java.util.List;

public class FactoryDesignPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductItemDetailsProvider instance = POProviderFactory.getInstance("DMSs");
		List<PODetails> poItemDetails = instance.getPoItemDetails();
		System.out.println("Po Details:"+poItemDetails);
		
	}

}
