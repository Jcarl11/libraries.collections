package prog.custom.interfaces;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

public interface IBasicFileProcessor extends IBaseFileProperty {

	void writeToFile(String content, boolean append, String delimiter);
	void writeToFile(Collection<Object> list, boolean append, String delimiter);
	List<String> readFromFile(File source);
	InputStream readFromFileStream(File source);
	void setAppend(boolean append);
	void setDelimiter(String delimiter);
	void setPerLine(boolean perLine);
	boolean isPerLine();
	boolean isContentAppended();
	String getDelimiter();
	
}
