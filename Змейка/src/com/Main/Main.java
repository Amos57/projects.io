package com.Main;



import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static final int WIDHT = 30;
	public static final int HEIGHT = 30;
	public static final int SCALE = 20;
	
static	JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		
		Image image = new ImageIcon("res/z.png").getImage();
		
		frame.setSize(WIDHT*SCALE+7, HEIGHT*SCALE+27);
	    frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Top());
		frame.setIconImage(image);
		frame.setVisible(true);

	}



	public static void setTiil(String s) {
		
		frame.setTitle(s);
	}

}
