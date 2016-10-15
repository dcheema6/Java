package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L9c2MoreLayout extends JFrame {
	private JButton lb;
	private JButton rb;
	private JButton cb;
	private FlowLayout lay;
	private Container cont;
	
	public L9c2MoreLayout(){
		super("Custom Layout Modifier");
		lay = new FlowLayout();
		cont = getContentPane();
		setLayout(lay);
		
		lb = new JButton("Left");
		rb = new JButton("Right");
		cb = new JButton("Center");
		add(lb);
		add(cb);
		add(rb);
		
		lb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lay.setAlignment(FlowLayout.LEFT);
				lay.layoutContainer(cont);
			}
		});
		rb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lay.setAlignment(FlowLayout.RIGHT);
				lay.layoutContainer(cont);
			}
		});
		cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				lay.setAlignment(FlowLayout.CENTER);
				lay.layoutContainer(cont);
			}
		});
	}
}
