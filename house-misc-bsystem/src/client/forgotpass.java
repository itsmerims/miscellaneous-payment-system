package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.util.Objects;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import admin.admin_pass;
import client.Client;
import login_signup.login_client;

import javax.swing.border.MatteBorder;

public class forgotpass extends JFrame {

	private JPanel contentPane;
	private JLabel txtX;
	String pass;
	String user;
	String temp;
	/**
	 * Launch the application.
	 */
	//set movable
		int xMouse;

		int yMouse;
		private JTextField txtUser;
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
		
			public void run() {
				try {
					forgotpass frame = new forgotpass();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public forgotpass() {
		setUndecorated(true);
		setResizable(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 314);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color light_blue = new Color(0, 153, 255);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(2, 24, 409, 247);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setCaretColor(Color.WHITE);
		txtUser.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txtUser.setOpaque(false);
		txtUser.setBackground(Color.BLACK);
		txtUser.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		txtUser.setForeground(Color.WHITE);
		txtUser.setBounds(84, 146, 246, 40);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setVisible(false);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		passwordField.setCaretColor(Color.WHITE);
		passwordField.setOpaque(false);
		passwordField.setBounds(84, 146, 246, 40);
		panel.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 11, 103, 71);
		panel.add(lblNewLabel);
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./src/logo/forgot.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon = new ImageIcon(dimg);
		lblNewLabel.setIcon(imageIcon);
		
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("./src/logo/client.png").getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
		
		JLabel lblForgotPassword = new JLabel("FORGOT PASSWORD");
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setForeground(Color.WHITE);
		lblForgotPassword.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblForgotPassword.setBounds(10, 86, 389, 29);
		panel.add(lblForgotPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Type your username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 119, 389, 29);
		panel.add(lblNewLabel_1);
		
		ImageIcon imageIcons = new ImageIcon(new ImageIcon("./src/logo/Stark-icon.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
		
		
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
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		
		
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("./src/logo/black.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		
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
		
		JLabel label = new JLabel("");
		label.setBounds(0, 1, 27, 21);
		panel_1.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		label.setIcon(imageIcon1);
		
		BufferedImage img1 = null;
		try {
		    img1 = ImageIO.read(new File("C:\\Finals_project\\house-misc-bsystem\\src\\logo\\back1.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		JLabel lblTypeYourNew = new JLabel("Type your new password");
		lblTypeYourNew.setVisible(false);
		lblTypeYourNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblTypeYourNew.setForeground(Color.WHITE);
		lblTypeYourNew.setFont(new Font("Verdana", Font.BOLD, 14));
		lblTypeYourNew.setBounds(10, 119, 389, 29);
		panel.add(lblTypeYourNew);
		
		JButton button = new JButton("BACK");
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		button.setBackground(Color.WHITE);
		button.setBounds(56, 207, 141, 29);
		panel.add(button);
		
		JButton btnNext = new JButton("NEXT");
		
		
		JButton btnChangePassword = new JButton("CHANGE PASSWORD");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				user = txtUser.getText();
				pass = passwordField.getText();
				String line, username, oldpass;
				boolean isLoginSuccess = false;
				String file = "./src/database/userpass.txt";
				BufferedReader br = new BufferedReader(new FileReader(file)); 
				  while ((line = br.readLine()) != null) {
					  username = line.split(",")[0];
					  oldpass = line.split(",")[1];
				  		if (username.equals(user)) {
	                    isLoginSuccess = true;
	                    temp = oldpass.toString();
	                    
				  }
				  }
				  if (!isLoginSuccess) {
		                JOptionPane.showMessageDialog(null, "USERNAME WRONG", "WARNING!!", JOptionPane.WARNING_MESSAGE);
		            }
				  else {
					  changepass(file, temp, pass);
					  JOptionPane.showMessageDialog(null, "Password change succesfully!", "Forgot Password", JOptionPane.INFORMATION_MESSAGE);
					  login_client log = new login_client();
					  log.setVisible(true);
					  log.setLocationRelativeTo(null);
					  dispose();
				  }
		            br.close();
				
				
				}
				catch(Exception ex) {
					
				}
				
			}
		});
		btnChangePassword.setVisible(false);
		btnChangePassword.setFont(new Font("Verdana", Font.BOLD, 13));
		btnChangePassword.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		btnChangePassword.setBackground(Color.WHITE);
		btnChangePassword.setBounds(207, 207, 158, 29);
		panel.add(btnChangePassword);
		btnNext.setFont(new Font("Verdana", Font.BOLD, 15));
		btnNext.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(207, 207, 141, 29);
		panel.add(btnNext);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					user = txtUser.getText();
					pass = passwordField.getText();
					String line, username, oldpass;
					boolean isLoginSuccess = false;
					String file = "./src/database/userpass.txt";
					BufferedReader br = new BufferedReader(new FileReader(file)); 
					  while ((line = br.readLine()) != null) {
						  username = line.split(",")[0];
						  oldpass = line.split(",")[1];
					  		if (username.equals(user)) {
		                    isLoginSuccess = true;
		                    temp = oldpass.toString();
		                    
					  }
					  }
					  if (!isLoginSuccess) {
			                JOptionPane.showMessageDialog(null, "USERNAME WRONG", "WARNING!!", JOptionPane.WARNING_MESSAGE);
			            }
					  else {
						  btnNext.setVisible(false);
							btnChangePassword.setVisible(true);
							lblTypeYourNew.setVisible(true);
							passwordField.setVisible(true);
							txtUser.setVisible(false);
							lblNewLabel_1.setVisible(false);
					  }
			            br.close();
					
					
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Error@"+ex.toString(), "WARNING!!", JOptionPane.WARNING_MESSAGE);
					}
				
				

			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 409, 247);
		panel.add(lblNewLabel_4);
		
		Image dim1 = img1.getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon11 = new ImageIcon(dim1);
		lblNewLabel_4.setIcon(imageIcon11);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(0, 0, 413, 314);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel textArea_1 = new JLabel();
		textArea_1.setHorizontalAlignment(SwingConstants.CENTER);
		textArea_1.setText("\u00A9 2019 Daenerys'. All rights reserved.");
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_1.setBackground(new Color(0, 0, 0));
		textArea_1.setBounds(10, 277, 393, 25);
		panel_2.add(textArea_1);
	}
	
	public static void changepass(String filePath, String oldString, String newString) {
	        File fileToBeModified = new File(filePath);
	         
	        String oldContent = "";
	         
	        BufferedReader reader = null;
	         
	        FileWriter writer = null;
	         
	        try
	        {
	            reader = new BufferedReader(new FileReader(fileToBeModified));
	             
	            //Reading all the lines of input text file into oldContent
	             
	            String line = reader.readLine();
	             
	            while (line != null) 
	            {
	                oldContent = oldContent + line + System.lineSeparator();
	                 
	                line = reader.readLine();
	            }
	             
	            //Replacing oldString with newString in the oldContent
	             
	            String newContent = oldContent.replaceAll(oldString, newString);
	             
	            //Rewriting the input text file with newContent
	             
	            writer = new FileWriter(fileToBeModified);
	             
	            writer.write(newContent);
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                //Closing the resources
	                 
	                reader.close();
	                 
	                writer.close();
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	

