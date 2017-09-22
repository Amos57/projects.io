package com.file;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Scroll extends JScrollPane{

	private final JTextArea text;
	private boolean   isOpened;;
	private final String path;
	
	public Scroll(JTextArea text,boolean isOpened,String path) {
		super(text);
		this.text=text;
		this.isOpened=isOpened;
		this.path=path;
		
	}
	public String getText(){
		return text.getText();
	}
	public JTextArea getArea(){
		return text;
	}
	public boolean getOpened(){
		return isOpened;
	}
	public String getPath(){
		return path;
	}
	public void setOpened(boolean Opened){
		this.isOpened=Opened;
	}
}
