
public enum Lesson10c2 {
	Davin("Great",20),
	Jass("Beautiful",19),
	Dad("Wise", 50),
	Mom("Lovely", 50),
	Raj("Nice", 25),
	Aman("Cute",27);//Creating Objects with bound arguments
	
	private final String desc;//Creating unchangeable variable to store Object's arguments
	private final int age;
	
	Lesson10c2(String d, int a){//Constructor for the created Objects
		desc = d;
		age = a;
	}
	
	public String getInfo(){//Getting info of the Objects
		return String.format(" is %s and %s year old", desc, age);
	}
}
