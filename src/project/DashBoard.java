package project;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.ColorUIResource;

public class DashBoard extends JFrame implements ActionListener{
	
	JButton homeIcon;
	JButton profileIcon;
	JButton gameIcon;
	JButton settingsIcon;
	JButton gameText;
	JButton settingsText;
	JButton profileText;
	JButton homeText;
	JProgressBar counting;
//	JButton covidImg;
	
	DashBoard(){
		
		AbstractBorder border = new WelcomeBubbleBorder(new Color(0xECECEC),2,0,0);
		AbstractBorder rightBorder = new RightMenuBubbleBorder(new Color(0x041725),0,15,0);
		AbstractBorder menuBorder = new LeftMenuBubbleBorder(new Color(0xB8E2F2),0,15,0);
		AbstractBorder rightMenuBorder = new WelcomeBubbleBorder(new Color(0xB8E2F2),0,20,0);
		AbstractBorder homeBorder = new MenuBubbleBorder(new Color(0xB8E2F2),0,0,0);
		AbstractBorder otherBorder = new WelcomeBubbleBorder(new Color(0xFFFFFF),0,0,0);
		
		JLabel leftMenu = new JLabel();
		leftMenu.setOpaque(true);
		leftMenu.setBackground(Color.WHITE);
		leftMenu.setBounds(0,-1,260,768);
		leftMenu.setBorder(border);
		
		Icon logoImg = new ImageIcon("logoDASHBOARD.png");
		JLabel logo = new JLabel();
		logo.setIcon(logoImg);
		logo.setBounds(45,30,153,64);
		
		JLabel rightMenu = new JLabel();
		rightMenu.setOpaque(true);
		rightMenu.setBackground(new Color(0x041725));
		rightMenu.setBounds(1000,27,250,680);
		rightMenu.setBorder(rightMenuBorder);
		
		JLabel diet = new JLabel();
		diet.setText("Include In Diet");
		diet.setForeground(Color.WHITE);
		diet.setFont(new Font("Red Hat Display Bold", Font.BOLD, 19));
		diet.setBounds(1010,45,180,50);
		diet.setBorder(rightBorder);
		
		Icon checkImg = new ImageIcon("checkbox.png");
		JLabel check = new JLabel();
		check.setIcon(checkImg);
		check.setBounds(1022,110,50,50);
		
		JLabel check2 = new JLabel();
		check2.setIcon(checkImg);
		check2.setBounds(1022,170,50,50);
		
		JLabel check3 = new JLabel();
		check3.setIcon(checkImg);
		check3.setBounds(1022,230,50,50);
		
		JLabel check4 = new JLabel();
		check4.setIcon(checkImg);
		check4.setBounds(1022,290,50,50);
		
		JLabel plan = new JLabel();
		plan.setText("Rice");
		plan.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan.setForeground(Color.YELLOW);
		plan.setBounds(1090,115,50,30);
		
		JLabel plan1 = new JLabel();
		plan1.setText("Red Meat");
		plan1.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan1.setForeground(Color.YELLOW);
		plan1.setBounds(1090,175,80,30);
		
		JLabel plan2 = new JLabel();
		plan2.setText("Peanut Butter");
		plan2.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan2.setForeground(Color.YELLOW);
		plan2.setBounds(1090,235,100,30);
		
		JLabel plan3 = new JLabel();
		plan3.setText("Eggs");
		plan3.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan3.setForeground(Color.YELLOW);
		plan3.setBounds(1090,295,50,30);
		
		JLabel exercise = new JLabel();
		exercise.setText("<html>Exercises<br></br>That Can Help</html>");
		exercise.setForeground(Color.WHITE);
		exercise.setFont(new Font("Red Hat Display Bold", Font.BOLD, 19));
		exercise.setBounds(1010,375,180,50);
		exercise.setBorder(rightBorder);
		
		JLabel check5 = new JLabel();
		check5.setIcon(checkImg);
		check5.setBounds(1022,445,50,50);
		
		JLabel check6 = new JLabel();
		check6.setIcon(checkImg);
		check6.setBounds(1022,505,50,50);
		
		JLabel check7 = new JLabel();
		check7.setIcon(checkImg);
		check7.setBounds(1022,565,50,50);
		
		JLabel check8 = new JLabel();
		check8.setIcon(checkImg);
		check8.setBounds(1022,625,50,50);
		
		JLabel plan4 = new JLabel();
		plan4.setText("Running");
		plan4.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan4.setForeground(Color.YELLOW);
		plan4.setBounds(1090,450,100,30);
		
		JLabel plan5 = new JLabel();
		plan5.setText("Push Ups");
		plan5.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan5.setForeground(Color.YELLOW);
		plan5.setBounds(1090,510,140,30);
		
		JLabel plan6 = new JLabel();
		plan6.setText("Pull Ups");
		plan6.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan6.setForeground(Color.YELLOW);
		plan6.setBounds(1090,570,140,30);
		
		JLabel plan7 = new JLabel();
		plan7.setText("Crunches");
		plan7.setFont(new Font("Roboto Regular", Font.PLAIN, 16));
		plan7.setForeground(Color.YELLOW);
		plan7.setBounds(1090,630,100,30);
		
		
		JLabel nameText = new JLabel();
		nameText.setText("Hello Suhaib");
		nameText.setFont(new Font("Red Hat Display Bold", Font.BOLD, 20));
		nameText.setBounds(300,20,180,50);
		
		JLabel msg = new JLabel();
		msg.setText("Good Morning");
		msg.setFont(new Font("Roboto Regular", Font.BOLD, 12));
		msg.setBounds(300,48,80,30);
		msg.setForeground(new Color(0xa9a9a9a));
		
		JLabel line = new JLabel();
		line.setBackground(new Color(0x179EFF));
		line.setOpaque(true);
		line.setBounds(390,63,15,3);
		
		
		Icon imgCovid = new ImageIcon("TOPSECTION.png");
		JLabel covidImg = new JLabel();
		covidImg.setIcon(imgCovid);
		covidImg.setBounds(300, 85, 678,220);
		covidImg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		covidImg.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel covidText = new JLabel();
		covidText.setText("<html>Here's Why COVID-19<br></br>Impacts Your Ability to<br></br>Smell");
		covidText.setFont(new Font("Red Hat Display Bold", Font.BOLD, 20));
		covidText.setForeground(Color.WHITE);
		covidText.setBounds(357, 110, 250, 150);
		covidText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		covidText.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel home = new JLabel();
		home.setOpaque(true);
		home.setBackground(new Color(0xB8E2F2));
		home.setBounds(25,235,210,50);
		home.setBorder(menuBorder);
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		Icon icon = new ImageIcon("Homeblue.png");
		homeIcon = new JButton(icon);
		homeIcon.setBackground(new Color(0xB8E2F2));
		homeIcon.setFocusPainted(false);
		homeIcon.setBounds(40,245,30,30);
		homeIcon.addActionListener(this);
		homeIcon.setModel(new FixedStateButtonModel());
		homeIcon.setBorder(homeBorder);
		homeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		homeText = new JButton();
		homeText.setText("Home");
		homeText.setForeground(new Color(0x179EFF));
		homeText.setBackground(new Color(0xB8E2F2));
		homeText.setFocusPainted(false);
		homeText.addActionListener(this);
		homeText.setModel(new FixedStateButtonModel());
		homeText.setBorder(homeBorder);
		homeText.setFont(new Font("Red Hat Display Bold", Font.BOLD, 15));
		homeText.setBounds(40,245,140,30);
		homeText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		Icon iconP = new ImageIcon("Usergrey.png");
		profileIcon = new JButton(iconP);
		profileIcon.setBackground(new Color(0xFFFFFF));
		profileIcon.setFocusPainted(false);
		profileIcon.setBounds(40,305,30,30);
		profileIcon.addActionListener(this);
		profileIcon.setModel(new FixedStateButtonModel());
		profileIcon.setBorder(otherBorder);
		
		profileText = new JButton();
		profileText.setText("Profile");
		profileText.setForeground(new Color(0xa9a9a9a));
		profileText.setBackground(new Color(0xFFFFFF));
		profileText.setFocusPainted(false);
		profileText.addActionListener(this);
		profileText.setModel(new FixedStateButtonModel());
		profileText.setBorder(otherBorder);
		profileText.setFont(new Font("Red Hat Display Bold", Font.BOLD, 15));
		profileText.setBounds(40,305,140,30);
		
		Icon iconG = new ImageIcon("Collapsegrey.png");
		gameIcon = new JButton(iconG);
		gameIcon.setBackground(new Color(0xFFFFFF));
		gameIcon.setFocusPainted(false);
		gameIcon.setBounds(40,365,30,30);
		gameIcon.addActionListener(this);
		gameIcon.setModel(new FixedStateButtonModel());
		gameIcon.setBorder(otherBorder);
		
		gameText = new JButton();
		gameText.setText("Play a game");
		gameText.setForeground(new Color(0xa9a9a9a));
		gameText.setBackground(new Color(0xFFFFFF));
		gameText.setFocusPainted(false);
		gameText.addActionListener(this);
		gameText.setModel(new FixedStateButtonModel());
		gameText.setBorder(otherBorder);
		gameText.setFont(new Font("Red Hat Display Bold", Font.BOLD, 15));
		gameText.setBounds(55,365,140,30);
		
		Icon iconS = new ImageIcon("Settings-altgrey.png");
		settingsIcon = new JButton(iconS);
		settingsIcon.setBackground(new Color(0xFFFFFF));
		settingsIcon.setFocusPainted(false);
		settingsIcon.setBounds(40,425,30,30);
		settingsIcon.addActionListener(this);
		settingsIcon.setModel(new FixedStateButtonModel());
		settingsIcon.setBorder(otherBorder);
		
		settingsText = new JButton();
		settingsText.setText("Settings");
		settingsText.setForeground(new Color(0xa9a9a9a));
		settingsText.setBackground(new Color(0xFFFFFF));
		settingsText.setFocusPainted(false);
		settingsText.addActionListener(this);
		settingsText.setModel(new FixedStateButtonModel());
		settingsText.setBorder(otherBorder);
		settingsText.setFont(new Font("Red Hat Display Bold", Font.BOLD, 15));
		settingsText.setBounds(40,425,140,30);
		
		Icon bmiImg = new ImageIcon("BMI.png");
		JLabel bmi = new JLabel();
		bmi.setIcon(bmiImg);
		bmi.setBounds(300,320,197,125);
		
		Icon wImg = new ImageIcon("Weight.png");
		JLabel weight = new JLabel();
		weight.setIcon(wImg);
		weight.setBounds(530,320,197,125);
		
		Icon hImg = new ImageIcon("Height.png");
		JLabel height = new JLabel();
		height.setIcon(hImg);
		height.setBounds(760,320,197,125);
		
		JLabel bmiCount = new JLabel();
		bmiCount.setText("22.1");
		bmiCount.setFont(new Font("Red Hat Display Bold", Font.BOLD, 50));
		bmiCount.setBounds(330, 330, 100, 100);
		
		JLabel wCount = new JLabel();
		wCount.setText("178");
		wCount.setFont(new Font("Red Hat Display Bold", Font.BOLD, 50));
		wCount.setBounds(560, 330, 100, 100);
		
		JLabel hCount = new JLabel();
		hCount.setText("176");
		hCount.setFont(new Font("Red Hat Display Bold", Font.BOLD, 50));
		hCount.setBounds(790, 330, 100, 100);
		
		JLabel help = new JLabel();
		help.setText("Need Help?");
		help.setForeground(new Color(0xa9a9a9a));
		help.setFont(new Font("Red Hat Display Bold", Font.BOLD, 14));
		help.setBounds(300, 460, 100,30);
		
		Icon imgHosp = new ImageIcon("Hospitals.png");
		
		JLabel hospital = new JLabel();
		hospital.setIcon(imgHosp);
		hospital.setBounds(300, 500, 50,50);
		hospital.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		hospital.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		Icon imgRem = new ImageIcon("Commonremedies.png");
		JLabel remedies = new JLabel();
		remedies.setIcon(imgRem);
		remedies.setBounds(300, 555, 50,50);
		remedies.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		remedies.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		Icon imgPharm = new ImageIcon("pharmacies.png");
		JLabel pharmacies = new JLabel();
		pharmacies.setIcon(imgPharm);
		pharmacies.setBounds(300, 610, 50,50);
		pharmacies.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		pharmacies.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		Icon imgInfo = new ImageIcon("covidinfo.png");
		JLabel covidInfo = new JLabel();
		covidInfo.setIcon(imgInfo);
		covidInfo.setBounds(300, 665, 50,50);
		covidInfo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		covidInfo.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel help1 = new JLabel();
		help1.setText("Hospitals near you");
		help1.setFont(new Font("Roboto Regular", Font.BOLD, 13));
		help1.setBounds(370,515,150,20);
		help1.setForeground(new Color(0xa9a9a9a));
		
		help1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel help2 = new JLabel();
		help2.setText("Common Remedies");
		help2.setFont(new Font("Roboto Regular", Font.BOLD, 13));
		help2.setBounds(370,570,150,20);
		help2.setForeground(new Color(0xa9a9a9a));
		
		help2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel help3 = new JLabel();
		help3.setText("Nearest Pharmacies");
		help3.setFont(new Font("Roboto Regular", Font.BOLD, 13));
		help3.setBounds(370,625,150,20);
		help3.setForeground(new Color(0xa9a9a9a));
		
		help3.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel help4 = new JLabel();
		help4.setText("Covid Information");
		help4.setFont(new Font("Roboto Regular", Font.BOLD, 13));
		help4.setBounds(370,680,150,20);
		help4.setForeground(new Color(0xa9a9a9a));
		
		help4.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					Desktop.getDesktop().browse(new URI("https://www.healthline.com/health-news/heres-why-covid-19-impacts-your-ability-to-smell"));
					
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		JLabel water = new JLabel();
		water.setText("Water Intake");
		water.setForeground(new Color(0xa9a9a9a));
		water.setFont(new Font("Red Hat Display Bold", Font.BOLD, 14));
		water.setBounds(550, 460, 100,30);
		
		Icon imgGame = new ImageIcon("PlayAGame.png");
		JLabel gameImg = new JLabel();
		gameImg.setIcon(imgGame);
		gameImg.setBounds(550, 575,410,130);
		
		JLabel count = new JLabel();
		count.setText("4/6");
		count.setFont(new Font("Red Hat Display Bold", Font.BOLD, 25));
		count.setBounds(550, 485, 100,40);
		
		JLabel glasses = new JLabel();
		glasses.setText("<html>Glasses<br></br>2 left Today</html>");
		glasses.setForeground(new Color(0xa9a9a9a));
		glasses.setFont(new Font("Red Hat Display Bold", Font.BOLD, 12));
		glasses.setBounds(600, 490, 100,30);
		
		counting = new JProgressBar(0,6);
		counting.setValue(4);
		counting.setBounds(550, 530, 405,25);
		
		this.add(bmiCount);
		this.add(wCount);
		this.add(hCount);
		this.add(hospital);
		this.add(remedies);
		this.add(pharmacies);
		this.add(counting);
		this.add(weight);
		this.add(height);
		this.add(glasses);
		this.add(count);
		this.add(bmi);
		this.add(covidInfo);
		this.add(water);
		this.add(help1);
		this.add(help2);
		this.add(help3);
		this.add(help4);
		this.add(help);
		this.add(logo);
		this.add(check);
		this.add(check2);
		this.add(check3);
		this.add(check4);
		this.add(check5);
		this.add(check6);
		this.add(check7);
		this.add(check8);
		this.add(plan);
		this.add(plan1);
		this.add(plan2);
		this.add(plan3);
		this.add(plan4);
		this.add(plan5);
		this.add(plan6);
		this.add(plan7);
		this.add(exercise);
		this.add(covidText);
		this.add(covidImg);
		this.add(gameImg);
		this.add(homeIcon);
		this.add(homeText);
		this.add(settingsIcon);
		this.add(settingsText);
		this.add(gameIcon);
		this.add(gameText);
		this.add(profileIcon);
		this.add(profileText);
		this.add(nameText);
		this.add(msg);
		this.add(line);
		this.add(home);
//		this.add(settings);
//		this.add(game);
//		this.add(profile);
		this.add(diet);
		this.add(leftMenu);
		this.add(rightMenu);
		
		this.setLayout(null);
		this.setTitle("DashBoard");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1300,768);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(0xd6ecf3));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==homeText) {
			this.dispose();
			Login log = new Login();
		}
		else if(e.getSource()==homeIcon) {
			this.dispose();
			Login log = new Login();
		}
	}

}
