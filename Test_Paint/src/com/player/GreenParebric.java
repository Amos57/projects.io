package com.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.GamePanel;

public class GreenParebric {

	private int x;
	private int y;
	
	public int width;
	private int height;
	
	public GreenParebric() {
		x=(int)(Math.random()*GamePanel.WIDTH*5);
		y=(int)(Math.random()*GamePanel.HEIGHT*2);
		width = 30;
		height= 15;
	}
	public void update(){}

    public Rectangle getRectangl(){return new Rectangle(x,y+15,width,1);}
		
	
	public Rectangle getRectanglUp(){return new Rectangle(x,y,width,7);}
		
	
	public void render(Graphics g){
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	
	}
	public int getX(){return x;}
	public int getY(){return y;}
}
