package edu.frcc.csc1061j.LoggingWithLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App
{
	protected static final Logger logger = LogManager.getLogger();
    public static void main( String[] args )
    {
        logger.info("Hello World");
        logger.warn("Hello Debug");
        logger.info("oh no");
        
        int[] arr = new int[5];
        try {
        	arr[6] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) {
        	logger.error("oopsie ",e);
        	logger.catching(e);
        }
    }
}
