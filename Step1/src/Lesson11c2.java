
public class Lesson11c2 {
	private String first;
	private String last;//These variables as we know is unique to an object
	private static int member = 0;//This variable is shared by all objects
	
	Lesson11c2(String fn, String ln){
		first = fn;
		last = ln;
		member++;
		System.out.printf("Welcome %s %s to famous club, total members: %d\n", first, last, member);
	}
	public static int getMembers(){//Static method only returns static variables
		return member;
	}
}
