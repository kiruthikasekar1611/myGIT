package javabasics;
import org.apache.commons.io.FilenameUtils;

public class LearnFindingFileExtension {

	public static void main(String[] args) {		
		String file1="D:/DOCS/form16-Part-A-CBXPK0541A_2016-17.pdf";		
		String ext=FilenameUtils.getExtension(file1);
		System.out.println(ext);
	}

}
