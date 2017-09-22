package com.edit;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.file.SaveFile;
import com.file.Scroll;

public class Finde extends SaveFile{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	  
	private String word;
	private  Scroll scroll;
	ArrayList<Integer> start;
	ArrayList<Integer> stop;
	
	public Finde() {
	
		 start=new ArrayList<Integer>();
		 stop=new ArrayList<Integer>();
		 
		 
	find.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
		
		
		 Scroll text=(Scroll)tabs.getSelectedComponent();
    
		 String tex=text.getText();
		 
		 //
		 
		 word=JOptionPane.showInputDialog("¬ведите слово");
		 
		 
		 
		 Pattern p = Pattern.compile(word);
		 
		 Matcher m = p.matcher(tex);

	//	if(m.find()){
		 
		 while(m.find()){
			 
			
			 start.add(m.start()); 
			 stop.add(m.end());
			  
			 for(int i=0;i<start.size();i++){
				
			 text.getArea().select(start.get(i),stop.get(i));
			 JOptionPane.showMessageDialog(null,"¬ведите слово");

		 }
			
		 }
			 
		// }else{
		//	JOptionPane.showMessageDialog(null, "»скомое слово отсуствует!");
		// }
		 }	
	});
	
	
	
	time.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
	 scroll=(Scroll)tabs.getSelectedComponent();
     Date d = new Date();
	 scroll.getArea().setText(scroll.getArea().getText() +"  "+ d);
    
	}
	});

}
}