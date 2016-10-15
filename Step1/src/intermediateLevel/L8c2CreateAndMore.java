package intermediateLevel;

/*try and catch is called exception handling that is required here is case file is not found or
 * file can't be created. It can used for multiple things ex- In calculators to prevent different
 * types of errors made that user can make instead of typing various do while loops*/

import java.util.Formatter;
import java.util.Scanner;
import java.io.*;

public class L8c2CreateAndMore {
	private Formatter x;
	private Scanner scan;//Step2
	
	public void createFile(){
		try{
		x = new Formatter("NewTxtFile.txt");
		System.out.println("File created successfully");
		}
		catch(Exception e){
			System.out.println("Error creating file");
		}
	}
	
	public void addText(){
		x.format("This is Text%nMore%nMore", "");//use %n to create new lines
	}
	
	public void closeFile(){
		x.close();//Good practice to close the file in case OS doesn't to avoid errors
	}
	
	//Step2
	
	public void readFile(String str){
		String res;
		while(scan.hasNextLine()){
		res = scan.nextLine();
		
		}
	}
	
	public void openNewFile(String path){
		try{
			scan = new Scanner(new File(path));
		}
		catch(Exception e){
			System.out.println("Error File not found");
		}
	}

	
	public void closeNewFile(){
		scan.close();//Good practice to close the file in case OS doesn't to avoid errors
	}
	
}
