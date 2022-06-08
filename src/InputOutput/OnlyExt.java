package InputOutput;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
	String ext;
	
	public OnlyExt(String text) {
		this.ext = "." + ext;
	}
	
	public boolean accept(File dir, String name) {
		return name.endsWith(ext);
	}
}
