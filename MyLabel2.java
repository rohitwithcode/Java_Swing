import javax.swing.*;
import java.awt.*;

class MyLabel2{
	public static void main(String args []){
		
		JFrame frame=new JFrame("My Frame");
		frame.setBounds(100,100,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
				
		/*ImageIcon icon=new ImageIcon("Java_Image.JPG");
		Label label=new Label(icon);
		
		label.setBounds(100,50,200,50);
		c.add(label);*/
		
		ImageIcon icon1=new ImageIcon("Java_Image.JPG");
		JLabel label=new JLabel("Java",icon1,JLabel.LEFT);
		label.setBounds(0,100,500,100);
		c.add(label);
		 
		frame.setVisible(true);
	}
}