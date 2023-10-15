import javax.swing.*;
import java.awt.*;

public class Label{
	public static void main(String args []){
		
		JFrame frame=new JFrame("My Frame");
		frame.setBounds(100,100,400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JLabel label=new JLabel("UserName");
		label.setBounds(50,50,100,20);
		
		//lable.setText("Password");
		
		Font font=new Font("Arial",Font.ITALIC,20);
		label.setFont(font);
		c.add(label);
		
	}
}