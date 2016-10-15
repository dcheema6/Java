package intermediateLevel;

import java.io.File;

public class L7FilesIntro {

	public static void main(String[] args) {
		
		File x = new File("C:\\BR.html");
		
		if(x.exists()) System.out.println(x.getName()+" exists.");
		else System.out.println("This path/file does not exist");

	}

}
