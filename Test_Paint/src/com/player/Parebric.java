package com.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.GamePanel;


public class Parebric {

	private int x;
	private int y;
	
	public int width;
	private int height;
	
	public Parebric() {
		x=(int)(Math.random()*GamePanel.WIDTH*6);
		y=(int)(Math.random()*GamePanel.HEIGHT*2);
		width = 30;
		height= 15;
	}
	public void update(){}
    public Rectangle getRectangl(){return new Rectangle(x,y+15,width,1);}
	public Rectangle getRectanglUp(){return new Rectangle(x,y,width,7);}
    public int getX(){return x;}
	public int getY(){return y;}
	public void render(Graphics g){
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}	
	}

