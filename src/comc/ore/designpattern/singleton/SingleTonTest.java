package comc.ore.designpattern.singleton;

import java.lang.reflect.InvocationTargetException;

public class SingleTonTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Singleton obj = new Singleton(); Can't Create Object For Private Constructor
		
		Singleton singleton = Singleton.getInstance();
		System.out.println("Singleton  class address:"+singleton);
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("Singleton2 class address:"+singleton2);
		
		
		
	}

}
