import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButton_Event_Part_4_Using_Another_Class{
	public static Container c;
	public static void main(String args []){
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,400,400);
		
		c=frame.getContentPane();
		c.setLayout(null);
		
		JButton Red=new JButton("Red");
		Red.setBounds(100,100,100,40);
		c.add(Red);
		
		JButton Yellow=new JButton("Yellow");
		Yellow.setBounds(100,150,100,40);
		c.add(Yellow);
		
		JButton Green=new JButton("Green");
		Green.setBounds(100,200,100,40);
		c.add(Green);
		
		
		Red.addActionListener(new RedClass());
		Green.addActionListener(new GreenClass());
		Yellow.addActionListener(new YellowClass());
		
		frame.setVisible(true);
	}
}
class RedClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton_Event_Part_4_Using_Another_Class.c.setBackground(Color.RED);
	}
}
class GreenClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton_Event_Part_4_Using_Another_Class.c.setBackground(Color.GREEN);
	}
}
class YellowClass implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton_Event_Part_4_Using_Another_Class.c.setBackground(Color.YELLOW);
	}
}