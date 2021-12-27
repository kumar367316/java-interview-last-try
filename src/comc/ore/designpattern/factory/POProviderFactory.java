package comc.ore.designpattern.factory;

import java.util.Objects;

public class POProviderFactory {
	
	public static ProductItemDetailsProvider getInstance(String serviceName) {
		
		if(Objects.isNull(serviceName)) {
			throw new InvalidDataException("service name should not be empty");
		}
		
		if(serviceName.equals("WMS"))
			return new WmsProvider();
		else if(serviceName.equals("DMS"))
			return new DmsProvider();
		else
			throw new InvalidDataException("this facility is not provided");
	}

}
