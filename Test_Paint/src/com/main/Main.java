package com.main;

import javax.swing.JFrame;

import com.game.GamePanel;

public class Main {

	/**
	 * @param args
	 */
	private static GamePanel game= new GamePanel();
	private static JFrame frame= new JFrame();
	public static void main(String[] args) {
		
	//	frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(game);
	    frame.pack();
	    frame.setVisible(true);
	    game.start();

	}

}
