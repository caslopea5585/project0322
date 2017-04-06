package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Adapter extends KeyAdapter{
	
	UseAdapter useAdapter;
	
		
	public void setUseAdapter(UseAdapter useAdapter) {
		this.useAdapter = useAdapter;
	}
	
	
	public void keyReleased(KeyEvent e) {
		if(KeyEvent.VK_ENTER==e.getKeyCode()){
			String msg;
			msg = useAdapter.txt.getText();
			useAdapter.area.append(msg+"\n");
			useAdapter.txt.setText("");
			
		}
		
	
	}
	
}
