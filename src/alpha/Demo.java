package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("debugging the flow");
		log.info("Logging the general flow info");
		log.error("Printing the error logs in flow");
		log.fatal("printing severe errors");
		
		System.out.println("Update by the original user");
		log.info("update log by original");
	}

}
