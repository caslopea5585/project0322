package com.ss.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class MyWin extends JFrame{
	JTextField area;
	JButton bt;
	JPanel p_north;
	MyActionListener  myActionListener;
	MyKeyListener myKeyListener;
	
	
	public MyWin() {
		area = new JTextField(50);
		bt = new JButton("¹öÆ°");
		p_north = new JPanel();
		
		p_north.add(area);
		p_north.add(bt);
		
		add(p_north);
		
		myActionListener=new MyActionListener();
		bt.addActionListener(myActionListener);
		
		myKeyListener= new MyKeyListener();
		area.addKeyListener(myKeyListener);
		
		
		myActionListener.setMyWin(this);
		
		
		setBounds(100, 100, 300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}


	public static void main(String[] args){
		new MyWin();
		
	}
}
