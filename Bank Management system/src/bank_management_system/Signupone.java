package bank_management_system;


import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signupone extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField,
			   fnameTextField, 
			   enameTextField, 
			   anameTextField, 
			   cnameTextField, 
			   snameTextField, 
			   pnameTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser datechooser;
	
	Signupone(){
		
		setLayout(null); // to bring the written text in center.
		
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L)+1000L);
		
		JLabel formno = new JLabel("APPLICATION FORM NO." + random);
		formno.setFont(new Font("Raleyway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		JLabel personalDetails = new JLabel("PAGE 1: PERSONAL DETAILS");
		personalDetails.setFont(new Font("Raleyway", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleyway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		nameTextField.setBounds(300, 140, 400, 30);
		add(nameTextField);
		
		JLabel fname = new JLabel("Father's Name:");
		fname.setFont(new Font("Raleyway", Font.BOLD, 20));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		fnameTextField.setBounds(300, 190, 400, 30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleyway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		datechooser = new JDateChooser();
		datechooser.setBounds(300, 240, 400, 30);
		datechooser.setForeground(new Color(105, 105, 105));
		add(datechooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleyway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBounds(300, 290, 60,30);
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(380, 290,120,30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup(); //this created to either click on male or female
		gendergroup.add(male);		
		gendergroup.add(female);
		
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("Raleyway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);
		enameTextField = new JTextField();
		enameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		enameTextField.setBounds(300, 340, 400, 30);
		add(enameTextField);
		
		JLabel marital = new JLabel("Marital Status:");
		marital.setFont(new Font("Raleyway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		
		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other = new JRadioButton("Other");
		other.setBounds(600, 390,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup mstatus = new ButtonGroup();
		mstatus.add(married);		
		mstatus.add(unmarried);
		mstatus.add(other);
		
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleyway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);
		anameTextField = new JTextField();
		anameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		anameTextField.setBounds(300, 440, 400, 30);
		add(anameTextField);
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleyway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		cnameTextField = new JTextField();
		cnameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		cnameTextField.setBounds(300, 490, 400, 30);
		add(cnameTextField);
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleyway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);
		snameTextField = new JTextField();
		snameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		snameTextField.setBounds(300, 540, 400, 30);
		add(snameTextField);
		
		JLabel pincode = new JLabel("pincode:");
		pincode.setFont(new Font("Raleyway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		pnameTextField = new JTextField();
		pnameTextField.setFont(new Font("Raleyway", Font.BOLD, 14));
		pnameTextField.setBounds(300, 590, 400, 30);
		add(pnameTextField);
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleyway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this); //using this a msg will pop up of name is required which we have returned in exception of try n catch method
		add(next);
		
		getContentPane().setBackground(Color.white);
		
		setSize(850, 800); 
		setVisible(true); 
		setLocation(350,10);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno = "" + random; //random is a long value so when u apply "" + then it will convert to string and concatenate it
		String name = nameTextField.getText(); //get function se hum textfield ke value ko nikal skte hai....  settext se hum textfield mai value ko set kr skte hai
		String fname = fnameTextField.getText();
		String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
			if(male.isSelected()) {
				gender = "Male";
			}else if(female.isSelected()) {
				gender="female";
			}
		String email = enameTextField.getText();
		String marital = null;
			if(married.isSelected() ) {
				marital="Married";
			}else if(unmarried.isSelected()) {
				marital="unmarried";	
			}else if(other.isSelected()) {
				marital="other";
			}
			
			String address = anameTextField.getText();
			String city = cnameTextField.getText();
			String state = snameTextField.getText();
			String pincode = pnameTextField.getText();
			
			
			try {
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "Name is Required");
				} else {
					Conn c = new Conn();
					String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender +"', '"+email+"', '"+marital+"', '"+address+"','"+city+"','"+state+"','"+pincode+"')";
					c.s.executeUpdate(query);
					
					setVisible(false);
					new SignupTwo(formno).setVisible(true); //signuptwo
				}
				
			} catch(Exception e) {
				System.out.println(e);
			}
	}
	
	public static void main(String args[]) {
		new Signupone();
	}
}