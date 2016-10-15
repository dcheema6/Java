
public class Lesson08c1ThisConsOverloading {

	public static void main(String[] args) {
		Lesson08c2 Obj = new Lesson08c2();
		System.out.println(Obj.getMilatryTime());
		Obj.setTime(17,30,0);
		System.out.println(Obj.getRegTime());
		
		Obj.setThiTime(5, 5, 4);
		System.out.println(Obj.getRegTime());
		System.out.println(Obj.getMilatryTime());
		
		//Next Step Using constructor overloading
		Lesson08c2 Obj1 = new Lesson08c2(1);
		Lesson08c2 Obj2 = new Lesson08c2(1,2);
		Lesson08c2 Obj3 = new Lesson08c2(1,2,3);
		System.out.println(Obj1.getMilatryTime());
		System.out.println(Obj2.getMilatryTime());
		System.out.println(Obj3.getMilatryTime());
	}
}
