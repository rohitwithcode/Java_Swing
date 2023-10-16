import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Simple_Calculator extends JFrame implements ActionListener{
	
	JLabel firstNumber;
	JLabel secondNumber;
	JLabel result;
	JTextField firstnumber;
	JTextField secondnumber;
	JButton add;
	JButton subtitution;
	JButton multiplication;
	JButton divide;
	
	Container c;
	
	Simple_Calculator(){
		setTitle("Simple Calculator");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		firstNumber=new JLabel("Enter First Number");
		firstNumber.setBounds(10,10,150,30);
		c.add(firstNumber);
		firstnumber=new JTextField();
		firstnumber.setBounds(160,15,100,20);
		c.add(firstnumber);
		
		secondNumber=new JLabel("Enter Second Number");
		secondNumber.setBounds(10,40,150,30);
		c.add(secondNumber);
		secondnumber=new JTextField();
		secondnumber.setBounds(160,45,100,20);
		c.add(secondnumber);
		
		
		add=new JButton("+");
		add.setBounds(40,100,50,30);
		c.add(add);
		
		subtitution=new JButton("-");
		subtitution.setBounds(120,100,50,30);
		c.add(subtitution);
		
		multiplication=new JButton("X");
		multiplication.setBounds(200,100,50,30);
		c.add(multiplication);
		
		divide=new JButton("/");
		divide.setBounds(280,100,50,30);
		c.add(divide);
		
		result=new JLabel("Result : ");
		result.setBounds(10,150,250,20);
		c.add(result);
		
		add.addActionListener(this);
		subtitution.addActionListener(this);
		multiplication.addActionListener(this);
		divide.addActionListener(this);
		
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{
		
		if(e.getSource() == add){
			int a=Integer.parseInt(firstnumber.getText());
			int b=Integer.parseInt(secondnumber.getText());
			int c=a+b;
			result.setText("Result : " +c);
		}
		if(e.getSource() == subtitution){
			int a=Integer.parseInt(firstnumber.getText());
			int b=Integer.parseInt(secondnumber.getText());
			int c=a-b;
			result.setText("Result : " +c);
		}
		if(e.getSource() == multiplication){
			int a=Integer.parseInt(firstnumber.getText());
			int b=Integer.parseInt(secondnumber.getText());
			int c=a*b;
			result.setText("Result : " +c);
		}
		if(e.getSource() == divide){
			int a=Integer.parseInt(firstnumber.getText());
			float b=Integer.parseInt(secondnumber.getText());
			float c=a/b;
			result.setText("Result : " +c);
		}
		}catch(NumberFormatException e1){
			result.setText("Please Input integers only");
		}catch(ArithmeticException e2){
			result.setText("Can not divide with zero");
		}
	}
}

public class Calculator{
	public static void main(String args []){
		
		Simple_Calculator sc=new Simple_Calculator();
	}
}