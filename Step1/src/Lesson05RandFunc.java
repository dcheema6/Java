//Random generator function
import java.util.Random;

public class Lesson05RandFunc {
	public static void main(String arg[]){
		Random dice = new Random();//Declaring an Random obj
		int Num;
		for(int i=0; i<10; i++){
			Num = dice.nextInt(6)+1; // Initializing the varable iwth Random number
			System.out.println(Num);// putting a number bet() provides range on generated numbers
		}
	}
}
