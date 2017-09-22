package com.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Platform {
	
	private int x;
	private int y;
	
	public int width;
	private int height;
	
	public Platform() {
		x=0;
		y=460*2+20;
		width=100;
		height=15;
	}
	public void update(){}
	public void render(Graphics g){
	   	g.setColor(Color.red);
		g.fillRect(x, y, width,height);}
	
	public Rectangle getRectUp(){return new Rectangle(x,y+1,width,1);}
	public Rectangle getRectDown(){return new Rectangle(x+width,y+height,1,height);}
		
    public int getX(){return x;}
    public int getY(){return y;}
  }
       