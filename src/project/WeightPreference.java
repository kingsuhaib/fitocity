package project;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

public class WeightPreference extends JFrame implements ActionListener{
	
	JButton back;
	JButton check;
	JButton pref1;
	JButton pref2;
	JButton pref3;
	JButton signup;
	
	WeightPreference(){
		
		AbstractBorder border = new LabelBubbleBorder(new Color(0xECECEC),0,35,0);
		AbstractBorder borderBack = new LabelBubbleBorder(new Color(0x03a9F4),0,0,0);
		AbstractBorder borderUserText = new TextBubbleBorder(new Color(0xffffff),1,10,0);
		AbstractBorder borderSignIn = new TextBubbleBorder(new Color(0x179EFF),1,10,0);
		AbstractBorder borderResetBut = new TextBubbleBorder(new Color(0x041725),1,10,0);
		AbstractBorder borderdots = new DotsBubbleBorder(new Color(0x1858ff),0,180,0);
		AbstractBorder borderSignup = new WelcomeBubbleBorder(new Color(0x179EFF),0,16,0);
		
		Icon bgImg = new ImageIcon("Background2.png");
		JLabel bgImage = new JLabel();
		bgImage.setIcon(bgImg);
		bgImage.setBounds(0,0,1300,768);
		
		JLabel bgLabel = new JLabel();
		bgLabel.setOpaque(true);
		bgLabel.setBackground(new Color(0xECECEC));
		bgLabel.setBounds(460,130,370,485);
		bgLabel.setBorder(border);

		JLabel fitocity = new JLabel();
		fitocity.setText("fitocity.");
		fitocity.setForeground(Color.WHITE);
		fitocity.setFont(new Font("Red Hat Display Bold", Font.BOLD, 30));
		fitocity.setBounds(585,35,300,60);
		
		JLabel loginHead = new JLabel();
		loginHead.setText("Weight Preference");
		loginHead.setForeground(Color.WHITE);
		loginHead.setFont(new Font("Red Hat Display Bold", Font.BOLD, 17));
		loginHead.setBounds(1095,35,165,50);
		
		Icon icon = new ImageIcon("Back-icon-White.png");
		back = new JButton(icon);
		back.setBackground(new Color(0x1080ff));
		back.setFocusPainted(false);
		back.setBounds(40,37,30,30);
		back.addActionListener(this);
		back.setModel(new FixedStateButtonModel());
		back.setBorder(borderBack);
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JLabel dot1 = new JLabel();
		dot1.setOpaque(true);
		dot1.setBackground(new Color(236,236,236,100));
		dot1.setBounds(615,630,15,15);
		dot1.setBorder(borderdots);
		
		JLabel dot2 = new JLabel();
		dot2.setOpaque(true);
		dot2.setBackground(new Color(236,236,236,100));
		dot2.setBounds(640,630,15,15);
		dot2.setBorder(borderdots);
		
		JLabel dot3 = new JLabel();
		dot3.setOpaque(true);
		dot3.setBackground(new Color(236,236,236,220));
		dot3.setBounds(665,630,15,15);
		dot3.setBorder(borderdots);
		
		JLabel bmi = new JLabel();
		bmi.setText("Your BMI is");
		bmi.setForeground(new Color(0xa9a9a9a));
		bmi.setFont(new Font("Red Hat Display Bold", Font.BOLD, 16));
		bmi.setBounds(595, 180, 100,30);
		
		JLabel bmiCount = new JLabel();
		bmiCount.setText("22.1");
		bmiCount.setFont(new Font("Red Hat Display Bold", Font.BOLD, 70));
		bmiCount.setHorizontalAlignment(JLabel.CENTER);
		bmiCount.setVerticalAlignment(JLabel.CENTER);
		bmiCount.setBounds(555, 220, 170, 50);
		
		JLabel descp = new JLabel();
		descp.setText("<html>Based on your BMI, we prefer<br></br> that you choose the following plan!</html>");
		descp.setForeground(new Color(0xa9a9a9a));
		descp.setFont(new Font("Red Hat Display Bold", Font.BOLD, 14));
		descp.setBounds(540, 280,250,60);
		
		pref1 = new JButton();
		pref1.setText("Lose Weight");
		pref1.setFont(new Font("Roboto Bold", Font.BOLD, 14));
		pref1.setBounds(550, 350, 200, 40);
		pref1.setFocusPainted(false);
		pref1.setForeground(Color.WHITE);
		pref1.setBackground(new Color(23, 158, 255,70));
		pref1.setModel(new FixedStateButtonModel());
		pref1.setBorder(borderSignup);
		
		pref2 = new JButton();
		pref2.setText("Maintain Weight");
		pref2.setFont(new Font("Roboto Bold", Font.BOLD, 14));
		pref2.setBounds(550, 400, 200, 40);
		pref2.setFocusPainted(false);
		pref2.setForeground(Color.WHITE);
		pref2.setBackground(new Color(23, 158, 255,236));
		pref2.setModel(new FixedStateButtonModel());
		pref2.setBorder(borderSignup);
		
		pref3 = new JButton();
		pref3.setText("Gain Weight");
		pref3.setFont(new Font("Roboto Bold", Font.BOLD, 14));
		pref3.setBounds(550, 450, 200, 40);
		pref3.setFocusPainted(false);
		pref3.setForeground(Color.WHITE);
		pref3.setBackground(new Color(23, 158, 255,70));
		pref3.setModel(new FixedStateButtonModel());
		pref3.setBorder(borderSignup);
		
		signup = new JButton();
		signup.setText("Sign Up");
		signup.setFont(new Font("Roboto Bold", Font.BOLD, 14));
		signup.setBounds(512, 520, 270, 50);
		signup.setFocusPainted(false);
		signup.setForeground(Color.WHITE);
		signup.setBackground(new Color(0x179EFF));
		signup.addActionListener(this);
		signup.setModel(new FixedStateButtonModel());
		signup.setBorder(borderSignIn);
		signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		this.add(signup);
		this.add(pref2);
		this.add(pref3);
		this.add(pref1);
		this.add(descp);
		this.add(bmiCount);
		this.add(bmi);
		this.add(dot1);
		this.add(dot2);
		this.add(dot3);
		this.add(loginHead);
		this.add(fitocity);
		this.add(back);
		this.add(bgLabel);
		this.add(bgImage);
		
		this.setLayout(null);
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1300,768);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			SignupSecondScreen setupProfile = new SignupSecondScreen();
		}
		
	}

}
