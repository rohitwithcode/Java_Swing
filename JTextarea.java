import javax.swing.*;
import java.awt.*;

public class JTextarea{
public static void main(String args []){
	
		JFrame frame=new JFrame("TextArea");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,600,600);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GREEN);
		
		JTextArea ta=new JTextArea();
		ta.setBounds(100,100,400,400);
		c.add(ta);
		
		ta.setText("This is Textarea");
		ta.setFont(new Font("Arial",Font.BOLD,20));
		//ta.setEditable(false);
		
		ta.setLineWrap(true);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
}