package com.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.player.Player;

public class Listener implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
	     int key=e.getKeyCode();
	     if(key==KeyEvent.VK_SPACE) Player.jamping = true;
	     if(key==KeyEvent.VK_RIGHT) Player.right   = true;
	     if(key==KeyEvent.VK_LEFT ) Player.left    = true;
	     
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		 int key=e.getKeyCode();
		 if(key==KeyEvent.VK_RIGHT) Player.right   = false;
	     if(key==KeyEvent.VK_LEFT ) Player.left    = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
