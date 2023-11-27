package intro_to_programming;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class WelcomePage implements ActionListener{
	String buttonAction = "Add to Cart";
	
	int numCartItems = 0;
	
	JFrame frame = new JFrame();
	
	JLabel welcomeLabel = new JLabel("Hello");
	JLabel bodyLabel = new JLabel("Body Text");
	JLabel mainLabel = new JLabel();
	JLabel messageLabel = new JLabel();
	JLabel fillerLabel = new JLabel();
	JLabel fillerLabel1 = new JLabel();
	JLabel mainLabel2 = new JLabel();
	JLabel mainLabel3 = new JLabel();
	
	JTextField searchBar = new JTextField();
	
	JButton buyButton = new JButton(buttonAction);
	JButton buyButton2 = new JButton(buttonAction);
	JButton buyButton3 = new JButton(buttonAction);
	JButton checkCartButton = new JButton(numCartItems + " item(s) in Cart");
	JButton searchButton = new JButton();
	JButton clearCartButton = new JButton("Clear cart");
	JButton logOutButton = new JButton("Sign out");
	
	JMenuBar menuBar = new JMenuBar();
	JMenu allMenu = new JMenu("All");
	JMenu bestSellersMenu = new JMenu("BestSellers");
	JMenu scienceMenu = new JMenu("Science/Math");
	JMenu artMenu = new JMenu("Art");
	JMenu fictionMenu = new JMenu("Fiction");
	JMenu help = new JMenu("Help");
	JMenu cart = new JMenu("Check Cart");
	
	JMenuItem physics = new JMenu("Physics");
	JMenuItem physics2 = new JMenu("Physics");
	JMenuItem chemistry = new JMenu("Chemistry");
	JMenuItem chemistry2 = new JMenu("Chemistry");
	JMenuItem math = new JMenu("Mathematics");
	JMenuItem math2 = new JMenu("Mathematics");
	JMenuItem artOfDraw = new JMenu("Drawing for Beginers");
	JMenuItem poo = new JMenu("POO the Poop Monster");
	JMenuItem poo2 = new JMenu("POO the Poop Monster");
	JMenuItem starLight = new JMenu("StarLight");
	JMenuItem star = new JMenu("Star Light II");
	JMenuItem star2 = new JMenu("Star Light II");
	JMenuItem joachim = new JMenu("Joachim Odukale's Tales");
	JMenuItem joachim2 = new JMenu("Joachim Odukale's Tales");
	JMenuItem comp = new JMenu("Computer Science for Back-end Developers");
	JMenuItem pb = new JMenu("The act of Public Speaking");
	JMenuItem dia = new JMenu("Diarrhea!");
	JMenuItem bio = new JMenu("Biology");
	JMenuItem fic = new JMenu("Fiction");
	
	WelcomePage(String userID){
		Border border = BorderFactory.createLineBorder(Color.black, 2);
		
		ImageIcon icon = new ImageIcon("searchicon.png");
		
		searchBar.setBounds(80, 0, 500, 25);
		
		fillerLabel.setOpaque(true);
		fillerLabel.setBounds(0,0,80,25);
		fillerLabel.setText("JBJ");
		fillerLabel.setForeground(Color.gray);
		fillerLabel.setBackground(Color.green);
		fillerLabel.setFont(new Font("MV Boli", Font.ITALIC,30));
		fillerLabel1.setOpaque(true);
		fillerLabel1.setBounds(630,0,500,25);
		fillerLabel1.setBackground(Color.green);
		
//		Menu
		menuBar.add(allMenu);
		menuBar.add(bestSellersMenu);
		menuBar.add(scienceMenu);
		menuBar.add(artMenu);
		menuBar.add(fictionMenu);
		menuBar.add(help);
		menuBar.add(cart);
		menuBar.setBackground(new Color(21, 41, 74));
		
		allMenu.setForeground(Color.white);
		bestSellersMenu.setForeground(Color.white);
		scienceMenu.setForeground(Color.white);
		artMenu.setForeground(Color.white);
		fictionMenu.setForeground(Color.white);
		
		bestSellersMenu.add(joachim);
		bestSellersMenu.add(star2);
		bestSellersMenu.add(poo2);
		
		scienceMenu.add(physics2);
		scienceMenu.add(chemistry2);
		scienceMenu.add(math);
		scienceMenu.add(bio);
		scienceMenu.add(dia);
		
		allMenu.add(physics);
		allMenu.add(math2);
		allMenu.add(chemistry);
		allMenu.add(fic);
		
		artMenu.add(artOfDraw);
		artMenu.add(dia);
		artMenu.add(pb);
		
		fictionMenu.add(poo);
		fictionMenu.add(joachim2);
		fictionMenu.add(starLight);
		fictionMenu.add(star);
		fictionMenu.add(comp);
		
//		Book Labels
		ImageIcon introphysics = new ImageIcon("introphysics.png");
		mainLabel.setIcon(introphysics);
		mainLabel.setText("Introduction to Physics-$20.99");
		mainLabel.setBounds(10,90,250,350);
		mainLabel.setVerticalTextPosition(JLabel.BOTTOM);
		mainLabel.setHorizontalTextPosition(JLabel.CENTER);
		mainLabel.setForeground(Color.blue);
		
		ImageIcon starlight2 = new ImageIcon("Starlight2.png");
		mainLabel2.setIcon(starlight2);
		mainLabel2.setText("StarLight II- $12.99");
		mainLabel2.setBounds(220,90,250,350);
		mainLabel2.setVerticalTextPosition(JLabel.BOTTOM);
		mainLabel2.setHorizontalTextPosition(JLabel.CENTER);
		mainLabel2.setForeground(Color.blue);
		
		ImageIcon avengers = new ImageIcon("avengers.png");
		mainLabel3.setIcon(avengers);
		mainLabel3.setText("Marvels Avengers- $18.99");
		mainLabel3.setBounds(10,388,250,350);
		mainLabel3.setVerticalTextPosition(JLabel.BOTTOM);
		mainLabel3.setHorizontalTextPosition(JLabel.CENTER);
		mainLabel3.setForeground(Color.blue);
		
		
//		Buttons
		buyButton.setBounds(50, 402, 100, 20);
		buyButton.setFocusable(false);
		buyButton.addActionListener(this);
		buyButton2.setBounds(255, 402, 100, 20);
		buyButton2.setFocusable(false);
		buyButton2.addActionListener(this);
		buyButton3.setBounds(50, 700, 100, 20);
		buyButton3.setFocusable(false);
		buyButton3.addActionListener(this);
		searchButton.setIcon(icon);
		searchButton.setBounds(580,0,50,25);
		searchButton.setFocusable(false);
		searchButton.addActionListener(this);
		checkCartButton.setBounds(20,100,150,25);
		checkCartButton.addActionListener(this);
		clearCartButton.setBounds(200,100,150,25);
		clearCartButton.addActionListener(this);
		clearCartButton.setEnabled(false);
		logOutButton.setBounds(600, 30, 130, 25);
		logOutButton.addActionListener(this);
		logOutButton.setFocusable(false);
		
//      Why are they not working
		bio.addActionListener(this);
		joachim.addActionListener(this);
		
//		Welcome
//		welcomeLabel.setBackground(Color.green);
		welcomeLabel.setForeground(Color.black);
		welcomeLabel.setBounds(10,20,400,35);
		welcomeLabel.setFont(new Font("Serif", Font.BOLD,27));
		welcomeLabel.setText(" Welcome " + userID + "!");
		welcomeLabel.setVerticalTextPosition(JLabel.BOTTOM);
		
//		bodyLabel.setIcon(image1);
		bodyLabel.setBorder(border);
		bodyLabel.setBounds(10,60,800,35);
		bodyLabel.setOpaque(true);
		bodyLabel.setBackground(Color.green);
		bodyLabel.setFont(new Font("cursive", Font.PLAIN, 20));
		bodyLabel.setText(" Discover the finest books you're searching for at JBJ Books – Shop Now! ");
		
//		Frames
		ImageIcon s_image = new ImageIcon("icon.png");
		frame.setIconImage(s_image.getImage());
		frame.setLayout(null);
		frame.add(buyButton);
		frame.add(buyButton2);
		frame.add(buyButton3);
		frame.add(mainLabel);
		frame.add(bodyLabel);
		frame.add(welcomeLabel);
		frame.add(mainLabel2);
		frame.add(mainLabel3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setResizable(true); //RESIZE
		frame.getContentPane().setBackground( new Color(76, 187, 224));
		frame.setVisible(true);
		frame.setJMenuBar(menuBar);
		frame.add(fillerLabel);
		frame.add(fillerLabel1);
		frame.add(searchBar);
		frame.add(searchButton);
		frame.add(checkCartButton);
		frame.add(clearCartButton);
		frame.add(logOutButton);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == buyButton) {
			numCartItems++;
			buyButton.setEnabled(false);
			buyButton.setBounds(50, 402, 100, 20);
			buyButton.setText("Added to Cart");
			checkCartButton.setText(numCartItems + " item(s) in Cart");
			clearCartButton.setEnabled(true);
		}
		if(e.getSource()==buyButton2) {
			numCartItems++;
			buyButton2.setEnabled(false);
			buyButton2.setBounds(255, 402, 100, 20);
			buyButton2.setText("Added to Cart");
			checkCartButton.setText(numCartItems + " item(s) in Cart");
			clearCartButton.setEnabled(true);
		}
		if(e.getSource()==buyButton3) {
			numCartItems++;
			buyButton3.setEnabled(false);
			buyButton3.setBounds(50, 700, 100, 20);
			buyButton3.setText("Added to Cart");
			checkCartButton.setText(numCartItems + " item(s) in Cart");
			clearCartButton.setEnabled(true);}
		
		if(e.getSource() == physics) {
			JOptionPane.showMessageDialog(null,"You have "+ numCartItems + " book(s) in your Cart");
		}

		if(e.getSource()==searchButton) {
			if(searchBar.getText()!=" ") {
			JOptionPane.showMessageDialog(null, "You Searched for - " + searchBar.getText());}
		}
		if(e.getSource()==checkCartButton) {
			JOptionPane.showMessageDialog(null, "You have "+ numCartItems + " book(s) in your Cart");
		}
		if(e.getSource()==clearCartButton) {
			numCartItems = 0;
			checkCartButton.setText(numCartItems + " item(s) in Cart");
			clearCartButton.setEnabled(false);
			buyButton.setText("Add to Cart");
			buyButton.setEnabled(true);
			buyButton2.setText("Add to Cart");
			buyButton2.setEnabled(true);
			buyButton3.setText("Add to Cart");
			buyButton3.setEnabled(true);
		}
		if(e.getSource()== logOutButton) {
			int q = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out? Your cart would be cleared.");
			if(q==0) {
				JOptionPane.showMessageDialog(null, "Thanks For Shopping at JBJ Books! Till Next Time!");
				frame.dispose();

			}
			IDandPasswords idandPasswords = new IDandPasswords();
			Project1 loginPage = new Project1(idandPasswords.getLoginInfo());
		}
	}
}
