package log4jDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.relevantcodes.extentreports.model.Log;

public class Log4jDemo {

	final static Logger log= Logger.getLogger(Log4jDemo.class);
	// dif level og logging
	//Debug<Info<Warn<Error<Fatal	
	public static void main(String[] args) {
		PropertyConfigurator.configure("Log4j.properties");
		log.debug("cgfdfg");
		log.info("dasf");	
		
	}

}
