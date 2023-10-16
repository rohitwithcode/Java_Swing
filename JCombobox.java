import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCombobox {
	public static void main(String args []){
		
		JFrame frame=new JFrame("JComboBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBounds(100,100,500,300);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		//c.setBackground(Color.GREEN);
		
		String [] str1={"","A","B","C","D","C","C"};
		
		JComboBox c1=new JComboBox(str1);
		c1.setBounds(100,20,100,30);
		c.add(c1);
		
		//c1.setEditable(true);
		
		//c1.setSelectedItem("C");
		
		c1.setSelectedIndex(2);
		
		//c1.setFont(new Font("Arial",Font.ITALIC,15);
		Font font=new Font("Arial",Font.BOLD,15);
		c1.setFont(font);
		
		JLabel lable=new JLabel("SelectedItem");
		lable.setBounds(250,20,100,20);
		c.add(lable);
		
		JButton btn=new JButton("Click");
		btn.setBounds(100,150,80,30);
		c.add(btn);
		
		c1.addItem("E");
		c1.removeItem("C");
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String item=(String)c1.getSelectedItem();
				lable.setText("SelectedItem : "+item);
			}
		});
		
		
		
		frame.setVisible(true);
	}
}