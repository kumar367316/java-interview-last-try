package comc.ore.designpattern.factory;

import java.util.LinkedList;
import java.util.List;

public class DmsProvider extends ProductItemDetailsProvider{

	@Override
	List<PODetails> getPoItemDetails() {
		
		List<PODetails> poDetailsList = new LinkedList<>();
		PODetails poDetail = new PODetails();
		poDetail.setPoNbr(1000989);
		poDetail.setItemNbr(568420);
		poDetail.setPoType("DMS");
		
		poDetailsList.add(poDetail);
		
		return poDetailsList;
	}
}
