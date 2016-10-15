//Program is similar to classes in C++

import java.util.Scanner;
public class Lesson04c1ClassesMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Lesson04c2 ClassObject = new Lesson04c2();
        
        //System.out.println("Enter your name: ");
        //String name = input.nextLine();
        //ClassObject.simpleMessage(name);
        
		System.out.println("Enter name of first GF here: ");
		String temp = input.nextLine();
		ClassObject.setName(temp);
		ClassObject.saying();
		input.close();
	}
}
/*TO call any math functions syntax is : Math.func()
List of some of the math functions:
pow(), min(), max(), abs(), sqrt(), ceil(), floor() */