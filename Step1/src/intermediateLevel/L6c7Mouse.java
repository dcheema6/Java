package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L6c7Mouse extends JFrame {
	private JPanel MP;
	private JLabel statbar;
	
	public L6c7Mouse(){
		super("Mouse Panel");
		
		MP = new JPanel();
		MP.setBackground(Color.WHITE);
		add(MP, BorderLayout.CENTER);
		
		statbar = new JLabel("Default");
		add(statbar, BorderLayout.NORTH);
		
		handler Han = new handler();
		MP.addMouseListener(Han);
		MP.addMouseMotionListener(Han);
	}
	
	private class handler implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			statbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
		}
		public void mousePressed(MouseEvent event){
			statbar.setText("Mouse button pressed");
		}
		public void mouseReleased(MouseEvent event){
			statbar.setText("Mouse button released");
		}
		public void mouseEntered(MouseEvent event){
			statbar.setText("Cursor is on the Panel");
			MP.setBackground(Color.GREEN);
		}
		public void mouseExited(MouseEvent event){
			statbar.setText("Cousor has exited the Panel");
			MP.setBackground(Color.WHITE);
		}
		//MouseMotionEvents Below
		public void mouseDragged(MouseEvent e) {
			statbar.setText("Coursor is being dragged");
		}
		public void mouseMoved(MouseEvent e) {
			statbar.setText("Coursor is being moved");
		}
	}
}
