package project;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

public class Login extends JFrame implements ActionListener{
	
	JTextField userText;
	JPasswordField passText;
	JButton signin;
	JButton resetBut;
	JButton back;
	
	private final static int VIBRATION_LENGTH = 7;
    private final static int VIBRATION_VELOCITY = 10;
	
	Login(){
		
		AbstractBorder border = new LabelBubbleBorder(new Color(0xECECEC),0,35,0);
		AbstractBorder borderBack = new LabelBubbleBorder(new Color(0x03a9F4),0,0,0);
		AbstractBorder borderUserText = new TextBubbleBorder(new Color(0xffffff),1,10,0);
		AbstractBorder borderSignIn = new TextBubbleBorder(new Color(0x179EFF),1,10,0);
		AbstractBorder borderResetBut = new TextBubbleBorder(new Color(0x041725),1,10,0);
		
		Icon bgImg = new ImageIcon("Background2.png");
		JLabel bgImage = new JLabel();
		bgImage.setIcon(bgImg);
		bgImage.setBounds(0,0,1300,768);
		
		JLabel bgLabel = new JLabel();
		bgLabel.setOpaque(true);
		bgLabel.setBackground(new Color(0xECECEC));
		bgLabel.setBounds(450,150,400,485);
		bgLabel.setBorder(border);

		JLabel fitocity = new JLabel();
		fitocity.setText("fitocity.");
		fitocity.setForeground(Color.WHITE);
		fitocity.setFont(new Font("Red Hat Display Bold", Font.BOLD, 30));
		fitocity.setBounds(585,35,300,60);
		
		JLabel loginHead = new JLabel();
		loginHead.setText("Login");
		loginHead.setForeground(Color.WHITE);
		loginHead.setFont(new Font("Red Hat Display Bold", Font.BOLD, 17));
		loginHead.setBounds(1180,35,200,50);
		
		Icon icon = new ImageIcon("Back-icon-White.png");
		back = new JButton(icon);
		back.setBackground(new Color(0x1080ff));
		back.setFocusPainted(false);
		back.setBounds(40,37,30,30);
		back.addActionListener(this);
		back.setModel(new FixedStateButtonModel());
		back.setBorder(borderBack);
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JLabel username = new JLabel();
		username.setText("Username");
		username.setForeground(new Color(0xa9a9a9));
		username.setFont(new Font("Roboto Regular", Font.BOLD, 14));
		username.setBounds(510,230,100,50);
		
		userText = new JTextField();
		userText.setPreferredSize(new Dimension(200,40));
		userText.setFont(new Font("Roboto Regular", Font.BOLD, 14));
		userText.setBounds(501, 275, 300, 50);
		userText.setBorder(borderUserText);
		
		JLabel password = new JLabel();
		password.setText("Password");
		password.setForeground(new Color(0xa9a9a9));
		password.setFont(new Font("Roboto Regular", Font.BOLD, 14));
		password.setBounds(510,325,100,50);
		
		passText = new JPasswordField();
		passText.setPreferredSize(new Dimension(300,50));
		passText.setBounds(501, 370, 300, 50);
		passText.setBorder(borderUserText);
		
		signin = new JButton();
		signin.setText("Sign In");
		signin.setFont(new Font("Roboto Bold", Font.BOLD, 14));
		signin.setBounds(501, 440, 300, 50);
		signin.setFocusPainted(false);
		signin.setForeground(Color.WHITE);
		signin.setBackground(new Color(0x179EFF));
		signin.addActionListener(this);
		signin.setModel(new FixedStateButtonModel());
		signin.setBorder(borderSignIn);
		signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		resetBut = new JButton();
		resetBut.setText("Reset Password");
		resetBut.setFont(new Font("Roboto Bold", Font.BOLD, 14));
		resetBut.setBounds(501, 505, 300, 50);
		resetBut.setFocusPainted(false);
		resetBut.setForeground(Color.WHITE);
		resetBut.setBackground(new Color(0x041725));
		resetBut.addActionListener(this);
		resetBut.setModel(new FixedStateButtonModel());
		resetBut.setBorder(borderResetBut);
		resetBut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		this.add(username);
		this.add(userText);
		this.add(password);
		this.add(passText);
		this.add(signin);
		this.add(resetBut);
		this.add(bgLabel);
		this.add(loginHead);
		this.add(fitocity);
		this.add(back);
		this.add(bgImage);
		
		this.setLayout(null);
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1300,768);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
//		this.setIconImage(img);
//		this.getContentPane().setBackground(new Color(0x03a9F4));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			WelcomeScreen ws = new WelcomeScreen();
		}
		else if(e.getSource()==signin) {
			this.dispose();
			DashBoard db = new DashBoard();
		}
		else if (e.getSource()==resetBut) {
			
			try {
	            final int originalX = this.getLocationOnScreen().x;
	            final int originalY = this.getLocationOnScreen().y;
	            for (int i = 0; i < VIBRATION_LENGTH; i++) {
	                Thread.sleep(10);
	                this.setLocation(originalX, originalY + VIBRATION_VELOCITY);
	                Thread.sleep(10);
	                this.setLocation(originalX, originalY - VIBRATION_VELOCITY);
	                Thread.sleep(10);
	                this.setLocation(originalX + VIBRATION_VELOCITY, originalY);
	                Thread.sleep(10);
	                this.setLocation(originalX, originalY);
	            }
	        } catch (Exception err) {
	            err.printStackTrace();
	        }
		}
		
	}

}
