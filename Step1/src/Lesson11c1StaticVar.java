
public class Lesson11c1StaticVar {

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		Lesson11c2 M1 = new Lesson11c2("Meghan","Fox");
		Lesson11c2 M2 = new Lesson11c2("Davin","Cheema");
		Lesson11c2 M3 = new Lesson11c2("Cheema","Family");
		
		System.out.println(M1.getMembers());//usual syntax to call a method from an object
		System.out.println(Lesson11c2.getMembers());//Static method is accessible by class itself
	}
}
