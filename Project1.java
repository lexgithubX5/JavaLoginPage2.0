package intro_to_programming;
import java.util.HashMap;
import java.util.StringTokenizer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//This is Project1, sorry the name is ambiguous. It purpose it to run the Initial Login Page
//This is the Login Page's Code
public class Project1 implements ActionListener{		
	String id;
	String passWord;
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton  = new JButton("Reset");
	JButton newUserButton = new JButton("New User");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User ID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	Project1(HashMap<String,String> loginInfoOriginal){
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		newUserButton.setBounds(175,225,100,25);
		newUserButton.setFocusable(false);
		newUserButton.addActionListener(this);
		
		ImageIcon s_image = new ImageIcon("icon.png");
		
		frame.setIconImage(s_image.getImage());
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(newUserButton);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
	
		if (e.getSource()==loginButton) {
			fileReader();
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)){
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					frame.dispose();
					
					JOptionPane.showMessageDialog(null, "Login Successfull");
					
					WelcomePage welcomePage = new WelcomePage(userID);
					
					}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password!");
					}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("UserID not found!");
			}
			
		}
		if(e.getSource()==newUserButton) {
			frame.dispose();
			Frames f = new Frames();
		
			}
	}
		Project1(){	
		}
		//method checks the input with values in a file
		void fileReader(){
			String path ="account.txt";
		    try {
		      BufferedReader reader = new BufferedReader(new FileReader(path));
		      while (reader.ready()) {
		        String line = reader.readLine();
		        StringTokenizer tokens = new StringTokenizer(line, " ");
		        while (tokens.hasMoreTokens()) {
		        	String idWord = tokens.nextToken();
		        	if(idWord.equals(userIDField.getText()+ ","+ String.valueOf(userPasswordField.getPassword()))) {
		        		messageLabel.setForeground(Color.green);
						messageLabel.setText("Login successful");
						frame.dispose();
						JOptionPane.showMessageDialog(null, "Login Successfull");
						//Runs Welcome Page
						WelcomePage welcomePage = new WelcomePage(userIDField.getText());
						break;
		        	}
		        	
		        }
		      }
		      reader.close();
		    } catch (IOException e) {
		      System.out.println(e);
		    }
			}
		//overloaded method
		public static boolean fileReader(String id_exists){
			 try {
			      BufferedReader reader = new BufferedReader(new FileReader("account.txt"));
			      while (reader.ready()) {
			        String line = reader.readLine();
			        StringTokenizer tokens = new StringTokenizer(line, ",");
			        while (tokens.hasMoreTokens()) {
			        	String idWord = tokens.nextToken();
			        	if(idWord.equals(id_exists)) {
			        	return true;
			        	} 
			        }
			        reader.close();
			      }
			      
			    } catch (IOException e) {
			      System.out.println(e);
			    }
			return false;
		}
		}		