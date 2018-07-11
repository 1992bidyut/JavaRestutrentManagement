package com.inointbd.ResturentManagementProject;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.swing.*;


public class HomeSwing extends JFrame{
	
	public HomeSwing() {	}//	CREATING CONSTRUCTOR 
	public HomeSwing(String s){//CREATING CONSTRUCTOR AND PASSING STRING
		super(s);
	}
	
/////////////////////////////////////////////////INETIALIZATION 

	JLabel title,tabel,time;
	static JTextField tabelNo;
	JButton buttonLunch,buttonBreackfast,buttonDinar,buttonSnack,buttonDrinks, buttonSell, buttonCancle,buttonDone;
	Image img1;
	static int x=140,y=100,x1=25,x2=135,x3=90,OrderClick=0,DoneClick=0,CancleClick=0;
	
	
	////////////////////////////////////
	public void Design(){
		
		setLayout(null);
		Title();
		
		SellButton();
		buttonSell.addActionListener(new SellBut());
		
		BreackfastButton();
		buttonBreackfast.addActionListener(new BreackfastBut());
		
		LunchButton();
		buttonLunch.addActionListener(new LunchBut());
		
		DinarButton();
		buttonDinar.addActionListener(new DinarBut());
		
		SnackButton();
		buttonSnack.addActionListener(new SnackBut());
		
		DrinksButton();
		buttonDrinks.addActionListener(new DrinksBut());
		
		
		CancleButton();
		buttonCancle.addActionListener(new CancleBut());
		
		DoneButton();
		buttonDone.addActionListener(new DoneBut());
	}

////////////////////////////////////////////////////////////
	@SuppressWarnings("serial")
	public void	ImageUP(){
        try {
            final Image backgroundImage = javax.imageio.ImageIO.read(new File("cover.jpg"));
            setContentPane(new JPanel(new BorderLayout()) {//JPlane Constructor override & creating object of child class BorderLayout 
                @Override public void paintComponent(Graphics g) {
                  //  g.drawImage(backgroundImage, 0, 0, this);
                    g.drawImage(backgroundImage, 0, 0, 1280, 720, this);
                    
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }       
	
	}
/////////////////////////////////////////////////////////////////	
	public void Title(){
		title = new JLabel("Petuk Resturent");
		Font f = new Font("Brush Script MT", Font.ITALIC, 100);//set font style & size
		title.setFont(f);
		Color c = new Color(152, 210, 0); //RGB color combination
		title.setForeground(c);
		title.setBounds(400, 10, 700, 100);
		add(title);

	}
/////////////////////////////////////////////////////////////////	
////////////////////////////////////////////////
	public void Tabel(){

		tabel = new JLabel("Enter Tabel No. ");
		Font f = new Font("Arial Black", Font.BOLD, 40);//set font style & size
		tabel.setFont(f);
		Color c = new Color(0, 148, 169); //RGB color combination
		tabel.setForeground(c);		
		tabel.setBounds(300+x3, 300, 400, 50);
		add(tabel);
		tabelNo = new JTextField();
		Font ft = new Font("Arial Black", Font.BOLD, 40);//set font style & size
		tabelNo.setFont(ft);
		tabelNo.setBounds(700+x3, 300, 70, 40);
		add(tabelNo);
	}
	
///////////////////////////////////////////////
	public void SellButton(){
		
		buttonSell = new JButton("Sells/Day");
		Font f = new Font("TimesRoman", Font.ITALIC, 40);//set font style & size
		buttonSell.setFont(f);
		buttonSell.setBounds(525, 600, 250, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonSell.setForeground(c3);
		Color c4 = new Color(160, 21, 226);
		buttonSell.setBackground(c4);
		add(buttonSell);
	
	}
	
	public class SellBut implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			SellCheckSwing SCS = new SellCheckSwing();//CREATING OBJECT OF SellCheckSwing CLASS
			
		}
	}
	///////////////////////////////////////////////////////
	public void BreackfastButton(){
	
	buttonBreackfast = new JButton("Breakfast");
	Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
	buttonBreackfast.setFont(f);
	buttonBreackfast.setBounds(20+x, 200+y, 300, 60);
	Color c3 = new Color(255, 255, 255); //RGB color combination
	buttonBreackfast.setForeground(c3);
	Color c4 = new Color(160, 21, 226);
	buttonBreackfast.setBackground(c4);
	add(buttonBreackfast);
	
	}
	
	public class BreackfastBut implements ActionListener{
	
	@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e){
			BreackfastSwing BS =new BreackfastSwing();//CREATING OBJECT
		
		
		}
	}
///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
	public void LunchButton(){
		
		buttonLunch = new JButton("Lunch");
		Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
		buttonLunch.setFont(f);
		buttonLunch.setBounds(350+x, 200+y, 300, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonLunch.setForeground(c3);
		Color c4 = new Color(160, 21, 226);
		buttonLunch.setBackground(c4);
		add(buttonLunch);
		
	}
	
	public class LunchBut implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			LunchSwing LS =new LunchSwing();//CREATING OBJECT
				     
		}
	}
	/////////////////////////////////////////////////////
	public void DinarButton(){
		
		buttonDinar = new JButton("Dinner");
		Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
		buttonDinar.setFont(f);
		buttonDinar.setBounds(680+x, 200+y, 300, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonDinar.setForeground(c3);
		Color c4 = new Color(160, 21, 226);
		buttonDinar.setBackground(c4);
		add(buttonDinar);
		
	}
	
	public class DinarBut implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			DinarSwing DS =new DinarSwing();//CREATING OBJECT
				     
		}
	}
////////////////////////////////////////////////////////
	public void SnackButton(){
		
		buttonSnack = new JButton("Snacks");
		Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
		buttonSnack.setFont(f);
		buttonSnack.setBounds(300+x1, 300+y, 300, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonSnack.setForeground(c3);
		Color c4 = new Color(160, 21, 226);
		buttonSnack.setBackground(c4);
		add(buttonSnack);
		
	}
	
	public class SnackBut implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			SnackSwing SS =new SnackSwing();//CREATING OBJECT
				     
		}
	}
////////////////////////////////////////////////////////
	public void DrinksButton(){
	
		buttonDrinks = new JButton("Drinks");
		Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
		buttonDrinks.setFont(f);
		buttonDrinks.setBounds(630+x1, 300+y, 300, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonDrinks.setForeground(c3);
		Color c4 = new Color(160, 21, 226);
		buttonDrinks.setBackground(c4);
		add(buttonDrinks);
	
	}
	
	public class DrinksBut implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			DrinksSwing DS =new DrinksSwing();//CREATING OBJECT
	}
	}
	///////////////////////////////////////////////////////////////
	public void DoneButton(){
		
		buttonDone = new JButton("Total Bill");
		Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
		buttonDone.setFont(f);
		buttonDone.setBounds(165+x2, 400+y, 325, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonDone.setForeground(c3);
		Color c4 = new Color(0, 197, 13);
		buttonDone.setBackground(c4);
		add(buttonDone);
	
	}
	
	public class DoneBut implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			BillSwing BS = new BillSwing();//CREATING OBJECT
	}
	}
//////////////////////////////////////////////////////////

	public void CancleButton(){
	
		buttonCancle = new JButton("Cancel Order");
		Font f = new Font("TimesRoman", Font.ITALIC, 50);//set font style & size
		buttonCancle.setFont(f);
		buttonCancle.setBounds(520+x2, 400+y, 325, 60);
		Color c3 = new Color(255, 255, 255); //RGB color combination
		buttonCancle.setForeground(c3);
		Color c4 = new Color(230, 17, 0);
		buttonCancle.setBackground(c4);
		add(buttonCancle);	
	}
	
	public class CancleBut extends FileManagement implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			try {
				OrderDataWright("0"); // CALLING PARENTH CLASS FUNCTION
			} catch (IOException e1) {	}
	}
	}	
	
	////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////	
//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int test=0, x=0,test2=1,test3=0;
		HomeSwing HS = new HomeSwing("Petuk Resturent");
			HS.setSize(1280, 720);//DEFINE SWING SIZE
			HS.ImageUP();
			HS.Design();
			HS.setVisible(true);//ACTIVE SWING VISIBILITY
			WellComeSwing WCS = new WellComeSwing();
			HS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CLOSE SWING USING CROSS BUTTON		
	}
	  
///////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////	

}
