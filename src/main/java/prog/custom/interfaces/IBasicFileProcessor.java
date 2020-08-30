package prog.custom.interfaces;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

public interface IBasicFileProcessor {

	final String DEFAULT_OUTPUT_LOCATION = System.getProperty("user.dir");
	final File DEFAULT_FILEOUTPUT_INSTANCE = new File(DEFAULT_OUTPUT_LOCATION);

	void writeToFile(String content, boolean append, String delimiter);
	void writeToFile(Collection<Object> list, boolean append, String delimiter);
	List<String> readFromFile(File source);
	InputStream readFromFileStream(File source);
	void setFile(String name);
	void setFile(File sourceFile);
	void setAppend(boolean append);
	void setDelimiter(String delimiter);
	void setPerLine(boolean perLine);
	boolean isPerLine();
	File getFile();
	boolean isContentAppended();
	String getDelimiter();
	String getUserDefaultLocation();
	File getUserFileDefaultLocation();

}
