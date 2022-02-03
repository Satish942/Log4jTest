package Sample.Log4jProject;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class TestLog4j {
	private static final Logger logger = LogManager.getLogger(TestLog4j.class); 

	public static void main(String[] args) {
		logger.error("My first Log Message");
		logger.info("My first Log Message");
		logger.debug("My first Log Message");
		logger.warn("My first Log Message");
	}

}
