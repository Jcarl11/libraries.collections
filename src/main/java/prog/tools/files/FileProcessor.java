/**
 * 
 */
package prog.tools.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import prog.custom.interfaces.IBasicFileProcessor;

/**
 * @author Joey Francisco
 *
 */
public class FileProcessor implements IBasicFileProcessor {

	private Logger logger = LoggerFactory.getLogger(FileProcessor.class);
	private File currentFileOutputInstance = null;
	private String userOutputLocation = null;
	protected boolean append = true;
	protected String delimiter = "";

	public FileProcessor() {
		logger.trace("Inside file processor");
		userOutputLocation = DEFAULT_OUTPUT_LOCATION;
		currentFileOutputInstance = DEFAULT_FILEOUTPUT_INSTANCE;
	}

	public FileProcessor( File sourceFile ) {
		logger.trace("Inside file processor");
		if (!sourceFile.exists()) {
			this.currentFileOutputInstance = sourceFile;
		} else {
			logger.error("Path/File doesn't exist!");
		}
	}

	public FileProcessor( String fileLocation ) {
		logger.trace("Inside file processor");
		try {
			if (!fileLocation.isEmpty() && new File(fileLocation).exists()) {
				logger.info("Setting output location to: {}", fileLocation);
				this.userOutputLocation = fileLocation;
			}
		} catch (NullPointerException npe) {
			logger.error(npe.getMessage(), npe);
		}
	}

	public void writeToFile(String content, boolean append, String delimiter) {
		logger.trace("Inside writeToFile");
		if (content.isEmpty()) {
			logger.warn("Content to write is empty..cancelling operation");
			return;
		}
		this.append = append;
		this.delimiter = delimiter;
		FileWriter fileWriter = null;
		StringBuilder stringBuilder = new StringBuilder();
		try {
			fileWriter = new FileWriter(userOutputLocation, this.append);
			stringBuilder.append(content);
			stringBuilder.append(this.delimiter);
			fileWriter.write(stringBuilder.toString());
		} catch (FileNotFoundException fnfe) {
			logger.error(fnfe.getMessage(), fnfe);
		} catch (SecurityException se) {
			logger.error(se.getMessage(), se);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
		}
	}

	public void writeToFile(Collection<Object> list, boolean append, String delimiter) {
		logger.trace("Inside writeToFile");
		if (list.size() <= 0) {
			logger.warn("List size is 0!...cancelling operation");
			return;
		}
		logger.debug("List size: {}", list.size());
		this.delimiter = delimiter;
		this.append = append;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(userOutputLocation, this.append);
			
		} catch (IOException ioe) {
			logger.error(ioe.getMessage(), ioe);
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
		}
	}

	public List<String> readFromFile(File source) throws SecurityException {
		logger.trace("Inside readFromFile");
		if(!source.exists()) {
			logger.error("File doesn't exist!");
			return null;
		}
		
		
		
		
		return null;
	}

	public InputStream readFromFileStream(File source) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFile(String name) {
		// TODO Auto-generated method stub
	}

	public void setFile(File sourceFile) {
		// TODO Auto-generated method stub
	}

	public void setAppend(boolean append) {
		// TODO Auto-generated method stub
	}

	public void setDelimiter(String delimiter) {
		// TODO Auto-generated method stub
	}

	public void setPerLine(boolean perLine) {
		// TODO Auto-generated method stub
	}

	public boolean isPerLine() {
		// TODO Auto-generated method stub
		return false;
	}

	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isContentAppended() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getDelimiter() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserDefaultLocation() {
		return DEFAULT_OUTPUT_LOCATION;
	}

	public File getUserFileDefaultLocation() {
		return DEFAULT_FILEOUTPUT_INSTANCE;
	}

}
