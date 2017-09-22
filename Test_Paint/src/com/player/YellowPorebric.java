package com.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.GamePanel;

public class YellowPorebric {
	private int x;
	private int y;
	
	public int width;
	private int height;
	private float speed=0;
	public YellowPorebric() {
		
		x=(int)(Math.random()*GamePanel.WIDTH*4);
		y=(int)(Math.random()*GamePanel.HEIGHT*-2);
	//	y=(int)(Math.random()*GamePanel.HEIGHT);
		width = 30;
		height= 15;
		
	}
	public void update(){
		speed+=0.05f;
		y=200+(int)(Math.sin(speed)*200);
	}

    public Rectangle getRectangl(){return new Rectangle(x,y+15,width,1);}
		
	
	public Rectangle getRectanglUp(){return new Rectangle(x,y,width,7);}
		
	
	public void render(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	
	}
	public int getX(){return x;}
	public int getY(){return y;}
}

