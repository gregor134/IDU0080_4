package logging;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class BusinessLogger {
	
	private static Logger logger;
	
	private BusinessLogger() {
		logger = Logger.getLogger(BusinessLogger.class.getName());
		try {
			FileHandler fileHandler = new FileHandler("bprocess_log.txt");
			fileHandler.setFormatter(new VerySimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Logger getLogger() {
	    if(logger == null){
	        new BusinessLogger();
	    }
	    return logger;
	}
	
	public static void log(String msg) {
	    getLogger().log(Level.INFO, msg);
	    System.out.println(msg);
	}
	
	class VerySimpleFormatter extends Formatter {

	    private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

	    @Override
	    public String format(LogRecord record) {
	    	String newline = System.getProperty("line.separator");
	        return String.format(
	                "%1$s %2$-7s %3$s" + newline,
	                new SimpleDateFormat(PATTERN).format(
	                        new Date(record.getMillis())),
	                record.getLevel().getName(), formatMessage(record));
	    }
	}
}
