package com.caci;

import java.awt.Color;
import java.awt.Graphics;

import com.Main.RedApple;

public class Kaki extends RedApple{
  
	public static int x=(int) (Math.random()*WIDTH);
	public static int y=(int) (Math.random()*HEIGHT);
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		
		g.setColor(Color.white);
		g.drawRect(x*SCALE+1, y*SCALE+1, SCALE-1,SCALE-1);
		
	}
	public static void setPosition(){
		x=(int) (Math.random()*WIDTH);
		y=(int) (Math.random()*HEIGHT);
	}
	
	
}
