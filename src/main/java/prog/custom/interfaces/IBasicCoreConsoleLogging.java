package prog.custom.interfaces;

import ch.qos.logback.classic.filter.ThresholdFilter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

public interface IBasicCoreConsoleLogging {
		
	void setConsoleAppender(ConsoleAppender<ILoggingEvent> consoleAppender);
	ConsoleAppender<ILoggingEvent> getAppender();
	void setFilter(ThresholdFilter thresholdFilter);
	ThresholdFilter getFilter();
	
}
