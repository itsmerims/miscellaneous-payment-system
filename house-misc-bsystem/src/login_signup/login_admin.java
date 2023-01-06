package login_signup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import admin.Admin;
import client.Client;

import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;

public class login_admin extends JFrame {
	private static Scanner x;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JButton txtLogIn;
	private JLabel txtX;
	String user;
	
	
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
					login_admin frame = new login_admin();
					frame.setLocationRelativeTo(null);  
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public login_admin() {
		setUndecorated(true);
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 369);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color light_blue = new Color(0, 153, 255);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(250, 128, 114));
		panel.setBounds(2, 24, 409, 311);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 389, 131);
		panel.add(lblNewLabel);
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("./src/logo/logo1.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		lblNewLabel.setIcon(imageIcon);
		
		
		txtUsername = new JTextField();
		txtUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loc = "./src/database/adminusers.txt";
	        	 user = txtUsername.getText();
	        	 
				try {	
					 Admin cli = new Admin();
		        	 cli.setUser(user);
		        	 cli.getUser();
		        	 verifyLogin(user,loc);
		        	
					}
					catch(Exception ex) {
						
					}
			}
		});
		txtUsername.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		txtUsername.setBackground(new Color(250, 128, 114));
		txtUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtUsername.setText("");
				txtUsername.setForeground(Color.BLACK);
			}
		});
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setText("Username");
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtUsername.setBounds(53, 171, 301, 40);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtLogIn = new JButton();
		txtLogIn.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		txtLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String loc = "./src/database/adminusers.txt";
	        	 user = txtUsername.getText();
	        	 
				try {	
					 Admin cli = new Admin();
		        	 cli.setUser(user);
		        	 cli.getUser();
		        	 verifyLogin(user,loc);
		        	
					}
					catch(Exception ex) {
						
					}
				
				
			}
		});
		
		txtLogIn.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				txtLogIn.setBackground(new Color(0, 153, 255));
				txtLogIn.setForeground(Color.WHITE);
				txtLogIn.setBorder(new LineBorder(Color.WHITE, 2, true));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtLogIn.setBackground(Color.WHITE);
				txtLogIn.setForeground(Color.BLACK);
				txtLogIn.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				txtLogIn.setBackground(light_blue);
			}
			
		});
		txtLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtLogIn.setBackground(Color.WHITE);
		txtLogIn.setForeground(Color.BLACK);
		txtLogIn.setFont(new Font("Verdana", Font.BOLD, 17));
		txtLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogIn.setText("Log in");
		txtLogIn.setBounds(53, 228, 146, 40);
		panel.add(txtLogIn);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Login");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 120, 389, 40);
		panel.add(lblNewLabel_1);
		
		JLabel txtrClickHereTo = new JLabel();
		txtrClickHereTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtrClickHereTo.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				txtrClickHereTo.setForeground(Color.BLUE);

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				txtrClickHereTo.setForeground(Color.WHITE);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				signup_admin sign = new signup_admin();
				sign.setVisible(true);
				sign.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		
		txtrClickHereTo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtrClickHereTo.setText("Click here to create another admin account");
		txtrClickHereTo.setForeground(Color.WHITE);
		txtrClickHereTo.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtrClickHereTo.setBackground(new Color(250, 128, 114));
		txtrClickHereTo.setBounds(53, 279, 301, 25);
		panel.add(txtrClickHereTo);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				picker p = new picker();
				p.setVisible(true);
				p.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		button.setText("< Back");
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Verdana", Font.BOLD, 17));
		button.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		button.setBackground(Color.WHITE);
		button.setBounds(218, 228, 146, 40);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(2, 2, 409, 22);
		contentPane.add(panel_1);
		
		txtX = new JLabel();
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setBounds(389, -2, 20, 23);
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
		lblNewLabel_2.setBounds(158, 1, 89, 21);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 1, 27, 21);
		panel_1.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		
		
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("./src/logo/black.jpg").getImage().getScaledInstance(22, 23, Image.SCALE_DEFAULT));
		label.setIcon(imageIcon1);
		
		JLabel lblNewLabel_3 = new JLabel("");
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
		lblNewLabel_3.setBounds(0, -2, 381, 24);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(0, 0, 413, 388);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("\u00A9 2019 Daenerys'. All rights reserved.");
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_1.setEditable(false);
		textArea_1.setBackground(new Color(0, 0, 0));
		textArea_1.setBounds(76, 341, 257, 25);
		panel_2.add(textArea_1);
	}
	
	public void verifyLogin(String username, String loc) {
		boolean found = false;
		String user = "";
		
		try {
			x = new Scanner(new File(loc));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext() && !found) {
				user = x.next();
				
				if(user.trim().equals(username.trim())) {
					found = true;
				}
			}
			if(!found) {
				JOptionPane.showMessageDialog(null, "Wrong Username!", "Login error", JOptionPane.WARNING_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Login Success!", "Login", JOptionPane.INFORMATION_MESSAGE);
				
				
		           
				
		    	Admin cli = new Admin();
		    	cli.setLocationRelativeTo(null);
				cli.setVisible(true);
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
