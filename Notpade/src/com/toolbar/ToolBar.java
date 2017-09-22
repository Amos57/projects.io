package com.toolbar;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar{

	
	private JLabel l;
	public static JTextField text= new JTextField("yandex.ru",20);
	
	public ToolBar() {
		 setLayout(new FlowLayout());
		 setFloatable(false);
		 
		l= new JLabel("URL: ");
		
	
		add(l);
		add(text);
	}
}
