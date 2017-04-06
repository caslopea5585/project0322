package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyKeyAdapter extends KeyAdapter{
	JTextArea area;
	JTextField txt;
	
	public MyKeyAdapter(JTextArea area, JTextField txt) {
		this.area=area;
		this.txt=txt;
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			String msg = txt.getText();
			area.append(msg+"\n");
			txt.setText("");
		}
	}
}
