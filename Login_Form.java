import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener{
	
	JLabel userName;
	JLabel pass;
	
	JTextField UserName;
	JPasswordField passwordField;
	
	JButton login;
	
	Container c;
	Login(){
		setTitle("LoginForm");
		
		setSize(400,400);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		c=getContentPane();
		c.setLayout(null);
		
		userName=new JLabel("Username");
		pass=new JLabel("Password");
		
		userName.setBounds(10,50,100,30);
		pass.setBounds(10,100,100,30);
		
		c.add(userName);
		c.add(pass);
		
		UserName=new JTextField();
		UserName.setBounds(120,50,100,30);
		
		passwordField=new JPasswordField();
		passwordField.setBounds(120,100,100,30);
		
		c.add(UserName);
		c.add(passwordField);
		
		login=new JButton("Login");
		login.setBounds(100,200,70,20);
		c.add(login);
		
		login.addActionListener(this);
		
		
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("UserName : " +UserName.getText());
		System.out.println("Password : " +passwordField.getText());
		
	}
}

public class Login_Form{
	public static void main(String args[]){
		
		Login l=new Login();
		
	}
}