package com.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.caci.Fires;


public class Top extends RedApple{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	
	Font font = new Font("Arial",Font.BOLD,35);
	
	
	@Override
	public void paint(Graphics g) {
	super.paint(g);
		
	if(running){
		g.setFont(font);
		g.setColor(Color.white);
		g.drawString("Pause", 250, 240);
	}else{
		g.dispose();
	}
			
		
	}

}
