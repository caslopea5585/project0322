package com.ss.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	String msg="³ª ´­·³?";
	private MyWin myWin;
	

	public void setMyWin(MyWin myWin) {
		this.myWin = myWin;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("³ª ´­·¶¾î?");
		myWin.area.setText("´­·¶´Ï");
		
	}


	
	
}
