package prog.custom.interfaces;

import java.io.File;

public interface IBaseFileProperty {
	
	final String DEFAULT_OUTPUT_LOCATION = System.getProperty("user.dir");
	final File DEFAULT_FILEOUTPUT_INSTANCE = new File(DEFAULT_OUTPUT_LOCATION);
	
	void setFile(String name);
	void setFile(File sourceFile);
	File getFile();
	String getUserDefaultLocation();
	File getUserFileDefaultLocation();
	
}
