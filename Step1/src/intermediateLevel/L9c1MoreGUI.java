package intermediateLevel;

import javax.swing.*;

public class L9c1MoreGUI {

	public static void main(String[] args) {
		
		/*L9c2MoreLayout Obj1 = new L9c2MoreLayout();
		Obj1.setVisible(true);
		Obj1.setSize(300,100);
		*/
		JFrame frame = new JFrame("Graphics");//Giving it a new Frame to put the Panel in
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		L9c3IntroGraphics Obj2 = new L9c3IntroGraphics();
		frame.add(Obj2);
		frame.setSize(300, 200);
		frame.setVisible(true);
		
		
		
	    
	}

}
