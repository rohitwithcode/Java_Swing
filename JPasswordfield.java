import javax.swing.*;
import java.awt.*;

public class JPasswordfield{
	public static void main(String args []){
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,400,400);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JPasswordField password=new JPasswordField();
		password.setBounds(100,50,120,40);
		c.add(password);
		
		password.setText("12345678");
		password.setFont(new Font("Arial",Font.BOLD,20));
		
		password.setForeground(Color.RED);
		password.setBackground(Color.YELLOW);
		
		password.setEchoChar('*');
		password.setEchoChar((char)0);
		
		//frame.setEditable(false);
		frame.setVisible(true);
	}
}