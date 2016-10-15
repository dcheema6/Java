package intermediateLevel;

import java.awt.FlowLayout;//imports operating system's layout
import javax.swing.JFrame;//import OS features(minimize, maximize etc.)
import javax.swing.JLabel;//add text and images to panel

@SuppressWarnings("serial")
public class L3c2 extends JFrame {
	private JLabel Item;
	
	public L3c2(){
		super("Title for Title Bar");//Title bar, this is a constructor
		setLayout(new FlowLayout());//Gives a default layout
		
		Item = new JLabel("Fuck");
		Item.setToolTipText("OFF");//Run it u will see it hovering over "Fuck"
		
		add (Item);
	}
}