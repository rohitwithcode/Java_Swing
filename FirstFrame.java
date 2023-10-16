import javax.swing.*;
import java.awt.*;
public class FirstFrame{
	public static void main(String [] args){
		
		JFrame frame =new JFrame();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(400,400);
		//frame.setLocation(100,50);

		frame.setBounds(100,100,400,400);
		frame.setTitle("My First Frame");

		// ImageIcon icon=new ImageIcon("Path set");
		// frame.setIconImage(icon.Image());

		Conatainer c=frame.getContentPane();

		// Color color=new Color(255,0,0);

		c.setBackgroun(Color.RED);

		frame.setResizable(false);
		
}
}
