package com.caci;


import java.awt.Color;
import java.awt.Graphics;

import com.Main.Panel;
import com.Main.Zmey;




public class Fires {

   
	public static boolean n =true;
	public static int x ;
	public static int y ;
	public static int speed;
	private Color color;
	Zmey z;
	
	
	public Fires() {
		z= new Zmey();
	x=z.zX[0]*Panel.WIDTH;
	y=z.zY[0]*Panel.HEIGHT;
	speed=10;
	color=Color.red;
	}

	public void paint(Graphics g) {
       g.setColor(color);
       g.fillOval(x, y, 10, 10);
    
		
	}
	public  void move(){
        if(Zmey.vector==0) x+=speed;
		if(Zmey.vector==1) y+=speed;
		if(Zmey.vector==2) x-=speed;
		if(Zmey.vector==3) y-=speed;
		
	}	
		
	  
	
}

