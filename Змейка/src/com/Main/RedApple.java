package com.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class RedApple extends Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	protected Font font = new Font("Arial",Font.BOLD,35);

	 //���� �����
		public static  int x=0;
        public static  int y=0;
       
	//������ �����
	    public static int zrX=0;
	    public static int zrY=0;
	//������ �����
        public static int x2=0;
        public static int y2=0;

	//������ ������
	    public static int xZ=0;
	    public static int yZ=0;
    //���
	    public static int nosX=0;
	    public static int nosY=0;
	
	@Override
	public void paint(Graphics g) {
super.paint(g);		
for(int i=0;i<z.length;i++){
	if(z.zX[i]==apple.x& z.zY[i]==apple.y){
		g.setColor(Color.red);
		g.fillRect(apple.x*Main.SCALE+1, apple.y*Main.SCALE+1, Main.SCALE-1, Main.SCALE-1);
	}else{
		g.setColor(Color.blue);
	}
}		
	
	g.setColor(Color.green);
	g.fillOval(z.zX[0]*Main.SCALE+13+nosX, z.zY[0]*Main.SCALE+nosY, SCALE, SCALE);


	g.setColor(Color.white);
	g.fillOval(z.zX[0]*Main.SCALE+1+x, z.zY[0]*Main.SCALE+1+y, SCALE/2, SCALE/2);

	
	g.setColor(Color.black);
	g.fillOval(z.zX[0]*Main.SCALE+3+x, z.zY[0]*Main.SCALE+3+y, 5, 5);	


	g.setColor(Color.white);
	g.fillOval(z.zX[0]*Main.SCALE+1+x2, z.zY[0]*Main.SCALE+15+y2, SCALE/2, SCALE/2);

	g.setColor(Color.black);
	g.fillOval(z.zX[0]*Main.SCALE+3+x2, z.zY[0]*Main.SCALE+17+y2, 5, 5);
	

	g.setColor(Color.red);
	//g.drawRect(zmey.zX[0]*SCALE, zmey.zY[0]*SCALE, 15, 15);

		
	}
	
}
