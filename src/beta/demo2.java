package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class demo2 {
	
	private static Logger log = LogManager.getLogger(demo2.class.getName());

	public static void main(String[] args) {
		
		log.debug("debugging the flow");
		log.info("Logging the general flow info");
		log.error("Printing the error logs in flow");
		log.fatal("printing severe errors");
	}

}
