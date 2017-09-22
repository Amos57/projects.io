package com.game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Images {

	
	private Image im1;
	public Images() {
		 im1= new ImageIcon("res/a15pan9.jpg").getImage();

		}
	public void render(Graphics g){
		 g.drawImage(im1, 0, 20+GamePanel.HEIGHT, null);
	}
}
