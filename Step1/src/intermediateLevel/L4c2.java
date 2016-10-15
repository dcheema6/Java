package intermediateLevel;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;//Text will look like "*****"
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class L4c2 extends JFrame {
	
	private JTextField Obj1;
	private JTextField Obj2;
	private JTextField Obj3;
	private JPasswordField Pass;
	
	public L4c2(){//constructor function
		super("Event Handling");//This is a constructor
		setLayout(new FlowLayout());
		Obj1 = new JTextField(10);
		add(Obj1);
		Obj2 = new JTextField("enter text here");
		add(Obj2);
		Obj3 = new JTextField("uneditable",20);
		Obj3.setEditable(false);//Setting this field to be uneditable
		add(Obj3);
		Pass = new JPasswordField("pass",10);
		add(Pass);
		Handler Handle = new Handler();//Object for our Handler Class
		Obj1.addActionListener(Handle);//Binding Event Lister to Object
		Obj2.addActionListener(Handle);
		Obj3.addActionListener(Handle);
		Pass.addActionListener(Handle);
	}
	//By default pressing enter is Event or an action
	private class Handler implements ActionListener{
		public void actionPerformed(ActionEvent event){//actionPerformed is a built in
			String str = "";//method comes with ActionListener that is automatically
			//executed when an action is performed
			if(event.getSource()==Obj1)
				str = String.format("Field 1: %s", event.getActionCommand());
			//getActionCommand() returns string that is being held in the Object
			if(event.getSource()==Obj2)//get
				str = String.format("Field 2: %s", event.getActionCommand());
			if(event.getSource()==Obj3)
				str = String.format("Field 3: %s", event.getActionCommand());
			if(event.getSource()==Pass)
				str = String.format("Password: %s", event.getActionCommand());
	
			JOptionPane.showMessageDialog(null, str);
		}
	}
}
