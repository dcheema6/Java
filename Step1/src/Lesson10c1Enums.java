import java.util.EnumSet;//to use EnumSet.range()

public class Lesson10c1Enums {
	public static void main(String Arg[]){
		
		for(Lesson10c2 Life: Lesson10c2.values())
			//L10c2.values is special function that returns built in array
			System.out.printf("%s %s\n", Life, Life.getInfo());
		//of all the objects in enumeration
		
		//Next Step
		for(Lesson10c2 Life: EnumSet.range(Lesson10c2.Dad, Lesson10c2.Raj))
			//Syntax to run through specific range
			System.out.printf("%s %s\n",Life,Life.getInfo());	
	}
	//ClassName.Object refers to the String name of the Object
	 /*Objects can be treated like any other objects created from a sub class and can be modified
	   using setFunc() as long as the variables storing the arguments for objects are not *final*
	   i.e not constant*/
}
