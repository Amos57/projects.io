package com.Main;

import java.awt.Color;
import java.awt.Graphics;


import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;







import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.caci.Fires;
import com.caci.Kaki;

public class Panel extends JPanel implements ActionListener{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	public static final int WIDTH = Main.WIDHT;
	public static final int HEIGHT = Main.HEIGHT;
	public static final int SCALE = Main.SCALE;
	
	protected boolean running=false;
	
	Zmey z= new Zmey();
	//Fires f= new Fires();
	Timer  t = new Timer(1000/z.speed,  this);
    public static ArrayList<Fires>  f;
	Apple apple=new Apple((int)(Math.random()*Main.WIDHT),(int)(Math.random()*Main.HEIGHT));	



	public Panel() {
		

	setBackground(Color.BLACK);
	t.start();
	addKeyListener(new KeyBoard());
	f= new ArrayList<Fires>();
	//z.setPosition();
	setFocusable(true);
	}
	

@Override
public void paint(Graphics g) {
super.paint(g);
g=(Graphics2D)g;
	

 
	for(int i=0;i<z.length;i++){
		g.setColor(Color.green);
		g.fillRect(z.zX[i]*Main.SCALE+1, z.zY[i]*Main.SCALE+1, Main.SCALE-1, Main.SCALE-1);
}
	
	g.setColor(Color.blue);
	g.fillRect(apple.x*Main.SCALE+1, apple.y*Main.SCALE+1, Main.SCALE-1, Main.SCALE-1);
	
	
	for(int i=0; i<f.size();i++){
	f.get(i).paint(g);
}
	
}


public void actionPerformed(ActionEvent e) {
	
z.move();

if(z.zX[0]==apple.x && z.zY[0]==apple.y){
	
   z.length++;
   z.speed++;
   t.stop();
   t = new Timer(1000/z.speed,  this);
   t.start();
   apple.setPosition();
}

if(z.length==2){
	z.speed=2;
	t.stop();
	t = new Timer(1000/z.speed,  this);
	t.start();
}
if(z.crash){
	z.speed--;
	t.stop();
	t = new Timer(1000/z.speed,  this);
	t.start();
	z.crash=false;
}
if(z.zX[0]==Kaki.x && z.zY[0]==Kaki.y){

//	Kaki.setPosition();
}
Main.setTiil("������     |Life = "+z.life+"   |Length = "+z.length+"   |Speed = "+z.speed +"  "+running);

for(int i=0; i<f.size();i++){
	f.get(i).move();
}

repaint();
	
}


private class KeyBoard extends KeyAdapter{
	
	@Override
	public void keyPressed(KeyEvent e) {
	z.KeyPressed(e);
    int key=e.getKeyCode();
    if(key==KeyEvent.VK_SPACE){
    	running=true;
    
   }if(key==KeyEvent.VK_ENTER){
    	t.start();
    	running=false;
    }if(key==KeyEvent.VK_Q){
		f.add(new Fires());
		System.out.println(f);
    }
    
    
	}
	@Override
	public void keyReleased(KeyEvent e) {
	    int key=e.getKeyCode();
	    if(key==KeyEvent.VK_SPACE){
	    
	    	t.stop();
	   }
	}
}

	
	
}

	



