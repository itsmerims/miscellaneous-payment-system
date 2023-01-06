package login_signup;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

import admin.Admin;
import methods.mgamethod;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField.AbstractFormatter;
import java.awt.SystemColor;

public class signup extends JFrame {

	private JPanel contentPane;
	String name;
	String username;
	String mobile;
	String password;
	Random rand = new Random();
	int num = rand.nextInt(99999);
	String account = Integer.toString(num);

	/**
	 * Launch the application.
	 */
	
	//set movable
			int xMouse;

			int yMouse;
			private JTextField txtName;
			private JTextField txtUsername;
			private JPasswordField passwordField;

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
			
			 static MaskFormatter createFormatter(String format) {
			        MaskFormatter formatter = null;
			        try {
			            formatter = new MaskFormatter(format);
			            formatter.setPlaceholderCharacter('.');
			        } catch (java.text.ParseException exc) {
			            System.err.println("formatter is bad: " + exc.getMessage());
			            System.exit(-1);
			        }
			        return formatter;
			    }
	

			public void run() {
				try {
					signup frame = new signup();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public signup() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setOpaque(false);
		contentPane.setBackground(new Color(0,0,0,100));
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 720, 23);
		panel_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(204, 0, 0)));
		panel_1.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_1);
		
		JLabel txtX = new JLabel();
		txtX.setBounds(700, -1, 20, 23);
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
		
		lblNewLabel_2.setBounds(28, 0, 669, 23);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		panel_1.add(lblNewLabel_2);
		
		JLabel lblD = new JLabel();
		lblD.setBounds(4, 0, 23, 19);
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
		
		Image dimg1 = img1.getScaledInstance(lblD.getWidth(), lblD.getHeight(),Image.SCALE_SMOOTH);
		
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
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(296, 23, 420, 575);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtName.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtName.setColumns(10);
		txtName.setBounds(44, 109, 336, 40);
		panel.add(txtName);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.BLACK);
		txtUsername.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtUsername.setColumns(10);
		txtUsername.setBounds(44, 191, 336, 40);
		panel.add(txtUsername);
		
		JFormattedTextField textField_2 = new JFormattedTextField(createFormatter("(639) ###-###-###"));
		textField_2.setText("Mobile Number");
		textField_2.setForeground(Color.BLACK);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(44, 276, 336, 40);
		panel.add(textField_2);
		
		passwordField = new JPasswordField("");
		passwordField.setForeground(Color.BLACK);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 14));
		passwordField.setColumns(10);
		passwordField.setBounds(44, 360, 336, 40);
		panel.add(passwordField);
		
		
		
		JLabel label_5 = new JLabel("first name, last name, e.g.  Juan dela Cruz");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Verdana", Font.PLAIN, 10));
		label_5.setBounds(138, 149, 242, 12);
		panel.add(label_5);
		
		JLabel lblSignupForA = new JLabel("Signup for a new account");
		lblSignupForA.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignupForA.setFont(new Font("SansSerif", Font.BOLD, 19));
		lblSignupForA.setBounds(110, 34, 252, 40);
		panel.add(lblSignupForA);
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(62, 34, 48, 40);
		panel.add(label_7);
		
		BufferedImage img2 = null;
		try {
		    img2 = ImageIO.read(new File("./src/logo/login_temp.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg2 = img2.getScaledInstance(label_7.getWidth(), label_7.getHeight(),
		        Image.SCALE_SMOOTH);
		ImageIcon imageIcon2 = new ImageIcon(dimg2);
		label_7.setIcon(imageIcon2);
		
		JLabel label_8 = new JLabel("e.g. juan_01, juan01");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setFont(new Font("Verdana", Font.PLAIN, 10));
		label_8.setBounds(256, 229, 124, 12);
		panel.add(label_8);
		
		JButton button = new JButton("Sign up");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					name = txtName.getText();
					username = txtUsername.getText();
					mobile = textField_2.getText();
					password = passwordField.getText().toString();
					
					
					if(name.equals("") || username.equals("") || mobile.equals("") || password.equals("")) {
						JOptionPane.showMessageDialog(null, "Fill up all forms", "Signup Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
					
					String loc = "./src/database/clientssign.txt";
					login_client log = new login_client();
					FileReader fr = new FileReader(loc);
		            BufferedReader br = new BufferedReader(fr);
					String line;
					boolean isLoginSuccess = false;
					
					
						while((line = br.readLine()) != null)  {
							String[] split = line.split("\\,");
			    		    		    		    
			    		    if(name.equals(split[1]) || username.equals(split[2])) {
			    		    	JOptionPane.showMessageDialog(null, "Name or Username already exists", "Warning", JOptionPane.WARNING_MESSAGE);
			    		    	isLoginSuccess = true;
			    		    }
			    		    			    		    
			            }
						
						
						if(!isLoginSuccess) {
								File file = new File("./src/database/clientssign.txt");
					           //if the file not exist create one
					           if(!file.exists()){
					              file.createNewFile();
					           }
//					           
					           FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
					           BufferedWriter bw = new BufferedWriter(fw);
							
							bw.write(account+",");
							bw.write(name+",");
							bw.write(username+",");
							bw.write(mobile);
							bw.newLine();
							bw.close();
							savePassword();
							saveAcc();
							
		    		    	log.setVisible(true);
							log.setLocationRelativeTo(null);
							JOptionPane.showMessageDialog(null, "This is your account number "+account, "Account number", JOptionPane.INFORMATION_MESSAGE);
							dispose();
						}
						br.close();
						}
							
							
							
											
							
							
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Fill up all forms", "Signup Error", JOptionPane.ERROR_MESSAGE);
					}
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 16));
		button.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		button.setBackground(Color.WHITE);
		button.setBounds(44, 449, 336, 49);
		panel.add(button);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblName.setBounds(44, 96, 124, 12);
		panel.add(lblName);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblUsername.setBounds(44, 172, 124, 12);
		panel.add(lblUsername);
		
		JLabel lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblMobileNumber.setBounds(44, 265, 124, 12);
		panel.add(lblMobileNumber);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblPassword.setBounds(44, 347, 124, 12);
		panel.add(lblPassword);
		
		JLabel lblMustNotInput = new JLabel("must not input username");
		lblMustNotInput.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMustNotInput.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblMustNotInput.setBounds(223, 399, 157, 12);
		panel.add(lblMustNotInput);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 23, 297, 575);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Daenerys'");
		label.setBounds(99, 208, 140, 38);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 24));
		panel_2.add(label);
		
		JLabel label_10 = new JLabel();
		label_10.setBounds(38, 244, 226, 25);
		label_10.setText("BAYAD CENTER");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(new Color(255, 102, 0));
		label_10.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		label_10.setBackground(Color.WHITE);
		panel_2.add(label_10);
		
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(30, 138, 125, 109);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_11);
		
		Image dimg3 = img1.getScaledInstance(label_11.getWidth(), label_11.getHeight(),Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon3 = new ImageIcon(dimg3);
		label_11.setIcon(imageIcon3);
		
		JLabel lblNewLabel = new JLabel("<html><center><h1>Your ALL in ONE Bayad Bills Center.</h1> <h2>Hustle free and fast service just like a snap!</h2></center></html>");
		lblNewLabel.setBounds(38, 294, 226, 167);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JButton button_1 = new JButton();
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_client log = new login_client();
				log.setVisible(true);
				log.setLocationRelativeTo(null);
				dispose();
			}
		});
		button_1.setText("Back");
		button_1.setHorizontalAlignment(SwingConstants.CENTER);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		button_1.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		button_1.setBackground(new Color(0, 153, 255));
		button_1.setBounds(62, 520, 177, 31);
		panel_2.add(button_1);
		
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
		
		
		
	}
	
	
	public void savePassword() {
		try {
			//"./src/database/userpass.txt"
			File file = new File("./src/database/userpass.txt");
	          
			//if the file not exist create one
	           if(!file.exists()){
	              file.createNewFile();
	           }
	           
	        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	        BufferedWriter bw = new BufferedWriter(fw);
			bw.write(username+",");
			bw.write(password);
			bw.newLine();
			bw.close();   
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void saveAcc() {
		try {
			//"./src/database/userpass.txt"
			File file = new File("./src/database/accuser.txt");
	          
			//if the file not exist create one
	           if(!file.exists()){
	              file.createNewFile();
	           }
	           
	        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	        BufferedWriter bw = new BufferedWriter(fw);
			bw.write(username+":");
			bw.write(account);
			bw.newLine();
			bw.close();   
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
