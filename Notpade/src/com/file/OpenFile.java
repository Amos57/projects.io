package com.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;

import com.main.Main;

public class OpenFile extends NewFile{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	public static int l=1;
	
	private String text="";
	private Scanner scn;
	public JFileChooser selected = new JFileChooser();
	
	
	
	
	public OpenFile() {


		openFile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				selected.showOpenDialog(null);
				File file = selected.getSelectedFile();
				
				try {
					scn= new Scanner(file);
				

				
				while(scn.hasNext()){
					text+=scn.nextLine()+"\r\n";
				}
				scn.close();
			    
				JTextArea area = new JTextArea();
				Scroll  scroll= new Scroll(area,true,file.getPath());
				tabs.add(scroll,file.getName());
				area.setCursor(getCursor());
				area.setCaretPosition(area.getText().length());
				
				area.setText(text);
				l=text.length();
				text="";
	       
				Main.setTitle(file.getName()+title2);
			
				} catch (FileNotFoundException e1) {}
			
			}	
			
		});
	}

}
