
public class Lesson04c2 {
	
        public void simpleMessage(String name)//anything in () is called argument
       {
	    System.out.println("Hello " + name);// New syntax
       }
    	private String girlName;
    	
    	public void setName(String name){
    		girlName = name;
    	}
    	public String getName(){
    		return girlName;
    	}
    	public void saying(){
    		System.out.printf("Your first girlfriend was %s", getName());
    	}//New way of printing strings, %s prints the string argument
}
