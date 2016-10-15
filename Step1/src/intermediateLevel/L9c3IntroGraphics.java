package intermediateLevel;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class L9c3IntroGraphics extends JPanel {//This Panel needs to put in a Frame to Run
	
	public void paintComponent(Graphics g){//This is built in function in JPanel
		
		super.paintComponent(g);//This is basically initialization for Panel just like
		this.setBackground(Color.CYAN);//super("Title") is for JFrame
		
		g.setColor(Color.RED);
		g.fillRect(30, 30, 100, 30);
		
		g.setColor(new Color(10,30,20));//new Color(R,G,B)
		g.fillRect(30, 80, 100, 30);
		
		g.setColor(Color.PINK);
		g.drawString("This is Graphics Bitchhh", 30, 130);
	}
}