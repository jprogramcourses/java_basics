package JavaSE_12_Exceptions.logger;

import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class PractLoggingApi {

    private static Logger logger = Logger.getLogger(JavaSE_12_Exceptions.logger.PractLoggingApi.class.getName());

    private static LogManager lm = LogManager.getLogManager();

    private static Enumeration<String> nameEnum = lm.getLoggerNames();

    public static void pruebaLogger() {

	try {

	} catch (Exception e) {
	    logger.log(Level.SEVERE, "Severe message", e);
	}

	logger.log(Level.INFO, "Info message");
	logger.info("Info message type 2");
    }

    public static void printLoggerNames() {
	nameEnum.asIterator().forEachRemaining(n -> System.out.println(n));

//	System.out.println("Retrieve using while");
//	while (nameEnum.hasMoreElements()) {
//	    String loggerName = nameEnum.nextElement();
//	    System.out.println("Logger name: " + loggerName);
//	    Logger lgr = Logger.getLogger(loggerName);
//	}
    }

}
