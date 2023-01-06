package login_signup;

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
import java.io.File;
import java.io.IOException;

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

public class picker extends JFrame {

	private JPanel contentPane;
	private JButton txtLogIn;
	private JLabel txtX;
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
					picker frame = new picker();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public picker() {
		setUndecorated(true);
		setOpacity(0.96f);
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(142, 0, 138, 128);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("./src/logo/logo1.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		Image dimg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon = new ImageIcon(dimg);
		lblNewLabel.setIcon(imageIcon);
		
		txtLogIn = new JButton();
		txtLogIn.setBounds(223, 150, 138, 54);
		txtLogIn.setHorizontalTextPosition(SwingConstants.RIGHT);
		txtLogIn.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		txtLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					login_client cli = new login_client();
					cli.setVisible(true);
					cli.setLocationRelativeTo(null);  
					dispose();
				
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
		txtLogIn.setText("Client");
		panel.add(txtLogIn);
		
		ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("C:\\Finals_project\\house-misc-bsystem\\src\\logo\\client.png").getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT));
		txtLogIn.setIcon(imageIcon2);
		
		JLabel lblNewLabel_1 = new JLabel("Choose which type of account you have");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 99, 389, 40);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		
		JButton btnAdmin = new JButton();
		btnAdmin.setBounds(58, 150, 138, 54);
		btnAdmin.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdmin.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnAdmin.setFocusPainted(false);
		btnAdmin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				btnAdmin.setBackground(new Color(0, 153, 255));
				btnAdmin.setForeground(Color.WHITE);
				btnAdmin.setBorder(new LineBorder(Color.WHITE, 2, true));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdmin.setBackground(Color.WHITE);
				btnAdmin.setForeground(Color.BLACK);
				btnAdmin.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnAdmin.setBackground(light_blue);
			}
			
		});
		btnAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				admin_pass ad = new admin_pass();
				ad.setVisible(true);
				ad.setLocationRelativeTo(null);  
				dispose();
			}
		});
		btnAdmin.setText("Admin");
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setFont(new Font("Verdana", Font.BOLD, 17));
		btnAdmin.setBorder(new LineBorder(new Color(0, 153, 255), 2, true));
		btnAdmin.setBackground(Color.WHITE);
		panel.add(btnAdmin);
		
		ImageIcon imageIcons = new ImageIcon(new ImageIcon("C:\\Finals_project\\house-misc-bsystem\\src\\logo\\Stark-icon.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
		
		
		btnAdmin.setIcon(imageIcons);
		
		BufferedImage img1 = null;
		try {
		    img1 = ImageIO.read(new File("C:\\Finals_project\\house-misc-bsystem\\src\\logo\\back1.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 409, 247);
		panel.add(lblNewLabel_4);
		
		Image dim1 = img1.getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(),
		        Image.SCALE_SMOOTH);
		
		ImageIcon imageIcon11 = new ImageIcon(dim1);
		lblNewLabel_4.setIcon(imageIcon11);
		
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
		
		JLabel label = new JLabel("");
		label.setBounds(0, 1, 27, 21);
		panel_1.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		
		
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("./src/logo/black.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
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
	}

