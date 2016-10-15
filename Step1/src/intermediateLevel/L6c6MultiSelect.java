package intermediateLevel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class L6c6MultiSelect extends JFrame {
	
	private JButton move;
	@SuppressWarnings("rawtypes")
	private JList left;
	@SuppressWarnings("rawtypes")
	private JList right;
	private static String [] opps = {"Engineering","Astronomy","Phsycology","Philosophy","Science"};
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public L6c6MultiSelect(){
		super("Multi Select");
		setLayout(new FlowLayout());
		
		left = new JList(opps);
		left.setVisibleRowCount(3);
		left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(left));
		
		move = new JButton("Move --->");
		move.addActionListener(
			new ActionListener(){
				@SuppressWarnings({ "deprecation" })
				public void actionPerformed(ActionEvent event){
					right.setListData(left.getSelectedValues());
				}
			}
		);
		add(move);
		right = new JList();
		right.setVisibleRowCount(3);
		right.setFixedCellHeight(15);
		right.setFixedCellWidth(100);
		add(new JScrollPane(right));
	}
}
