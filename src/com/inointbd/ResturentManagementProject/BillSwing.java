package com.inointbd.ResturentManagementProject;

import javax.swing.*;

import com.inointbd.ResturentManagementProject.HomeSwing.DoneBut;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillSwing extends JFrame{
////////////////////////////////////////
	Label l1,l2;

///////////////////////////////////////////
	
	public BillSwing() {	
		BillSwing BS = new BillSwing("Total bill");
				
		BS.setSize(400, 400);
		BS.Design();
		BS.DoneButton();
		BS.setVisible(true);
		BS.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	public BillSwing(String s){
		super(s);
	}

	public void Design(){
		Show S = new Show();
		getContentPane().setBackground(new Color(205, 141, 248));	
		l1=new Label(S.TotalCost());
		setLayout(null);
		Font f = new Font("TimesRoman", Font.BOLD, 50);//set font style & size
		l1.setFont(f);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		l1.setForeground(c3);
		Color c2 = new Color(0, 0, 0);
		l1.setBackground(c2);
		l1.setBounds(100,100,190,60);
		add(l1);
	}

	public void DoneButton(){
		JButton buttonDone;
		buttonDone = new JButton("Done");
		
		Font f = new Font("TimesRoman", Font.ITALIC, 35);//set font style & size
		buttonDone.setFont(f);
		buttonDone.setBounds(120, 200, 150, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonDone.setForeground(c3);
		Color c4 = new Color(0, 197, 13);
		buttonDone.setBackground(c4);
		buttonDone.addActionListener(new DoneBut());
		add(buttonDone);
	
	}

	
	public class DoneBut extends FileManagement implements ActionListener{
		
		public void actionPerformed(ActionEvent e){	

			String cost="",date = "",store="";
			try {
				cost = OrderDataRead();
			} catch (Exception e3) {}
			
			try {
				date = DateRead();
			} catch (Exception e4) {}
			
			store = store.concat(date);
			store = store.concat(cost);
			store = store.concat("\n");
			
			try {
				OrderListWright(store);
			} catch (Exception e2) {	}
			
			try {
				OrderDataWright("0");
			} catch (Exception e2) {}
			
			dispose();
	
		}
	}
	
	public class Show extends FileManagement{
		public String TotalCost(){
			String cost="";
			try {
				cost = OrderDataRead();
			} catch (Exception e) {
			
			}
			return cost;
		}

	}


/////////////////////////////////////////////////////////////
}
