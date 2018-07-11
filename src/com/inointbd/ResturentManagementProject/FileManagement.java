package com.inointbd.ResturentManagementProject;
import java.io.*;

import javax.sound.midi.Synthesizer;

public class FileManagement {
	String inputDate,scanDate;
//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	public void OrderDataWright(String st) throws IOException{
		FileOutputStream path;// Object of FileOutputStream class
		path = new FileOutputStream("./Order.dat",false);//creating file in parent directory  
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			path.write(ch[i]);//WRITING DATA TO THE FILE
		}
		path.close();
	}

///////////////////////////////////////////////////////////////////////////////////////	
	@SuppressWarnings("resource")
	public String OrderDataRead() throws IOException{
		int i,j=0;
		FileInputStream path;
		
		path = new FileInputStream("./Order.dat");
		File Order = new File("./Order.dat");
		 long Length = Order.length();// getting length of the file as long type data
		 int arraySize = (int)Length;// convert long to Integer
		char[] ch=new char[arraySize];
		do {
			i=path.read();
			if(i!=-1){	
				ch[j] = ((char)i);//READING DATA FROM FILE AND STORE IN THE ARRAY
			}
			j++;
		} while (i!=-1);
		String st = new String(ch);
		return st;// RETURNING DATA
	}
//////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
	public void DateWright(String st) throws IOException{
		FileOutputStream path;// Object of FileOutputStream class
		path = new FileOutputStream("./Date.dat",false);//creating file in parent directory  
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			path.write(ch[i]);//WRITING DATA TO THE FILE
		}
		path.close();
	}
	///////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public String DateRead() throws IOException{
		int i,j=0;
		FileInputStream path;
		
		path = new FileInputStream("./Date.dat");
		File Order = new File("./Date.dat");
		 long Length = Order.length();// getting length of the file as long type data
		 int arraySize = (int)Length;// convert long to Integer
		char[] ch=new char[arraySize];
		do {
			i=path.read();
			if(i!=-1){	
				ch[j] = ((char)i);//READING DATA FROM FILE AND STORE IN THE ARRAY
			}
			j++;
		} while (i!=-1);
		String st = new String(ch);
		return st;// RETURNING DATA
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////////////////////	
	public void OrderListWright(String st) throws IOException{
		FileOutputStream path;// Object of FileOutputStream class
		path = new FileOutputStream("./OrderList/OrderList.dat",true);//creating file on this parent directory  


		char ch[] = st.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			path.write(ch[i]);
		}
		path.close();

	}
/////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public float OrderListFind(String st) throws IOException{
		int i,Finded=0,dateLength = 8;
		FileInputStream path;
		
		path = new FileInputStream("./OrderList/OrderList.dat");//LODING FILE INTU BUFFER
		File Order = new File("./OrderList/OrderList.dat");
		String dateString="";
		String getValue="";
		float sumofsells=0;
		System.out.println("Referencr input: "+st);
		
		do {
			i=path.read();
			if(i!=-1){
				if((char)i=='\n'){//THIS CONDITION USING FOR SELECTING DATE
					dateString ="";
					
					if(Finded ==1){
						sumofsells = sumofsells+Float.parseFloat(getValue);
						getValue="";
						Finded =0;
					}
					
					for(int k=0 ; k<8;k++){//THIS LOOP USING FOR COLECTING DATE
						i=path.read();
						if((char)i!='\n'){
							dateString = dateString.concat(""+(char)i);
						}					
					}
					i=path.read();
				}
					
				if(dateString.equals(st)){//THIS CONDITION USING FOR MATCHING DATE
					Finded=1;
					if((char)i!='\n'){// COLLECTING DATA ACCORDING TO DATE
						getValue = getValue.concat(""+(char)i);
					}
				}
			}

		} while (i!=-1);	
		
		return sumofsells;//RETUR VALUE ACCORDING TO DATE
	}
	//////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
}

