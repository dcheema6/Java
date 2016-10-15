package intermediateLevel;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;//GUI Panel

public class L2SimplePanel {
//Simple Panel and input
	public static void main(String[] args) {
		
		String f = JOptionPane.showInputDialog("Enter first number");//Panel input
		String s = JOptionPane.showInputDialog("Enter secong number");
		String o = JOptionPane.showInputDialog("Chose an operation\n+\n-\n/\n*");
		
		double one = Integer.parseInt(f);//String to int
		double two = Integer.parseInt(s);
		double Sum;
		switch (o){
			case "+":
				Sum = one + two;
				break;
			case "-":
				Sum = one - two;
				break;
			case "*":
				Sum = one * two;
				break;
			case "/":
				Sum = one / two;
				break;
			default :
				JOptionPane.showMessageDialog(null, "Unkown User Input","Error",JOptionPane.PLAIN_MESSAGE);
				return;
		}
		DecimalFormat NF = new DecimalFormat("#.00");//Limiting decimal places
		
		JOptionPane.showMessageDialog(null, "Answer is " +NF.format(Sum), "Answer",JOptionPane.PLAIN_MESSAGE);
	    //Displaying message in panel(Position on screen, Message, Title, Icon display)
	}
}
