package com.Main;

public class Apple {

	
	public int x;
	public int y;
	
	public Apple(int x,int y) {
	this.x=x;
	this.y=y;
	}
	public void setPosition(){
		x=(int)(Math.random()*Main.WIDHT);
		y=(int)(Math.random()*Main.HEIGHT);
	}
}
