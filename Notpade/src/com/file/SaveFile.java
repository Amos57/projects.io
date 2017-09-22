package com.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

import javax.swing.JOptionPane;

import com.main.Main;

public class SaveFile extends OpenFile{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;

	protected static int i=0;//Переменная считывает колличество символов в открытом файле 
	private static  int v=1;//Переменная считывает колличество символов любом файле после изминения

	public SaveFile() {
	
		
		
		saveFile.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					try{
						
				if(tabs.countComponents()!=0){
					Scroll scroll=(Scroll)tabs.getSelectedComponent();
				    String text=scroll.getText();
					
				if(scroll.getOpened()){
					Formatter format= new Formatter(scroll.getPath());
					format.format(text);
					format.close();
			   //     OpenFile.l=text.length();
			
				}else{
					selected.showSaveDialog(null);
		
				File file = selected.getSelectedFile();
		//	v=NewFile.lenght;
					Formatter format= new Formatter(file);				
					format.format(text);
					format.close();
					scroll.setOpened(true);	
				
				}
				}
				} catch (FileNotFoundException e1) {}
			System.out.println(i+"- save file");
			System.out.println("werking metod number 1");
			}
		});
		
	
		
		delet.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
				Scroll scroll=(Scroll)tabs.getSelectedComponent();
				String text=scroll.getText();
				i=text.length();

				
				if(i!=NewFile.lenght & scroll.getOpened()==false){
					System.out.println("1");
				if	(JOptionPane.showConfirmDialog(null, "Save change?")==JOptionPane.NO_OPTION){
					tabs.remove(tabs.getSelectedComponent());
				}else{
					selected.showSaveDialog(null);
					File file = selected.getSelectedFile();
					Formatter format = new Formatter(file);
					format.format(text);
					format.close();
					tabs.remove(tabs.getSelectedComponent());}
				
				}if(i==NewFile.lenght & scroll.getOpened()==false){
					System.out.println("2");
					tabs.remove(tabs.getSelectedComponent());}
					
					
				if(i==OpenFile.l & scroll.getOpened()==true){
					System.out.println("3");
					tabs.remove(tabs.getSelectedComponent());}
						
				if(i!=OpenFile.l & scroll.getOpened()==true){
					System.out.println("4");
					if	(JOptionPane.showConfirmDialog(null, "Save change?")==JOptionPane.NO_OPTION){
						tabs.remove(tabs.getSelectedComponent());
					}else{
						Formatter format = new Formatter(scroll.getPath());
						format.format(text);
						format.close();
						tabs.remove(tabs.getSelectedComponent());}
				}	
			//	if(i==OpenFile.l & scroll.getOpened()==true){tabs.remove(tabs.getSelectedComponent());}
					
				
				
                  
				}catch (Exception e1) {e1.printStackTrace();}

				
			
		}	
		});
		
		
		
		hawSave.addActionListener(new ActionListener() {//saving files in selecting path
			

			public void actionPerformed(ActionEvent e) {
	
			 if(tabs.countComponents()!=0){
			try {	
				selected.showSaveDialog(null);
				Scroll scroll=(Scroll)tabs.getSelectedComponent();
			    String text=scroll.getText();
		
			    File file = selected.getSelectedFile();
         scroll.setOpened(true);
          
         OpenFile.l=text.length();
	  Formatter format = new Formatter(file);	
				format.format(text);
				format.close();
					//	OpenFile.l=i;
				} catch (FileNotFoundException e1) {e1.printStackTrace();}
			System.out.println("werking metod number 3");
			}
			}
		});
		
	
	}
}
