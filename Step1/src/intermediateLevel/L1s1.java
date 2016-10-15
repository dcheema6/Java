package intermediateLevel;

public class L1s1 extends L1c2Cronos {
	//This syntax lets this class inherit everything from desired class
	//which makes this class a subclass and other class a parent class
	L1s1(){
		ship = "Destiny Acension";
		fuel = 100000;
		range = 200;
	}
	
	void Info(){
		System.out.printf("This is %s\n",ship);
	}
}
