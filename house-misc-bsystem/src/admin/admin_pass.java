package admin;
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
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import admin.Admin;
import client.Client;
import login_signup.login_admin;
import login_signup.login_client;
import login_signup.picker;

import java.awt.Component;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;

public class admin_pass extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JLabel txtX;
	

	/**
	 * Launch the application.
	 */

	
	//set movable
	int xMouse;

	int yMouse;
	private JTextField textField;

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
					admin_pass frame = new admin_pass();
					frame.setLocationRelativeTo(null);  
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public admin_pass() {
		setUndecorated(true);
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 342);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Color light_blue = new Color(0, 153, 255);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(2, 24, 409, 280);
		contentPane.add(panel);
		panel.setLayout(null);
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./src/login_signup/daenerys-targaryen.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("./src/login_signup/daenerys-targaryen.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		JLabel lblNewLabel_1 = new JLabel("Type the administrator password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 131, 389, 48);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("SHOW");
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JLabel lblHide = new JLabel("HIDE");
		lblHide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHide.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblHide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblHide.setForeground(Color.BLACK);
				lblHide.setBorder(new LineBorder(light_blue));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblHide.setBorder(new LineBorder(new Color(255, 255, 255)));
				lblHide.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtPassword.setEchoChar('�');
				lblHide.setVisible(false);
				lblNewLabel_4.setVisible(true);
			}
		});
		
		lblHide.setForeground(new Color(255, 255, 255));
		lblHide.setFont(new Font("Verdana", Font.BOLD, 12));
		lblHide.setBorder(new LineBorder(new Color(255, 255, 255)));
		lblHide.setBackground(Color.WHITE);
		lblHide.setBounds(331, 190, 46, 40);
		lblHide.setVisible(false);
		panel.add(lblHide);
		
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_4.setBackground(light_blue);
				lblNewLabel_4.setForeground(Color.WHITE);
				lblNewLabel_4.setBorder(new LineBorder(Color.WHITE));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_4.setBorder(new LineBorder(new Color(0, 153, 255)));
				lblNewLabel_4.setBackground(Color.WHITE);
				lblNewLabel_4.setForeground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtPassword.setEchoChar((char) 0);
				lblNewLabel_4.setVisible(false);
				lblHide.setVisible(true);
			}
		});
		
		
		lblNewLabel_4.setBorder(new LineBorder(new Color(0, 153, 255)));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_4.setBounds(331, 190, 46, 40);
		panel.add(lblNewLabel_4);
		
		txtPassword = new JPasswordField();
		txtPassword.setCaretColor(Color.WHITE);
		txtPassword.setBorder(new MatteBorder(0, 0, 3, 0, (Color) Color.WHITE));
		txtPassword.setOpaque(false);
		txtPassword.setToolTipText("Type the default admin password then press enter.");
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				String password = txtPassword.getText();
				
				if(password.contains("admin")) {
					login_admin log = new login_admin();
					log.setVisible(true);
					log.setLocationRelativeTo(null);
					dispose();
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "You typed nothing.", "Password error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "The Administrator password is wrong.", "Password Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Verdana", Font.PLAIN, 15));
		txtPassword.setBounds(30, 190, 291, 40);
		panel.add(txtPassword);
		txtPassword.setColumns(10);
		
		BufferedImage img1 = null;
		try {
		    img1 = ImageIO.read(new File("C:\\Finals_project\\house-misc-bsystem\\src\\logo\\back1.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		
			
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setForeground(Color.BLACK);
				btnNewButton.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
			}
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 153, 255));
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setBorder(new LineBorder(Color.WHITE, 2, true));

			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				picker pick = new picker();
				pick.setVisible(true);
				pick.setLocationRelativeTo(null);  
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 15));
		btnNewButton.setBounds(53, 241, 141, 29);
		panel.add(btnNewButton);
		
		JButton btnEnter = new JButton("NEXT");
		btnEnter.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				btnEnter.setBackground(Color.WHITE);
				btnEnter.setForeground(Color.BLACK);
				btnEnter.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
			}
			public void mouseEntered(MouseEvent e) {
				btnEnter.setBackground(new Color(0, 153, 255));
				btnEnter.setForeground(Color.WHITE);
				btnEnter.setBorder(new LineBorder(Color.WHITE, 2, true));

			}
		});
		btnEnter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = txtPassword.getText();
				
				if(password.contains("admin")) {
					login_admin log = new login_admin();
					log.setVisible(true);
					log.setLocationRelativeTo(null);
					dispose();
				}
				else if(password.equals("")) {
					JOptionPane.showMessageDialog(null, "You typed nothing.", "Password error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "The Administrator password is wrong.", "Password Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEnter.setFont(new Font("Verdana", Font.BOLD, 15));
		btnEnter.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(204, 241, 141, 29);
		panel.add(btnEnter);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 29, 301, 92);
		panel.add(lblNewLabel);
		
		Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),
		        Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(imageIcon);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 0, 409, 280);
		panel.add(lblNewLabel_5);
		
		Image dim1 = img1.getScaledInstance(lblNewLabel_5.getWidth(), lblNewLabel_5.getHeight(),
		        Image.SCALE_SMOOTH);
		ImageIcon imageIcon11 = new ImageIcon(dim1);
		lblNewLabel_5.setIcon(imageIcon11);
		
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
		lblNewLabel_2.setBounds(155, 1, 99, 21);
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
		
		
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("C:\\Finals_project\\house-misc-bsystem\\src\\logo\\black.jpg").getImage().getScaledInstance(22, 23, Image.SCALE_DEFAULT));
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
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(0, 0, 413, 342);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("\u00A9 2019 Daenerys'. All rights reserved.");
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_1.setEditable(false);
		textArea_1.setBackground(Color.DARK_GRAY);
		textArea_1.setBounds(78, 310, 257, 25);
		panel_2.add(textArea_1);
	}
}
