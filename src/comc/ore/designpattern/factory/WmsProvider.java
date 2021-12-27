package comc.ore.designpattern.factory;

import java.util.LinkedList;
import java.util.List;

public class WmsProvider extends ProductItemDetailsProvider{

	@Override
	List<PODetails> getPoItemDetails() {
		
		List<PODetails> poDetailsList = new LinkedList<>();
		PODetails poDetail = new PODetails();
		poDetail.setPoNbr(5478220);
		poDetail.setItemNbr(8952432);
		poDetail.setPoType("WMS");
		
		poDetailsList.add(poDetail);
		
		return poDetailsList;
	}
}