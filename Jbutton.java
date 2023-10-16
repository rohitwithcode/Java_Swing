import javax.swing.*;
import java.awt.*;

public class Jbutton{
	public static void main(String args []){
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,2000,2000);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		
		//JButton button=new JButton("Click Me");
		//button.setSize(200,30);
		//button.setLocation(100,100);
		//c.add(button);
		
		//Font font=new Font("Arial",Font.BOLD,15);
		//button.setFont(font);
		//button.setText("MyButton");
		
		//button.setForeground(Color.RED);
		//button.setBackground(Color.GREEN);
		
		//Cursor cursor=new Cursor(Cursor.CROSSHAIR_CURSOR);
		//button.setCursor(cursor);
		
		//Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		//button.setCursor(cursor);
		
		//Cursor cursor=new Cursor(Cursor.WAIT_CURSOR);
		//button.setCursor(cursor);
		
		//button.setEnabled(false);
		//button.setVisible(false);
		
		ImageIcon icon=new ImageIcon("JavaImage");
		
		JButton button=new JButton(icon);
		button.setSize(100,50);
		//button.setSize(icon.getIconWidth(),icon.getIconHeight());
		button.setLocation(100,100);
		c.add(button);
		

		frame.setVisible(true);
		
	}
}