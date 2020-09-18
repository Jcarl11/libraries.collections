package prog.custom.logback.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.filter.ThresholdFilter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.encoder.Encoder;
import prog.custom.interfaces.IBasicCoreConsoleLogging;

public class CoreLogger implements IBasicCoreConsoleLogging {

	public static final String QUALIFIER = CoreLogger.class.toString();
	
	private LoggerContext loggerCtx = (LoggerContext) LoggerFactory.getILoggerFactory();
	private Logger rootLogger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
	
	public void setConsoleAppender(ConsoleAppender<ILoggingEvent> consoleAppender) {
				
	}
	public ConsoleAppender<ILoggingEvent> getAppender() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFilter(ThresholdFilter thresholdFilter) {
		// TODO Auto-generated method stub
		
	}
	public ThresholdFilter getFilter() {
		// TODO Auto-generated method stub
		return null;
	}


}
