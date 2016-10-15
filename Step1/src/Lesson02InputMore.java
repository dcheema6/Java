import java.util.Scanner; // To take user input
public class Lesson02InputMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fnum, snum, ans = 0;
		
		Scanner Davin = new Scanner(System.in);
	     
		System.out.println("Enter First Num: ");
		fnum = Davin.nextDouble();//.nextDouble() takes user input as double
		
		 System.out.println("Enter 2nd Num: ");
		 snum = Davin.nextDouble(); 
		 
		 Scanner D = new Scanner(System.in);//you cant use same scanner variable with
		                                    // different types of input ex. int & char
		 System.out.println("Enter your choice:\na) 1st/2nd \nb) *\nc) +\nd) 1st - 2nd");
		 String str = D.nextLine();
		 
		 switch (str){
		 case "a": ans = fnum/snum;
		 break;
		 case "b": ans = fnum*snum;
		 break;
		 case "c": ans = snum+fnum;
		 break;
		 case "d": ans = fnum-snum;
		 break;
		 default: System.out.println("Error");
	}
		System.out.println(ans);
		Davin.close();
		D.close();
	}
}