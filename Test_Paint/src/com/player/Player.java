package com.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;




import com.game.GamePanel;


public class Player {

	
	private int x;
	private int y;
	

	
	private int radius;
	private int speed;
	private int speedBuffer;
	private int jamp;
	public static boolean jamping;
	public static boolean right;
	public static boolean left;
    private Platform platform;

	
	public Player() {


    jamping = false;
    right   = false;
    left    = false;
    radius  = 15;
    jamp = 30;
    
    platform= new Platform();
    x    = 25;
    y    = (platform.getY()-radius*2);
	speed=10;	
	speedBuffer=10;
	}
		
	
	
	public void update() {
	
		if(y<(platform.getY()-250)& jamping){GamePanel.y=-y+250;}
		if(y>(platform.getY()-250)& jamping & GamePanel.y>-500){{GamePanel.y-=speedBuffer;}}//while(GamePanel.y!=-2000)
		if(jamping ){jamp--;   y-=jamp;}
		if(left & x>0 & GamePanel.x<0){GamePanel.x+=speedBuffer;x-=speed;
		}else if(left & x>0){x-=speed;}
		if(right & x<250){x+=speed;
		}else if(right ){GamePanel.x-=speedBuffer;x+=speed;}
		if(y>(platform.getY()+(200)) ){	System.out.print("◊≈ «¿ ‘»√Õﬂ!!!?  ");y=platform.getY();GamePanel.y=-500;GamePanel.x=0;x=25;}

     for(int i=0;i<GamePanel.porebric.length;i++){
    	if(getRect().intersects(GamePanel.porebric[i].getRectangl())){jamp=-10;} 
    	   
    	if(getRect().intersects(GamePanel.porebric[i].getRectanglUp())){
    		   y=GamePanel.porebric[i].getY()-30;
    		 //  x=GamePanel.porebric[i].getX();
    		   jamp=15;	  
       }
       }
    	  for(int i=0;i<GamePanel.greenP.length;i++){
    	    	if(getRect().intersects(GamePanel.greenP[i].getRectangl())){jamp=-10;} 
    	    	   
    	    	if(getRect().intersects(GamePanel.greenP[i].getRectanglUp())){
    	    		   y=GamePanel.greenP[i].getY()-30;
    	    		   jamp=25;	}  
    }
    	  for(int i=0;i<GamePanel.yellow.length;i++){
  	    	if(getRect().intersects(GamePanel.yellow[i].getRectangl())){jamp=-10;} 
  	    	   
  	    	if(getRect().intersects(GamePanel.yellow[i].getRectanglUp())){y=GamePanel.yellow[i].getY()-30; jamp=0;}	
  	    		   
  	               
  	    	    		    
  }
      if(getRect().intersects(platform.getRectUp())){y=platform.getY()-30;jamp=15;}
      if(getRect().intersects(platform.getRectDown()) ){left=false;x=platform.width;}
     
	}
	
	
	
  	public Rectangle getRect(){
		return new Rectangle(x,y,radius*2,radius*2);
	}
	
	public void render(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, 30, 30);
		
	}
	public int getX(){return x;}
	public int getY(){return y;}
	
}
