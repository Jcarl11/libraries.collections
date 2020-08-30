package prog.tools.files;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileProcessorTest {
	
	private Logger logger = LoggerFactory.getLogger(FileProcessorTest.class);
	private FileProcessor fileProcessor = null;

	public FileProcessorTest() {
		fileProcessor = new FileProcessor();
	}

	@Test
	public void test() {
		String result = fileProcessor.getUserDefaultLocation();
		logger.debug("Test result for getUserDefaultLocation(): {}", result);
	}

}
