package com.edit;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;




import java.io.IOException;
import java.util.Scanner;

import com.file.Scroll;

public class Delete extends Finde{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	
	public Delete() {
		
		
		selectAll.addActionListener(new ActionListener() {
			
	public void actionPerformed(ActionEvent e) {
			Scroll scrolll= (Scroll)tabs.getSelectedComponent();
			scrolll.getArea().selectAll();	
			}
		});
		
		
		del.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
	Scroll scroll= (Scroll)tabs.getSelectedComponent();

    String textA=scroll.getText();
	String text=scroll.getArea().getSelectedText();
	
	int select  = textA.lastIndexOf(text);
	
    StringBuffer b= new StringBuffer(textA);
    
    b.delete(select, select+text.length());
	scroll.getArea().setText(b+"");	
		}
		});
		
		
	print.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			Scroll scroll= (Scroll)tabs.getSelectedComponent();
		try {
			Boolean prin=scroll.getArea().print();
		} catch (PrinterException e1) {e1.printStackTrace();}
	
			
		
			
		}
	});	
	past.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			try {
				
		   Scroll scroll= (Scroll)tabs.getSelectedComponent();
	     	
	       Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
	
		   Transferable t= c.getContents(null);
			
		   DataFlavor df= DataFlavor.stringFlavor;
		
		   String st = (String)t.getTransferData(df);

	       c.getContents(new String());
			
		   scroll.getArea().setText(scroll.getArea().getText()+st);
				
			} catch (IOException e1) {e1.printStackTrace();
			} catch (UnsupportedFlavorException e1) {}
		}
	});
	}

	

}
