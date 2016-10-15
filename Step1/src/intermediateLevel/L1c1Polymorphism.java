package intermediateLevel;

public class L1c1Polymorphism extends L1c2Cronos {
	
	public static void main(String Arg[]) {
		
		L1c2Cronos Ships[] = new L1c2Cronos[2];
		
		Ships[0] = new L1s1();
		Ships[1] = new L1s2();//Array holfing different types of objects
		//Tip:Using Arrays and for loop to call same func and saving time
		for(int i=0; i<2; i++){
			Ships[i].Info();
		}
		System.out.println("Next Step 1");
		//NextStep1
		L1c3NextStep1 fav = new L1c3NextStep1();
		L1c2Cronos dav = new L1c2Cronos(); //use when this class is not abstract
		L1c2Cronos ran = new L1s1();//Or we can use L1s1 = new L1s1();
		
		fav.ME(dav); //use when dav is not abstract
		fav.ME(ran);
		System.out.println("Next Step 2");
		//NextStep2
		fav.add(ran);
		fav.add(Ships[1]);
		
	}
}
