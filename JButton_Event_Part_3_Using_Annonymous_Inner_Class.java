import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButton_Event_Part_3_Using_Annonymous_Inner_Class{
	public static void main(String args []){
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,400,400);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JButton button=new JButton("Red");
		button.setBounds(100,100,100,40);
		c.add(button);
		
		button.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.RED);
			}
		});
		
		frame.setVisible(true);
	}
}