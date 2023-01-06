package login_signup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import admin.Admin;
import client.Client;
import client.forgotpass;
import methods.mgamethod;

import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class login_client extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton txtLogIn;
	private JLabel txtX;
	private static Scanner x;
	String user;
	String pass;
	String timeNow;
	String dateNow;
	String account;
	
	/**
	 * Launch the application.
	 */

	
	//set movable
	int xMouse;

	int yMouse;

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
		
			public void run() {
				try {
					login_client frame = new login_client();
					frame.setLocationRelativeTo(null);  
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public login_client() {
		setUndecorated(true);
		setOpacity(0.97f);
		setResizable(false);
		setBackground(new Color(204, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 476);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color light_blue = new Color(0, 153, 255);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(242, 23, 420, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		txtUsername = new JTextField("Username");
		
		txtUsername.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtUsername.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 70, 255)));
				txtPassword.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
				txtUsername.setText("");
				txtUsername.setForeground(Color.BLACK);
			}
		});
		txtUsername.setForeground(UIManager.getColor("Button.shadow"));
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setBounds(28, 169, 361, 40);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField("Password");
		txtPassword.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtPassword.setEchoChar((char) 0);
		txtPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPassword.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 70, 255)));
				txtUsername.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
				txtPassword.setEchoChar('●');
				txtPassword.setText("");
				txtPassword.setForeground(Color.BLACK);
			}
		});
		txtPassword.setForeground(UIManager.getColor("Button.shadow"));
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPassword.setText("Password");
		txtPassword.setBounds(28, 242, 361, 40);
		panel.add(txtPassword);
		txtPassword.setColumns(10);
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		timeNow = time.format(formatter);
		
		
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		dateNow = date.format(formatterDate);
		
		txtLogIn = new JButton();
		txtLogIn.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		txtLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPassword.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
				
					String loc = "./src/database/userpass.txt";
		        	 user = txtUsername.getText();
					 pass = txtPassword.getText();
					 
					 
					 
				try {
					Client cli = new Client();
					 cli.setUser(user);
					 cli.getUser();
					verifyLogin(user,pass,loc);
					
										
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		txtLogIn.setBackground(new Color(0, 153, 255));
		txtLogIn.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				
				txtLogIn.setForeground(Color.BLACK);
				

			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtLogIn.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLogIn.setBackground(light_blue);
				
			}
			
		});
		txtLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtLogIn.setBackground(new Color(0, 153, 255));
		txtLogIn.setForeground(Color.WHITE);
		txtLogIn.setFont(new Font("SansSerif", Font.BOLD, 20));
		txtLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogIn.setText("Log in");
		txtLogIn.setBounds(28, 321, 361, 51);
		panel.add(txtLogIn);
		
		JLabel lblNewLabel_1 = new JLabel("Login to your account");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(41, 66, 332, 40);
		panel.add(lblNewLabel_1);
		
		JLabel txtrSignUpFree = new JLabel();
		txtrSignUpFree.setHorizontalAlignment(SwingConstants.CENTER);
		txtrSignUpFree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				signup sign = new signup();
				sign.setVisible(true);
				sign.setLocationRelativeTo(null);
				dispose();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				txtrSignUpFree.setForeground(new Color(0, 70, 255));

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				txtrSignUpFree.setForeground(new Color(0, 153, 255));
			}
			
		});
		
		
		txtrSignUpFree.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtrSignUpFree.setText("Sign up free!");
		txtrSignUpFree.setForeground(new Color(0, 153, 255));
		txtrSignUpFree.setFont(new Font("SansSerif", Font.PLAIN, 19));
		txtrSignUpFree.setBackground(Color.WHITE);
		txtrSignUpFree.setBounds(249, 111, 124, 25);
		panel.add(txtrSignUpFree);
		
		JLabel lblDontHaveAn = new JLabel();
		lblDontHaveAn.setText("Don't have an account?");
		lblDontHaveAn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDontHaveAn.setForeground(new Color(102, 102, 102));
		lblDontHaveAn.setFont(new Font("SansSerif", Font.PLAIN, 19));
		lblDontHaveAn.setBackground(Color.WHITE);
		lblDontHaveAn.setBounds(57, 111, 200, 25);
		panel.add(lblDontHaveAn);
		
		JLabel lblForgotPassword = new JLabel();
		lblForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblForgotPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				forgotpass fo = new forgotpass();
				fo.setVisible(true);
				fo.setLocationRelativeTo(null);
				dispose();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblForgotPassword.setForeground(new Color(0, 70, 255));

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblForgotPassword.setForeground(new Color(0, 153, 255));
			}
		});
		lblForgotPassword.setText("Forgot Password?");
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setForeground(new Color(0, 153, 255));
		lblForgotPassword.setFont(new Font("SansSerif", Font.PLAIN, 19));
		lblForgotPassword.setBackground(Color.WHITE);
		lblForgotPassword.setBounds(113, 383, 200, 25);
		panel.add(lblForgotPassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 662, 23);
		contentPane.add(panel_1);
		
		txtX = new JLabel();
		txtX.setBounds(640, -1, 20, 23);
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtX.setBorder(null);
		txtX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtX.setForeground(Color.WHITE);
			}
		});
		panel_1.setLayout(null);
		
		txtX.setForeground(Color.WHITE);
		txtX.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		txtX.setText("x");
		txtX.setBackground(Color.BLACK);
		panel_1.add(txtX);
		
		JLabel lblNewLabel_2 = new JLabel("Daenerys'");
		
		lblNewLabel_2.setBounds(28, 0, 609, 23);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		panel_1.add(lblNewLabel_2);
		
		JLabel lblD = new JLabel();
		lblD.setBounds(4, 2, 23, 21);
		lblD.setBackground(new Color(255, 51, 51));
		panel_1.add(lblD);
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(Color.RED);
		lblD.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 20));
		
		BufferedImage img1 = null;
		try {
		    img1 = ImageIO.read(new File("./src/logo/black.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg1 = img1.getScaledInstance(lblD.getWidth(), lblD.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon1 = new ImageIcon(dimg1);
		lblD.setIcon(imageIcon1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, -1, 637, 23);
		lblNewLabel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				frameMouseDragged(e);
			}
		});
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				frameMousePressed(e);
			}
		});
		panel_1.add(lblNewLabel_3);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(0, 0, 662, 476);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 222, 173));
		panel_3.setBounds(0, 22, 241, 454);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("Daenerys'");
		label.setBounds(84, 76, 123, 38);
		panel_3.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		
		JLabel lblBayadCenter = new JLabel();
		lblBayadCenter.setText("BAYAD CENTER");
		lblBayadCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblBayadCenter.setForeground(new Color(255, 102, 0));
		lblBayadCenter.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		lblBayadCenter.setBackground(Color.WHITE);
		lblBayadCenter.setBounds(10, 112, 226, 25);
		panel_3.add(lblBayadCenter);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(30, 27, 90, 87);
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./src/logo/black2.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		
		lblNewLabel.setIcon(imageIcon);
		
		
		JButton btnBack = new JButton();
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				picker pick = new picker();
				pick.setVisible(true);
				pick.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnBack.setBounds(30, 394, 177, 31);
		panel_3.add(btnBack);
		btnBack.setText("Back");
		btnBack.setHorizontalAlignment(SwingConstants.CENTER);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnBack.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		btnBack.setBackground(new Color(0, 153, 255));
		
		JLabel label_1 = new JLabel("<html><center><h1>Your ALL in ONE Bayad Bills Center.</h1> <h2>Hustle free and fast service just like a snap!</h2></center></html>");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalTextPosition(SwingConstants.CENTER);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		label_1.setBounds(10, 157, 221, 151);
		panel_3.add(label_1);
		
		
	}

	public void verifyLogin(String username, String password, String loc) {
		boolean found = false;
		String user = "";
		String pass = "";
		
		try {
			x = new Scanner(new File(loc));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext() && !found) {
				user = x.next();
				pass = x.next();
				
				if(user.trim().equals(username.trim())&& pass.trim().equals(password.trim())) {
					found = true;
				}
			}
			if(!found) {
				JOptionPane.showMessageDialog(null, "Wrong Username or Password!", "Login error", JOptionPane.WARNING_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Login Success!", "Login", JOptionPane.INFORMATION_MESSAGE);
				Client cli = new Client();
				cli.setVisible(true);
				cli.setLocationRelativeTo(null);
				cli.loginlog();
				dispose();
			}
			x.close();
			
			
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error"+e.toString(), "Error!", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}
