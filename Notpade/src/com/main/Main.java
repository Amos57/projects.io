package com.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.brawser.Brawser;
import com.file.NewFile;
import com.toolbar.ToolBar;


public class Main {
private static JFrame frame =new JFrame();
	public static void main(String[] args) {
		frame.setSize(500, 700);
	//	frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(new Brawser());
		frame.add(new ToolBar(),BorderLayout.NORTH);
		frame.add(NewFile.tabs);
		frame.setVisible(true);

	}
public static void setTitle(String title){
	frame.setTitle(title);
}
}
