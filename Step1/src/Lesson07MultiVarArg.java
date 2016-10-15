//passing multiple variable arguments to a class
public class Lesson07MultiVarArg {
	
	public static void main(String arg[]){
		System.out.println(prv(1,2,3,4,5));//prv() is a new func defined below
	}
	//New Func
	private static int prv(int...nums){//new syntax ...its like creating an array
		int num = 0;
		for(int x: nums){
		num += x;
		}
		return num/nums.length;
	}//End Func
}
