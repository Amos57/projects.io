package com.menu;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenu menu;
	private JMenu edit;
	private JMenu brawser;
	
	
	protected JMenuItem newFile;
	protected JMenuItem openFile;
	protected JMenuItem saveFile;
	protected JMenuItem hawSave;
	protected JMenuItem print;
	protected JMenuItem delet;
	
	protected JMenuItem find;
	protected JMenuItem time;
	protected JMenuItem selectAll;
	protected JMenuItem past;
	protected JMenuItem del;
	
	protected JMenuItem brs;
	
	public Menu() {
		
		Font font = new Font("TimesNewRom",Font.PLAIN,12);
		
		menu = new JMenu("File");
		menu.setFont(font);
		
		newFile= new JMenuItem("New File");
		newFile.setFont(font);
		menu.add(newFile);
		
		openFile= new JMenuItem("Open File");
		openFile.setFont(font);
		menu.add(openFile);
		
		saveFile= new JMenuItem("Save File");
		saveFile.setFont(font);
		menu.add(saveFile);
		
		
		hawSave= new JMenuItem("Save selected");
		hawSave.setFont(font);
		menu.add(hawSave);
		
		
		
		print= new JMenuItem("Print list");
		print.setFont(font);
		menu.add(print);
		
		delet= new JMenuItem("Close list");
		delet.setFont(font);
		menu.add(delet);
		
		add(menu);
		
		edit=new JMenu("Edit");
		edit.setFont(font);
		
		past= new JMenuItem("Past");
		past.setFont(font);
		edit.add(past);
		
		find= new JMenuItem("Finde");
		find.setFont(font);
		edit.add(find);
		
		time= new JMenuItem("Ocloc");
		time.setFont(font);
		edit.add(time);
		
		selectAll= new JMenuItem("Select all");
		selectAll.setFont(font);
		edit.add(selectAll);
		
		del= new JMenuItem("Delete allocated");
		del.setFont(font);
		edit.add(del);
		
		add(edit);
		
		brawser= new JMenu("Web Brawser");
		brawser.setFont(font);
		
		brs= new JMenuItem("Internet");
		brs.setFont(font);
		brawser.add(brs);
		
		add(brawser);
	}
	

}
