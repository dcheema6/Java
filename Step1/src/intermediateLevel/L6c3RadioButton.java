package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L6c3RadioButton extends JFrame {
	
	private JTextField txt;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup BG;
	
	public L6c3RadioButton(){
		super("Radio Buttons");
		setLayout(new FlowLayout());
		
		txt = new JTextField("Davin is Awsome", 20);
		txt.setEditable(false);
		
		add(txt);
		
		pb = new JRadioButton("Plain", true);
		bb = new JRadioButton("Bold", false);
		ib = new JRadioButton("Italic", false);
		bib = new JRadioButton("Bold and Italic", false);
		
		BG = new ButtonGroup();
		
		BG.add(pb);
		BG.add(bb);
		BG.add(ib);
		BG.add(bib);
		
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
        pf = new Font("Ariel", Font.PLAIN, 16);
	    bf = new Font("Ariel", Font.BOLD, 16);
	    itf = new Font("Ariel", Font.ITALIC, 16);
	    bif = new Font("Ariel", Font.BOLD + Font.ITALIC, 16);
	    txt.setFont(pf);
	    
	    pb.addItemListener(new EH(pf));
	    bb.addItemListener(new EH(bf));
	    ib.addItemListener(new EH(itf));
	    bib.addItemListener(new EH(bif));
	}
	//A better way of writing this program
	//In my way you do not create font variables above and use the old method of if else
	//statements and getting event source in the below program
	private class EH implements ItemListener{
		
		private Font f;
		
		public EH(Font font){ 
			f = font;
			}
		
		public void itemStateChanged(ItemEvent event){
			txt.setFont(f);
		}
	}
}