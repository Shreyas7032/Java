import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Pass extends JFrame implements ItemListener //,ActionListener
{
	//Declaration
	JLabel l1,l2,l3;
	JComboBox cmb1,cmb2;
	JCheckBox ch1,ch2,ch3;
	JTextField t1;
	String s1;
	int n1;
	
	Pass()
	{
		super("TEJAS JADHAV");
		setTitle("Registration");
		setSize(500,500);
		setLocation(100,100);
		setLayout(null);
		
		//Memory Allocation
		l1=new JLabel("FONT"); l2=new JLabel("SIZE"); l3=new JLabel("STYLE");
		cmb1=new JComboBox();cmb2=new JComboBox();
		ch1=new JCheckBox("BOLD"); ch2=new JCheckBox("ITALIC"); ch3=new JCheckBox("PLAIN");
		cmb1.addItem("Arial");cmb1.addItem("Cambria");cmb1.addItem("Courier");cmb1.addItem("Gigi");
		cmb2.addItem("10");cmb2.addItem("15");cmb2.addItem("20");cmb2.addItem("25");
		t1=new JTextField();
		
		// f1=new Font("Arial",Font.BOLD,15);
		
	
		//ADD
		add(l1);add(l2);add(l3);
		add(cmb1);add(cmb2);
		add(ch1);add(ch2);add(ch3);
		add(t1);
		
		//SETBOUNDS
		l1.setBounds(80,80,100,30); cmb1.setBounds(80,120,100,30);
		l2.setBounds(80,170,100,30); cmb2.setBounds(80,210,100,30);
		l3.setBounds(200,80,100,30);
		ch1.setBounds(200,120,100,30);ch2.setBounds(200,170,100,30);ch3.setBounds(200,210,100,30);
		t1.setBounds(80,260,250,30);
		
		//Add Listeners
		cmb1.addItemListener(this);
		cmb2.addItemListener(this);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
		ch3.addItemListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		
		if(e.getSource()==cmb1 || e.getSource()==cmb2)
		{
			s1=""+cmb1.getSelectedItem();
			n1=Integer.parseInt(""+cmb2.getSelectedItem());
			t1.setFont(new Font(s1,Font.PLAIN,n1));
		}
		if(e.getSource()==ch1)
		{
			t1.setFont(new Font(s1,Font.BOLD,n1));
		}
		if(e.getSource()==ch2)
		{
			t1.setFont(new Font(s1,Font.ITALIC,n1));
		}
		if(e.getSource()==ch3)
		{
			t1.setFont(new Font(s1,Font.PLAIN,n1));
		}	
	}
}
class ass1seta1
{
	public static void main(String args[])
	{
		new Pass();
	}
}


