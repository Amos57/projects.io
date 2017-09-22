package com.brawser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import com.edit.Delete;
import com.toolbar.ToolBar;

public class Brawser extends Delete{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6L;
     
	protected JEditorPane braws;
	private final String URL = "https://"; 
	
	public Brawser() {
	
		brs.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
				    braws= new JEditorPane(URL+ToolBar.text.getText());
					braws.setContentType("text/html");
					braws.setEditable(false);
					braws.addHyperlinkListener(new HyperlinkListener() {
						public void hyperlinkUpdate(HyperlinkEvent e) {
							  if ( e.getEventType() != HyperlinkEvent.EventType.ACTIVATED) return;
							try {	braws.setPage(e.getURL());} catch (IOException e1) {e1.printStackTrace();}	
						}
					});
					ToolBar.text.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
                         String url=ToolBar.text.getText();
                         try {	braws.setPage(URL+url);} catch (IOException e1) {e1.printStackTrace();}	
						}
					});
				} catch (IOException e1) {e1.printStackTrace();}
				
				JScrollPane scroll= new JScrollPane(braws);
				tabs.add(scroll,"Internet");
					
				}
				
			
		});
		
	}
	
}
