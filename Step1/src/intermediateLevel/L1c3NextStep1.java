package intermediateLevel;

public class L1c3NextStep1 extends L1c1Polymorphism {
	a=1;
	public void ME(L1c2Cronos bg){
		//We can pass Cronos plus it's sub classes objects as the inherits
		//everything from Cronos
		bg.Info();
	}
	//NextStep2
	private L1c2Cronos AllShips[] = new L1c2Cronos[5];
	private int i;
	//both ship classes inherit from Cronos therefore this array can be used to
	//hold multiple types of objects using classes
	void add(L1c2Cronos AS){
		if(i < AllShips.length){
			AllShips[i] = AS;
			System.out.println("Object added at index " + i);
			i++;
		}
	}
}
