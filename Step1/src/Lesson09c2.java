
public class Lesson09c2 {
	
	private int date, month, year;
	
	public Lesson09c2(int m, int d, int y){
		date = d; month = m; year = y;
		System.out.printf("Constructor is %s\n", this);
	}//using *this* here refers to the toString function which is obviously String function
	
	public String toString(){//toString is a special function, Whenever Object of this class requires a
		return String.format("%02d/%02d/%04d", month, date, year);//string it refers to this function
	}
}
