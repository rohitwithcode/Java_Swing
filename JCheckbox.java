import javax.swing.*;
import java.awt.*;

public class JCheckbox{
	public static void main(String args []){
		
		JFrame frame=new JFrame("TextArea");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,300);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GREEN);
		
		JCheckBox hs=new JCheckBox("High School");
		hs.setBounds(10,40,100,20);
		c.add(hs);
		
		JCheckBox inter=new JCheckBox("Intermediate");
		inter.setBounds(120,40,100,20);
		c.add(inter);
		
		JCheckBox graduation=new JCheckBox("Graduation");
		graduation.setBounds(230,40,100,20);
		c.add(graduation);
		
		JCheckBox postGraduation=new JCheckBox("Post-Graduation");
		postGraduation.setBounds(340,40,120,20);
		c.add(postGraduation);
		
		hs.setSelected(true);
		
		Font font=new Font("Arial",Font.BOLD,10);
		
		hs.setFont(font);
		inter.setFont(font);
		graduation.setFont(font);
		postGraduation.setFont(font);
		
		postGraduation.setEnabled(false); 
		
		frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
}