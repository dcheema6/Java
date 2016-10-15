package intermediateLevel;

import java.util.Scanner;;

public class L8c1Files {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		L8c2CreateAndMore One = new L8c2CreateAndMore();
		//One.createFile();
		//One.addText();
		//One.closeFile();
		//Step2
		str = sc.nextLine();
		
		One.openNewFile("C:\\Users\\Davinderpal\\workspace\\Step1\\words.txt");
		One.readFile(str);
		One.closeNewFile();
	}
}
