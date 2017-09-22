package com.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;



import javax.swing.JPanel;

import com.listener.Listener;
import com.player.GreenParebric;
import com.player.Parebric;
import com.player.Platform;
import com.player.Player;
import com.player.YellowPorebric;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable{
	
	public static final int WIDTH  = 500;
	public static final int HEIGHT = 500;
	
	private Thread thread;
	private boolean running;
	private BufferedImage image;
	private Graphics g;
	
	public static int x=0;
	public static int y=-HEIGHT;
	
	private Player player;
	private Platform platform;
	private Images imag;

	public static  Parebric[] porebric= new Parebric[40];
	public static  GreenParebric[] greenP= new GreenParebric[10];
	public static  YellowPorebric[] yellow= new YellowPorebric[2];
	
	public GamePanel() {
		
		image    = new BufferedImage(WIDTH*6, HEIGHT*2, BufferedImage.TYPE_4BYTE_ABGR);
		g = image.getGraphics();
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		player   = new Player();
        platform = new Platform();
        imag=new Images();
		running=false;
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setRequestFocusEnabled(true);
		addKeyListener(new Listener());
		setFocusable(true);
		requestFocus();
		for(int i=0;i<porebric.length;i++){
			porebric[i]=new Parebric();
		}
		for(int i=0;i<greenP.length;i++){
			greenP[i]=new GreenParebric();
		}
		for(int i=0;i<yellow.length;i++){
			yellow[i]=new YellowPorebric();
		}
	}
	
    public void start(){
    	if (running){
    		return;
    	}else{
    		running=true;
    		thread=new Thread(this);
    		thread.start();
    	}
    	
    	
    }
	private void render(){
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH*6, HEIGHT*2);
		imag.render(g);
		player.render(g);
		;
		for(int i=0;i<porebric.length;i++){
			porebric[i].render(g);
		}
		for(int i=0;i<greenP.length;i++){
			greenP[i].render(g);
		}
		for(int i=0;i<yellow.length;i++){
			yellow[i].render(g);
		}
		platform.render(g);
	}	
	
	private void drawBuffer(){
		Graphics g= this.getGraphics();
		g.drawImage(image, x, y,null);}
	
	public void  update(){
		player.update();
		platform.update();
		for(int i=0;i<porebric.length;i++){
		porebric[i].update();
		}
		for(int i=0;i<greenP.length;i++){
			greenP[i].update();
		}
		for(int i=0;i<yellow.length;i++){
			yellow[i].update();
		}
	}
	
	@Override
	public void run() {
       
		
		while(running){
			
			drawBuffer();// фон игры
			render();    // перерисовка
			update();    // обновление координат элементов игры
			
			try {
				thread.sleep(1000/60);
			} catch (InterruptedException e) {e.printStackTrace();}

				
			
		}
	}
    }
	
	

