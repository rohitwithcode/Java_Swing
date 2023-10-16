import javax.swing.*;
import java.awt.*;

public class Jtextfield{
	public static void main(String args []){
		
		JFrame frame=new JFrame("My Frame");
		frame.setBounds(100,100,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JTextField t=new JTextField();
		t.setBounds(100,50,100,30);
		c.add(t);
		
		t.setText("RohitCoder");
		
		Font font=new Font("Arial",Font.BOLD,15);
		t.setFont(font);
		
		t.setBackground(Color.YELLOW);
		t.setForeground(Color.GREEN);

		t.setEditable(false);
		
		frame.setVisible(true);
	}
}
