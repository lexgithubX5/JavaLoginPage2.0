package intro_to_programming;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Frames implements ActionListener{
	JFrame signUpPage = new JFrame("Sign Up");
	JTextField userIDField = new JTextField();
	JTextField userPasswordField = new JTextField();
	JTextField emailField = new JTextField();
	JLabel gen = new JLabel("Sign Up");// gen stands for general label. It contains the sign up text
	JLabel idLabel = new JLabel("UserID: ");
	JLabel warningLabel = new JLabel();
	JLabel passwordLabel = new JLabel("Password: ");
	JLabel emailLabel = new JLabel("E-mail: ");
	JButton signUpButton = new JButton("Sign Up");
	JButton clearButton = new JButton("Clear");
	
	Frames(){
		gen.setBounds(0, 20, 200, 50);
		gen.setFont(new Font("Monospace", Font.BOLD, 25));
		idLabel.setBackground(Color.gray);
		idLabel.setOpaque(true);
		idLabel.setBounds(1, 100, 80, 40);
		emailLabel.setBackground(Color.gray);
		emailLabel.setOpaque(true);
		emailLabel.setBounds(1,150, 100, 40);
		passwordLabel.setBackground(Color.gray);
		passwordLabel.setOpaque(true);
		passwordLabel.setBounds(1, 200, 80, 40);
		warningLabel.setBounds(1, 250, 350, 40);
		
		signUpButton.setBounds(80, 300, 100, 40);
		signUpButton.addActionListener(this);
		clearButton.setBounds(200, 300, 100, 40);
		clearButton.addActionListener(this);
		
		emailField.setBounds(80, 150, 300, 40);
		userIDField.setBounds(80, 100, 300, 40);
		userPasswordField.setBounds(80, 200, 300, 40);
		
		signUpPage.setBounds(10, 10, 420, 550);
		signUpPage.add(gen);
		signUpPage.add(idLabel);
		signUpPage.add(passwordLabel);
		signUpPage.add(warningLabel);
		signUpPage.add(emailField);
		signUpPage.add(emailLabel);
		signUpPage.add(userIDField);
		signUpPage.add(userPasswordField);
		signUpPage.add(signUpButton);
		signUpPage.add(clearButton);
		signUpPage.setResizable(false);
		signUpPage.setLayout(null);
		signUpPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signUpPage.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==signUpButton) {
			String id =userIDField.getText().trim();
			String passWord = userPasswordField.getText().trim();
			if(Project1.fileReader(id)) {
				warningLabel.setText("This User ID exists, try another one");
			}
			else if((id.equals(""))||(id.length()<5)||(passWord.equals("")||passWord.length()<=5)) {
				warningLabel.setForeground(Color.RED);
				warningLabel.setText("");
				warningLabel.setText("User ID and Password must be five(5) characters or more");
			}
			
			else {
				try {
				      BufferedWriter writer = new BufferedWriter(new FileWriter("account.txt",true));
				      writer.newLine();
				      writer.write(userIDField.getText()+","+userPasswordField.getText());
				      writer.close();
				      signUpPage.dispose();
				      IDandPasswords idandPasswords = new IDandPasswords();
				      Project1 loginPage = new Project1(idandPasswords.getLoginInfo());
				    } catch (IOException x) {
				      System.out.println(x);
				    }
				}
				
		}
		if(e.getSource()==clearButton) {
			warningLabel.setText("");
			emailField.setText("");
			userIDField.setText("");
			
		}
		
	}
	}

