
public class Lesson09c3 {
	private String name;
	private Lesson09c2 Birthday;
	
	public Lesson09c3(String Name, Lesson09c2 BD){
		name = Name;
		Birthday = BD;
	}
	
	public String toString(){
		return String.format("Your name is %s\nYour birthday is %s", name, Birthday);
	}
}
