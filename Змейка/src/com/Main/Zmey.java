package com.Main;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import com.caci.Kaki;

public class Zmey {

	public static int vector=0;
	public int length=2;
	public int speed=2;
	public boolean crash=false;
	public int[] zX=new int[200];
	public int[] zY=new int[200];
	
	public int life = 3;

	public Zmey() {
		zX[0]=10;
		zY[0]=10;
		zX[1]=9;
		zY[1]=10;
	}
	public Zmey(int x,int y){
		zX[0]=x;
		zY[0]=y;
	}

	
	public void move(){
		
		for(int i = length;i>0;i--){
			zX[i]=zX[i-1];
			zY[i]=zY[i-1];
		}
		if(vector==0) zX[0]++;
		if(vector==1) zY[0]++;
		if(vector==2) zX[0]--;
		if(vector==3) zY[0]--;
		
		for(int i=length;i>0;i--){
			if(zX[0]==zX[i] & zY[0]==zY[i]){
				crash=true;
				life--;
				
				speed--;
				JOptionPane.showMessageDialog(null, "� ��� �������� - "+life+"������");
				window();
	            newGame();
			}
		}
		
		
		if(zX[0]<0 || zY[0]<0 || zX[0] >Main.WIDHT-1 || zY[0] > Main.HEIGHT-1 ){
			life--;
			crash=true;
			speed--;
			JOptionPane.showMessageDialog(null, "� ��� �������� - "+life+"������");
				window();
			   newGame();
		}		
			
		if(zX[0]==Kaki.x && zY[0]==Kaki.y ){
			life--;
			crash=true;
			speed--;
			JOptionPane.showMessageDialog(null, "� ��� �������� - "+life+"������");
				window();
			   newGame();
		}
		
		
		
		
	}
	public void KeyPressed(KeyEvent e){
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT & vector!=2){
			vector=0;
			RedApple.nosX=0;
			RedApple.nosY=0;
			RedApple.x=0;
			RedApple.y=-3;
			RedApple.x2=0;
			RedApple.y2=0;

			
		}
		if(key==KeyEvent.VK_DOWN & vector!=3){
			vector=1;
			RedApple.nosX=-13;
			RedApple.nosY=13;
			RedApple.x=13;
			RedApple.y=5;
			RedApple.x2=-3;
			RedApple.y2=-9;

		}
		if(key==KeyEvent.VK_LEFT & vector!=0){
			vector=2;
			RedApple.nosX=-20;
			RedApple.nosY=0;
			RedApple.x=7;
			RedApple.y=-3;
			RedApple.x2=7;
			RedApple.y2=0;

		}
		if(key==KeyEvent.VK_UP & vector!=1){
			vector=3;
			RedApple.nosX=-13;
			RedApple.nosY=-13;
			RedApple.x=-5;
			RedApple.y=5;
			RedApple.x2=12;
			RedApple.y2=-10;
		}
}

	
	private void newGame(){
		vector=0;
		RedApple.nosX=0;
		RedApple.nosY=0;
		RedApple.x=0;
		RedApple.y=-3;
		RedApple.x2=0;
		RedApple.y2=0;
		setPosition();
	}
	 private void window(){
		 if(life==0){
		 life=3;
			if(	JOptionPane.showConfirmDialog(null, "�� ���������!"+"\n" +"����������� ��� ���?")==JOptionPane.NO_OPTION){
				System.exit(0);
			}	
			length=2;
			speed=2;
				}
	 }
	 public void setPosition(){
		zX[0]=10;
	    zY[0]=10;
	    zX[0]=9;
	    zY[0]=10;
		 
	 }
}
