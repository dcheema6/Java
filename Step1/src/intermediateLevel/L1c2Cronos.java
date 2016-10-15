package intermediateLevel;

public class L1c2Cronos {
	//NS1 To construct an abstract class we actually need to use the given syntax
	//public abstract class *class name*{*body*}: it is not directly accessible
	protected int fuel, milage, range;
	protected String ship;
	
	void Info(){}
	//NS1 abstract function or so called pure virtual func in C++
	//Syntax: abstract void *func name*();
	public String getMilage(){
		milage = fuel/range;
		return String.format("%s has a range of %d space units", ship, range);
	}
}
