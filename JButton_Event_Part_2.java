import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Button_Event extends JFrame implements ActionListener{
	
	Container c;
	JButton button1,button2,button3;
	
	Button_Event(){
		
		c=this.getContentPane();
		c.setLayout(null);
		
		button1=new JButton("Green");
		button1.setBounds(100,100,100,30);
		c.add(button1);
		
		button2=new JButton("Yellow");
		button2.setBounds(100,150,100,30);
		c.add(button2);
		
		button3=new JButton("Pink");
		button3.setBounds(100,200,100,30);
		c.add(button3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button1){
			c.setBackground(Color.GREEN);
	}
	if(e.getSource() == button2){
			c.setBackground(Color.YELLOW);
	}
	if(e.getSource() == button3){
			c.setBackground(Color.PINK);
	}
}
}
public class JButton_Event_Part_2{
	public static void main(String args []){
		
		Button_Event be=new Button_Event();
		
		be.setTitle("Button Event 1");
		be.setSize(500,500);
		be.setLocation(100,100);
		be.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		be.setVisible(true);
	}
}