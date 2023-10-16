import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Button_Event extends JFrame implements ActionListener{
	
	Container c;
	JButton button;
	
	Button_Event(){
		
		c=this.getContentPane();
		c.setLayout(null);
		
		button=new JButton("Click me");
		button.setBounds(100,100,100,30);
		c.add(button);
		
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		c.setBackground(Color.GREEN);
	}
}

public class JButton_Event_1{
	public static void main(String args []){
		
		Button_Event be=new Button_Event();
		
		be.setTitle("Button Event 1");
		be.setSize(500,500);
		be.setLocation(100,100);
		be.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		be.setVisible(true);
	}
}