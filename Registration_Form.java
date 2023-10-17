import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Registration extends JFrame implements ActionListener {
	JLabel Title;
	JLabel name;
	JLabel mobile;
	JLabel gender;
	JLabel dob;
	JLabel address;
	JTextField textName;
	JTextField textMobile;
	JRadioButton male,female;
	JComboBox day,date,month,year;
	JTextArea areaAddress;
	JCheckBox terms;
	JButton submit;
	JTextArea screen;
	JLabel message;
	
	JLabel coder;
	
	Registration(){
		
		Container c=getContentPane();
		c.setLayout(null);
		
		Title=new JLabel("Registration Form");
		Title.setBounds(400,0,150,30);
		c.add(Title);
		Title.setFont(new Font("Arial",Font.BOLD,15));
		
		name=new JLabel("Name");
		name.setBounds(10,50,50,20);
		c.add(name);
		
		textName=new JTextField();
		textName.setBounds(100,50,150,20);
		c.add(textName);
		
		mobile=new JLabel("Mobile No");
		mobile.setBounds(10,90,70,20);
		c.add(mobile);
		
		textMobile=new JTextField();
		textMobile.setBounds(100,90,150,20);
		c.add(textMobile);
		
		gender=new JLabel("Gender");
		gender.setBounds(10,130,50,20);
		c.add(gender);
		
		male=new JRadioButton("male");
		male.setBounds(100,130,80,20);
		c.add(male);
		male.setSelected(true);
		
		female=new JRadioButton("female");
		female.setBounds(180,130,80,20);
		c.add(female);
		
		ButtonGroup maleGroup=new ButtonGroup();
		maleGroup.add(male);
		maleGroup.add(female);
		
		dob=new JLabel("DOB");
		dob.setBounds(10,170,50,20);
		c.add(dob);
		
		String[] days = {
			"      ",
			"Sunday",
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday"
		};
		
		String[] dates = {
			" ",
			"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"
};
		
		String[] months = {
			"       ",
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
		};
		
		String[] years = {
		" ","1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
		"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
		"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
		"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
		"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
		"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
		"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029",
		"2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039",
		"2040"
		};
		
		
		day=new JComboBox(days);
		day.setBounds(100,170,90,20);
		c.add(day);
		
		
		date=new JComboBox(dates);
		date.setBounds(200,170,50,20);
		c.add(date);
		
		month=new JComboBox(months);
		month.setBounds(260,170,90,20);
		c.add(month);
		
		year=new JComboBox(years);
		year.setBounds(360,170,60,20);
		c.add(year);
		
		address=new JLabel("Address");
		address.setBounds(10,210,50,20);
		c.add(address);
		
		areaAddress=new JTextArea();
		areaAddress.setBounds(100,210,150,50);
		c.add(areaAddress);
		areaAddress.setLineWrap(true);
		
		terms=new JCheckBox("Please accept terms and conditions");
		terms.setBounds(100,270,250,20);
		c.add(terms);
		
		submit=new JButton("Submit");
		submit.setBounds(100,350,80,40);
		c.add(submit);
		
		screen=new JTextArea();
		screen.setBounds(430,50,400,230);
		c.add(screen);
		screen.setLineWrap(true);
		
		message=new JLabel("");
		message.setBounds(100,400,250,30);
		c.add(message);
		
		c.setBackground(Color.GREEN);
		
		coder=new JLabel("Rohit Coder");
		coder.setBounds(20,600,300,30);
		c.add(coder);
		coder.setFont(new Font("Arial",Font.BOLD,30));
		/*
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(terms.isSelected()){
					
					message.setText("Registration Successful...");
					
					String name=textName.getText();
					String mobile=textMobile.getText();
					String gender="male";
					if(female.isSelected()){
						gender="female";
					}
					String dob=day.getSelectedItem()+" "+date.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
					String address=areaAddress.getText();
					
					screen.setText("Name : "+name+"\n"+"Mobile : "+mobile+"\n"+"Gender : "+gender+"\n"+"DOB : "+dob+"\n"+"Address : "+address);
					
				}
				else{
					message.setText("Please accept terms and conditions");
				}
				
				
			}
		});
		*/
		
		setResizable(false);			
		submit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		
		if(textName.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Please fill the name first");
		}
		else if(textMobile.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Please fill the mobile number");
		}
		else if(areaAddress.getText().isEmpty()){
			JOptionPane.showMessageDialog(this,"Please fill your address");
		}
		
			if(terms.isSelected()){
					
					message.setText("Registration Successful...");
					
					String name=textName.getText();
					String mobile=textMobile.getText();
					String gender="male";
					if(female.isSelected()){
						gender="female";
					}
					String dob=day.getSelectedItem()+" "+date.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
					String address=areaAddress.getText();
					
					screen.setText("Name : "+name+"\n"+"Mobile : "+mobile+"\n"+"Gender : "+gender+"\n"+"DOB : "+dob+"\n"+"Address : "+address);
					
				}
				else{
					message.setText("Please accept terms and conditions");
				}
	}
	
}

public class Registration_Form{
	public static void main(String args []){
		Registration r=new Registration();
		
		r.setSize(900,700);
		r.setLocationRelativeTo(null);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		r.setVisible(true);
	}
}