package com.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import com.main.Main;
import com.menu.Menu;

public class NewFile extends Menu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	public static JTabbedPane tabs= new JTabbedPane();
	private int numName=0;
	public static int lenght=0;
	protected String title="Безымянный файл";
	protected String title2=" - Notpade";
	protected boolean open;
	
	public NewFile() {
		
		
		newFile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			     numName++;
			    
					
				JTextArea text = new JTextArea();
				Scroll scroll = new Scroll(text,false,"");
			     
				
				tabs.add(scroll,"New list"+" "+numName);
		        
				String s= scroll.getText();
				
				lenght = s.length();
				
				Main.setTitle(title+" "+numName+" "+title2);
				
				
				
			}
		});
	}

}
