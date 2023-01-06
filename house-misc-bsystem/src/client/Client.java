package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import login_signup.login_client;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class Client extends JFrame {
	
	private static String user;

    // then create setters and getter
    public void setUser(String user) 
    {
    	this.user = user;
    }
    
    public String getUser()
	{
		return user;
	}


	

	private JPanel contentPane;

	//set movable
		int xMouse;

		int yMouse;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JComboBox comboBox;
		private JLabel lblNewLabel_2;
		String name;
		String value;
		String company;
		String totalvalue;
		String account;
		String bill;
		int amount;
		int total;
		int fee = 20;
		int sim = 2;
		int tel = 10;
		private JTextField textField_3;
		String timeNow;
		String dateNow;

		private void frameMouseDragged(java.awt.event.MouseEvent evt) {

		int coorx = evt.getXOnScreen();

		int coory = evt.getYOnScreen();

		 

		this.setLocation(coorx-xMouse, coory-yMouse);

		 

		}

		 

		private void frameMousePressed(java.awt.event.MouseEvent evt) {

		xMouse  = evt.getX();

		yMouse = evt.getY();

		}
		//end
	
	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);  
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Client() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setUndecorated(true);	
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		//lblNewLabel_2.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 3, 1000, 22);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDaenerys = new JLabel("");
		lblDaenerys.setBounds(4, -2, 23, 22);
		lblDaenerys.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaenerys.setForeground(Color.WHITE);
		lblDaenerys.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		panel.add(lblDaenerys);
		
		BufferedImage img1 = null;
		try {
		    img1 = ImageIO.read(new File("./src/logo/black.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg1 = img1.getScaledInstance(lblDaenerys.getWidth(), lblDaenerys.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon1 = new ImageIcon(dimg1);
		lblDaenerys.setIcon(imageIcon1);
		
		JLabel lblNewLabel = new JLabel("x");
		lblNewLabel.setBounds(965, -2, 33, 19);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);
			}
		});
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("Daenerys'");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		label_3.setBounds(424, 1, 110, 21);
		panel.add(label_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(0, 0, 1000, 600);
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 623, 24);
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frameMouseDragged(e);
			}
		});
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frameMousePressed(e);
			}
		});
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 232, 362, 42);
		textField_1.setToolTipText("Type-in the ame of the payer");
		textField_1.setBackground(Color.WHITE);
		textField_1.setVisible(false);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(314, 306, 364, 42);
		textField_2.setToolTipText("The amount to pay with decimal");
		textField_2.setBackground(Color.WHITE);
		
		
		textField_2.setVisible(false);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Account no.");
		lblNewLabel_3.setBounds(316, 187, 90, 24);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(316, 271, 56, 24);
		lblName.setVisible(false);
		lblName.setFont(new Font("Verdana", Font.PLAIN, 13));
		panel_1.add(lblName);
		
		JLabel lblAmount = new JLabel("Full amount to pay:");
		lblAmount.setBounds(316, 344, 142, 24);
		lblAmount.setVisible(false);
		lblAmount.setFont(new Font("Verdana", Font.PLAIN, 13));
		panel_1.add(lblAmount);
		
		JLabel lblNewLabel_4 = new JLabel("Fill up your info");
		lblNewLabel_4.setBounds(344, 85, 334, 30);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(344, 63, 80, 63);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_5);
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./src/login_signup/daenerys-targaryen.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(lblNewLabel_5.getWidth(), lblNewLabel_5.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon = new ImageIcon(dimg);
		lblNewLabel_5.setIcon(imageIcon);
		
		
		
		
		JLabel emptyLabel = new JLabel("");
		emptyLabel.setBounds(288, 126, 422, 24);
		emptyLabel.setVisible(false);
		emptyLabel.setForeground(Color.BLACK);
		emptyLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		emptyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(emptyLabel);
		
		textField = new JTextField();
		//login_client log = new login_client();
		//log.setAcc(textField);
		textField.setBounds(314, 149, 364, 42);
		textField.setToolTipText("Your account number automatically show when you login.");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255,10,0)));
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.BLACK));
			}
		});
		textField.setBackground(Color.WHITE);
		textField.setVisible(false);
		textField.setFont(new Font("Verdana", Font.PLAIN, 15));
		textField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		
		//time
				LocalTime time = LocalTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
				timeNow = time.format(formatter);
				
				
				LocalDate date = LocalDate.now();
				DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
				dateNow = date.format(formatterDate);
		
		
		
		
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		
		lblNewLabel_2 = new JLabel("Choose on what bill you will pay:");
		lblNewLabel_2.setBounds(314, 189, 364, 20);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		

		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(3, 24, 275, 573);
		panel_2.setBackground(new Color(250, 235, 215));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		
		
		JLabel label_1 = new JLabel("Daenerys'");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		label_1.setBounds(92, 123, 123, 46);
		panel_2.add(label_1);
		
		
		
		JLabel lblBayadCenter = new JLabel("BAYAD CENTER");
		lblBayadCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblBayadCenter.setForeground(new Color(255, 102, 0));
		lblBayadCenter.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		lblBayadCenter.setBounds(37, 159, 205, 28);
		panel_2.add(lblBayadCenter);
		
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(35, 82, 92, 77);
		panel_2.add(lblNewLabel_7);
		
		BufferedImage img2 = null;
		try {
		    img2 = ImageIO.read(new File("./src/logo/black2.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg2 = img2.getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon2 = new ImageIcon(dimg2);
		lblNewLabel_7.setIcon(imageIcon2);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u00A9 2019 Daenerys'. All rights reserved.");
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea.setEditable(false);
		textArea.setBackground(new Color(250, 235, 215));
		textArea.setBounds(10, 548, 257, 25);
		panel_2.add(textArea);
		
		JButton btnBackToLogin = new JButton("Logout");
		btnBackToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_client log = new login_client();
				log.setVisible(true);
				log.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnBackToLogin.setForeground(Color.WHITE);
		btnBackToLogin.setFont(new Font("SansSerif", Font.PLAIN, 19));
		btnBackToLogin.setBorder(null);
		btnBackToLogin.setBackground(new Color(0, 153, 255));
		btnBackToLogin.setBounds(62, 481, 142, 42);
		panel_2.add(btnBackToLogin);
		
		JLabel label_2 = new JLabel("<html><center><h1>Your ALL in ONE Bayad Bills Center.</h1> <h2>Hustle free and fast service just like a snap!</h2></center></html>");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalTextPosition(SwingConstants.CENTER);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		label_2.setBounds(24, 212, 230, 151);
		panel_2.add(label_2);
		
		
		
		
		
		
		
		
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(720, 88, 270, 448);
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblAdditionalFee = new JLabel("Additional fee:");
		lblAdditionalFee.setBounds(10, 327, 125, 30);
		lblAdditionalFee.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblAdditionalFee);
		lblAdditionalFee.setForeground(Color.BLACK);
		lblAdditionalFee.setVisible(false);
		lblAdditionalFee.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		JLabel lblNewLabel_6 = new JLabel("Total:");
		lblNewLabel_6.setBounds(10, 368, 56, 30);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		JLabel lblTemp = new JLabel("");
		lblTemp.setBounds(145, 327, 115, 30);
		panel_3.add(lblTemp);
		lblTemp.setVisible(false);
		lblTemp.setForeground(Color.BLACK);
		lblTemp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTemp.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JLabel label = new JLabel("0");
		label.setBounds(145, 368, 115, 30);
		panel_3.add(label);
		label.setForeground(Color.BLACK);
		label.setVisible(false);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JLabel lblPaymentSummary = new JLabel("Payment Summary");
		lblPaymentSummary.setBounds(10, 41, 250, 43);
		lblPaymentSummary.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPaymentSummary.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaymentSummary.setForeground(Color.BLACK);
		lblPaymentSummary.setFont(new Font("SansSerif", Font.BOLD, 20));
		panel_3.add(lblPaymentSummary);
		
		JLabel lblAcoountNumber = new JLabel("Acount number:");
		lblAcoountNumber.setBounds(10, 111, 123, 30);
		lblAcoountNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblAcoountNumber.setForeground(Color.BLACK);
		lblAcoountNumber.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(lblAcoountNumber);
		
		JTextField label_4 = new JTextField("");
		label_4.setBounds(164, 111, 96, 30);
		label_4.setBackground(Color.WHITE);
		label_4.setEditable(false);
		label_4.setVisible(false);
		label_4.setBorder(null);
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(label_4);
		
		
		
		JLabel lblName_1 = new JLabel("Name:");
		lblName_1.setBounds(10, 152, 56, 30);
		lblName_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblName_1.setForeground(Color.BLACK);
		lblName_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(lblName_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(135, 152, 125, 30);
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(label_5);
		
		JLabel lblAmount_1 = new JLabel("Amount");
		lblAmount_1.setBounds(10, 205, 65, 30);
		lblAmount_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAmount_1.setForeground(Color.BLACK);
		lblAmount_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(lblAmount_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(135, 205, 125, 30);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(label_6);
		
		JLabel lblNameOfCompany = new JLabel("Company Name:");
		lblNameOfCompany.setBounds(10, 246, 115, 30);
		lblNameOfCompany.setHorizontalAlignment(SwingConstants.LEFT);
		lblNameOfCompany.setForeground(Color.BLACK);
		lblNameOfCompany.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(lblNameOfCompany);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(10, 274, 250, 24);
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("SansSerif", Font.BOLD, 15));
		panel_3.add(label_7);
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("SansSerif", Font.BOLD, 15));
		label_10.setBounds(10, 302, 250, 24);
		panel_3.add(label_10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(709, 24, 10, 576);
		lblNewLabel_8.setBorder(new MatteBorder(0, 3, 0, 0, (Color) new Color(0, 0, 0)));
		panel_1.add(lblNewLabel_8);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(316, 397, 362, 40);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(508, 464, 142, 42);
		btnNewButton.setBorder(null);
		panel_1.add(btnNewButton);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				emptyLabel.setText("");
				textField.setVisible(false);
				comboBox_1.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				textField_3.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblName.setVisible(false);
				lblAmount.setVisible(false);
				label_4.setVisible(false);
				lblNewLabel_6.setVisible(false);
				label.setVisible(false);
				lblAdditionalFee.setVisible(false);
				lblTemp.setVisible(false);
				lblNewLabel_2.setVisible(true);
				comboBox.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 19));
		
		JButton btnCheckOut = new JButton("Review Payment");
		btnCheckOut.setBounds(336, 464, 142, 42);
		
		comboBox_1.setVisible(false);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
				String other = comboBox_1.getSelectedItem().toString();
				if(other.equalsIgnoreCase("Other Cable System")) {
					btnCheckOut.setBounds(336, 518, 142, 42);
					btnNewButton.setBounds(511, 518, 142, 42);
					textField_3.setVisible(true);
					
				}
				}
				catch (Exception e) {
					
				}
			}
		});
		
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		comboBox_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setSelectedItem(null);
		panel_1.add(comboBox_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(395, 210, 200, 40);
		
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Electricity", "Water", "Internet", "Cable system", "Prepaid/Postpaid"}));
		comboBox.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setSelectedItem(null);
		panel_1.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bills = comboBox.getSelectedItem().toString();
				printAcc();
				if(bills.equals("Electricity")) {
					emptyLabel.setText("Electric Bills Payment");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Meralco"}));
					lblTemp.setText("20");
					lblNewLabel_2.setVisible(false);
					emptyLabel.setVisible(true);
					comboBox_1.setVisible(true);
					textField.setVisible(true);
					label_4.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblName.setVisible(true);
					lblAmount.setVisible(true);
					lblNewLabel_6.setVisible(true);
					label.setVisible(true);
					lblAdditionalFee.setVisible(true);
					lblTemp.setVisible(true);
					comboBox.setVisible(false);
					
				}
				else if(bills.equals("Water")) {
					emptyLabel.setText("Water Bills Payment");
					lblTemp.setText("20");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MWD (Metropolitan Water District)", "PrimeWater", "Maynilad", "Manila Water"}));
					lblNewLabel_2.setVisible(false);
					emptyLabel.setVisible(true);
					textField.setVisible(true);
					comboBox_1.setVisible(true);
					label_4.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblName.setVisible(true);
					lblAmount.setVisible(true);
					lblNewLabel_6.setVisible(true);
					label.setVisible(true);
					lblAdditionalFee.setVisible(true);
					lblTemp.setVisible(true);
					comboBox.setVisible(false);
					
				}
				else if(bills.equals("Prepaid/Postpaid")) {
					emptyLabel.setText("Prepaid Loads/Postpaid Plans Payment");
					lblTemp.setText("2");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SMART", "SUN", "GLOBE", "TNT", "TM"}));
					lblNewLabel_2.setVisible(false);
					emptyLabel.setVisible(true);
					textField.setVisible(true);
					comboBox_1.setVisible(true);
					label_4.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblName.setVisible(true);
					lblAmount.setVisible(true);
					lblNewLabel_6.setVisible(true);
					label.setVisible(true);
					lblAdditionalFee.setVisible(true);
					lblTemp.setVisible(true);
					comboBox.setVisible(false);
					
				}
				else if(bills.equals("Internet")) {
					emptyLabel.setText("Internet Bills Payment");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Converge ICT Solutions", "ONE SKY", "NOW Network", "PLDT", "Globe Broadband", "RISE"}));
					lblTemp.setText("20");
					lblNewLabel_2.setVisible(false);
					emptyLabel.setVisible(true);
					textField.setVisible(true);
					label_4.setVisible(true);
					comboBox_1.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblName.setVisible(true);
					lblAmount.setVisible(true);
					lblNewLabel_6.setVisible(true);
					label.setVisible(true);
					lblAdditionalFee.setVisible(true);
					lblTemp.setVisible(true);
					comboBox.setVisible(false);
					
				}
				else if(bills.equals("Cable system")) {
					emptyLabel.setText("Cable system");
					lblTemp.setText("10");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Asian Vision(CATV Cable System)", "SKY Cable", "Cignal", "Other Cable System"}));
					lblNewLabel_2.setVisible(false);
					emptyLabel.setVisible(true);
					textField.setVisible(true);
					textField_1.setVisible(true);
					textField_2.setVisible(true);
					label_4.setVisible(true);
					comboBox_1.setVisible(true);
					lblNewLabel_3.setVisible(true);
					lblName.setVisible(true);
					lblAmount.setVisible(true);
					lblNewLabel_6.setVisible(true);
					label.setVisible(true);
					lblAdditionalFee.setVisible(true);
					lblTemp.setVisible(true);
					comboBox.setVisible(false);
					
				}
			}
		});
		
		
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
				String name = textField_1.getText();
				String value = textField_2.getText();
				String company = comboBox_1.getSelectedItem().toString();
				String other = textField_3.getText();
				String account = textField.getText();
				
				if(name.equals("") || value.equals("")) {
					JOptionPane.showMessageDialog(null, "Fill up all forms", "Billing Error", JOptionPane.ERROR_MESSAGE);
					label_7.setText("");
					label_10.setText("");
				}
				else {
					label_4.setText(account);
					label_5.setText(name);
					label_6.setText(value);
					label_7.setText(company);
					label_10.setText(other);
				}
				
				
				
				String bills = comboBox.getSelectedItem().toString();
				if(bills.equalsIgnoreCase("Electricity") || bills.equalsIgnoreCase("Water") || bills.equalsIgnoreCase("Internet")) {
					amount = Integer.parseInt(textField_2.getText());
					total = amount + fee;
					label.setText(total+" pesos");
				}
				
				else if(bills.equalsIgnoreCase("Prepaid/Postpaid")) {
					amount = Integer.parseInt(textField_2.getText());
					total = amount + sim;
					label.setText(total+" pesos");
				}
				
				else if(bills.equalsIgnoreCase("Cable system")) {
					amount = Integer.parseInt(textField_2.getText());
					total = amount + tel;
					label.setText(total+" pesos");
				}
				
			}
				catch(Exception ex ) {
					
				}
		}
		});
		btnCheckOut.setBorder(null);
		panel_1.add(btnCheckOut);
		btnCheckOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCheckOut.setForeground(Color.WHITE);
		btnCheckOut.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnCheckOut.setBackground(new Color(0, 153, 255));
		//label for time
		JLabel label_8;
		label_8 = new JLabel(timeNow);
		label_8.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 0, 0)));
		
		
		JLabel label_9 = new JLabel("");
		label_9.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(30, 144, 255)));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("SansSerif", Font.BOLD, 21));
		label_9.setBounds(720, 33, 128, 42);
		label_9.setText(dateNow);
		panel_1.add(label_9);
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(316, 454, 362, 42);
		textField_3.setVisible(false);
		textField_3.setToolTipText("Please specify.");
		textField_3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnPayNow = new JButton("Pay now");
		btnPayNow.setBounds(786, 547, 142, 42);
		btnPayNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				try {
					name = textField_1.getText();
					value = textField_2.getText();
					company = label_7.getText();
					totalvalue = label.getText();
					account = textField.getText();
					bill = comboBox.getSelectedItem().toString();
					String time = label_8.getText();
					String date = label_9.getText();
					
					
					File file = new File("./src/database/paymentlog.txt");
			           //if the file not exist create one
			           if(!file.exists()){
			              file.createNewFile();
			           }
//			           
			           FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			           BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(account+",");
					bw.write(name+",");
					bw.write(bill+",");
					bw.write(company+",");
					bw.write(value+",");
					bw.write(time+",");
					bw.write(date+",");
					bw.write(totalvalue+",");
					bw.newLine();
					bw.close();

					if(name.equals("") || value.equals("") || bill.equals("")) {
						JOptionPane.showMessageDialog(null, "Fill up all forms", "Billing Error", JOptionPane.ERROR_MESSAGE);
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Payment Succesful! Thank you "+name, "Account number", JOptionPane.INFORMATION_MESSAGE);
						
					}
					}
					catch (Exception ex) {
						ex.printStackTrace();
						JOptionPane.showMessageDialog(null, "Fill up all forms", "Signup Error", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		btnPayNow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPayNow.setForeground(Color.WHITE);
		btnPayNow.setFont(new Font("SansSerif", Font.BOLD, 17));
		btnPayNow.setBorder(null);
		btnPayNow.setBackground(new Color(0, 153, 255));
		panel_1.add(btnPayNow);
		
		
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("SansSerif", Font.BOLD, 21));
		label_8.setBounds(862, 33, 128, 42);
		panel_1.add(label_8);
		
	}
	
	public void printAcc() {
		try {
		String delimiter = ":";
        Map<String, String> map = new HashMap<>();

        try(Stream<String> lines = Files.lines(Paths.get("./src/database/accuser.txt"))){
            lines.filter(line -> line.contains(delimiter)).forEach(
                line -> map.putIfAbsent(line.split(delimiter)[0], line.split(delimiter)[1])
            );
        }
        
        textField.setText(map.get(user));
		}
		catch(Exception e) {
			
		}
	}
	
	
	public void loginlog() {
		try {
			
			
			String files = "./src/database/loginlog.txt";
			File file = new File(files);
			if(!file.exists()){
		          file.createNewFile();
		       }
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    
			bw.write(user+",");
			bw.write(timeNow+",");
			bw.write(dateNow);
			bw.newLine();
			bw.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
