package com.inointbd.ResturentManagementProject;

import javax.swing.*;
import com.inointbd.ResturentManagementProject.HomeSwing.DoneBut;
//import com.inointbd.ResturentManagementProject.WellComeSwing.DoneBut.DateIn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class WellComeSwing extends JFrame{
	////////////////////////////////////////
	JLabel label_1,label_2,label_3,label_4;
	JTextField day,month, year;

	///////////////////////////////////////////
	
	public WellComeSwing() {	
		WellComeSwing WCS = new WellComeSwing("WelCome!");
		ResetDate RD = new ResetDate();
		
		RD.Reset();
		WCS.setSize(600, 600);
		WCS.Design();
		WCS.DoneButton();
		WCS.setVisible(true);
		WCS.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	public WellComeSwing(String s){
		super(s);
	}
/////////////////////////////////////////////////
	public void Design(){
		getContentPane().setBackground(new Color(205, 141, 248));	
		
		setLayout(null);
		label_1 = new JLabel("Welcome Sir");
		Font f = new Font("Time Roman", Font.BOLD, 30);//set font style & size
		label_1.setFont(f);
		Color c = new Color(0, 0, 0); //RGB color combination
		label_1.setForeground(c);
		label_1.setBounds(200, 20, 200, 40);
		add(label_1);
		
		Font f1 = new Font("Time Roman", Font.PLAIN, 30);
		label_2 = new JLabel("Please enter today's date");
		label_2.setFont(f1);
		label_2.setForeground(c);
		label_2.setBounds(120, 100, 400, 40);
		add(label_2);
		
		label_3 = new JLabel("DD/MM/YYYY");
		label_3.setFont(f1);
		label_3.setForeground(c);
		label_3.setBounds(180, 150, 400, 40);
		add(label_3);
		
		Font f2 = new Font("Time Roman", Font.PLAIN, 15);
		label_4 = new JLabel("N.B. If you do not input date, you never can get access to your selling data for todays");
		label_4.setFont(f2);
		label_4.setForeground(c);
		label_4.setBounds(10, 225, 590, 80);
		add(label_4);
		
		day = new JTextField();
		Font ft = new Font("Arial Black", Font.ITALIC, 20);//set font style & size
		day.setFont(ft);
		day.setBounds(180, 200, 40, 25);
		add(day);
		
		month = new JTextField();
		month.setFont(ft);
		month.setBounds(230, 200, 40, 25);
		add(month);
		
		year = new JTextField();
		year.setFont(ft);
		year.setBounds(280, 200, 80, 25);
		add(year);
	}

	public void DoneButton(){
		JButton buttonDone;
		buttonDone = new JButton("Done");
		
		Font f = new Font("TimesRoman", Font.ITALIC, 35);//set font style & size
		buttonDone.setFont(f);
		buttonDone.setBounds(200, 400, 150, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonDone.setForeground(c3);
		Color c4 = new Color(0, 197, 13);
		buttonDone.setBackground(c4);
		
		buttonDone.addActionListener(new DoneBut());
		add(buttonDone);
	
	}

	
	public class DoneBut extends FileManagement implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			HomeSwing HS = new HomeSwing();
			String date="",st;
			//date = date.concat("\n");
			date= day.getText();
			st=month.getText();
			date= date.concat(st);
			st=year.getText();
			date= date.concat(st);
			try {
				DateWright(date);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			
			dispose();
		}
	
	
	}
	
	public class ResetDate extends FileManagement{
		
		public void Reset(){
			try {
				DateWright("");
			} catch (Exception e) {

			}
		}
	}


/////////////////////////////////////////////////////////////
}