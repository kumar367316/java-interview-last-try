package comc.ore.designpattern.singleton;

public class SingletonLogger {
	private static Logger instance ;

	private SingletonLogger() {
	}

	public static Logger SingletonLogger() {
    if(instance == null) {
       
    	synchronized(SingletonLogger.class) {
    		 if(instance == null) {
    			 instance = new Logger();
    		 }
    	}
    }

    return instance;
  }
}