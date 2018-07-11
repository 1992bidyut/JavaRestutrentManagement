package com.inointbd.ResturentManagementProject;

import javax.swing.*;

import com.inointbd.ResturentManagementProject.BreackfastSwing.DoneBut;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LunchSwing extends JFrame{
	//////////////////////////////////////////////
	Label l,billBreackfast;
	int food_number=0;
	int [] Price = new int[100];
	float LunchBill=0,Quantity,bill;
	JTextField [] QuantityArray=new JTextField[100];
	//////////////////////////////////////////////
	
	public LunchSwing() {	
		LunchSwing LS=new LunchSwing("Lunch Manu");
		
		LS.Item();
		LS.setSize(800, 600);
		LS.Design();
		LS.DoneButton();
		LS.setVisible(true);
		LS.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
	}
	public LunchSwing(String s){
		super(s);	
	}

	
	public void Design(){
		getContentPane().setBackground(new Color(205, 141, 248));
		Label l;
		l=new Label("Lunch Item");
		setLayout(null);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		l.setForeground(c3);
		Color c2 = new Color(0, 0, 0);
		l.setBackground(c2);
		l.setBounds(680,5,100,20);
		add(l); 
		
		billBreackfast = new Label();
		Color c = new Color(255, 255, 255); //RGB color combination
		billBreackfast.setForeground(c);
		Color c1= new Color(0, 0, 0);
		billBreackfast.setBackground(c1);
		billBreackfast.setBounds(680,480,100,20);
		add(billBreackfast);
	}
	
	public void DoneButton(){
		JButton buttonDone;
		buttonDone = new JButton("Done");
		Font f = new Font("TimesRoman", Font.ITALIC, 30);//set font style & size
		buttonDone.setFont(f);
		buttonDone.setBounds(680, 510, 100, 30);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonDone.setForeground(c3);
		Color c4 = new Color(0, 197, 13);
		buttonDone.setBackground(c4);
		buttonDone.addActionListener(new DoneBut());
		add(buttonDone);
	
	}
	
	public class DoneBut extends FileManagement implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			float pre_value = 0,cost;
			
			for (int i = 0; i < food_number; i++) {
				float eachCost;
					String str = QuantityArray[i].getText();
					Quantity = Float.parseFloat(str);		
					eachCost = Price[i]*Quantity;
					LunchBill = LunchBill+ eachCost;
				
			}
			String StorValue = ""+LunchBill;
			try {
				pre_value =Float.parseFloat(OrderDataRead());//Extract data  from file
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			cost = LunchBill+pre_value;
			String StorValue1 = ""+cost;
			try {
				OrderDataWright(StorValue1);//Store bill amount in file
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			billBreackfast.setText(""+LunchBill);
			LunchBill =0;
			dispose();
	}
	}


//////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	public void Item(){
		
		JLabel Food1;
		
		int y=0,x=0,i=0;
		
		Food1 = new JLabel("Food 1: Chicken Masla > 120tk");
		Font f = new Font("TimesRoman", Font.BOLD, 25);//set font style & size
		Food1.setFont(f);
		Color c = new Color(0, 0, 0); //RGB color combination
		Food1.setForeground(c);		
		Food1.setBounds(50, y=y+30, 400, 30);
		add(Food1);
		
		QuantityArray[i] = new JTextField("0");
		Font ft = new Font("Arial Black", Font.ITALIC, 20);//set font style & size
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);
		Price[i] = 120;
		i++;
		//////////////////////////////////////////////////////////////
		JLabel Food2;
		//JTextField Quantity2;
		Food2 = new JLabel("Food 2: Chicken Kalo Bhuna > 160tk");
		Food2.setFont(f);
		Food2.setForeground(c);		
		Food2.setBounds(50, y=y+30, 400, 30);
		add(Food2);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);	
		Price[i] = 160;
		i++;		
		////////////////////////////////////////////////////////////////////////
		JLabel Food3;
		//JTextField Quantity3;
		Food3 = new JLabel("Food 3: Mutton Masla > 150tk");
		Food3.setFont(f);
		Food3.setForeground(c);		
		Food3.setBounds(50, y=y+30, 400, 30);
		add(Food3);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);
		Price[i] = 150;
		i++;
		////////////////////////////////////////////////////////////////////////
		JLabel Food4;
		Food4 = new JLabel("Food 4: Korai Mixed Chicken > 175tk");
		Food4.setFont(f);
		Food4.setForeground(c);		
		Food4.setBounds(50, y=y+30, 500, 30);
		add(Food4);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);	
		Price[i] = 175;
		i++;
		/////////////////////////////////////////////////
		JLabel Food5;
		Food5 = new JLabel("Food 5: Morag Polaw > 180tk");
		Food5.setFont(f);
		Food5.setForeground(c);		
		Food5.setBounds(50, y=y+30, 500, 30);
		add(Food5);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);	
		Price[i] = 180;
		i++;
		/////////////////////////////////////////
		JLabel Food6;
		Food6 = new JLabel("Food 6: Irani Biriyani > 180tk");
		Food6.setFont(f);
		Food6.setForeground(c);		
		Food6.setBounds(50, y=y+30, 500, 30);
		add(Food6);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);	
		Price[i] = 180;
		i++;
		////////////////////////////////////////////
		JLabel Food7;
		Food7 = new JLabel("Food 7: Teherani Tehari > 180tk");
		Food7.setFont(f);
		Food7.setForeground(c);		
		Food7.setBounds(50, y=y+30, 500, 30);
		add(Food7);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);	
		Price[i] = 180;
		i++;
		/////////////////////////////////////////////
		JLabel Food8;
		Food8 = new JLabel("Food 8: Vuna Khichuri > 180tk");
		Food8.setFont(f);
		Food8.setForeground(c);		
		Food8.setBounds(50, y=y+30, 500, 30);
		add(Food8);
		
		QuantityArray[i] = new JTextField("0");
		QuantityArray[i].setFont(ft);
		QuantityArray[i].setBounds(600, x=x+30, 70, 25);
		add(QuantityArray[i]);	
		Price[i] = 180;
		i++;
		////////////////////////////////////////////
		food_number = i;
	
}
/////////////////////////////////////////////////////////////
}
