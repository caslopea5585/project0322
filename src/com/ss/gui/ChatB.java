package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener {
	JTextArea area;
	JScrollPane scroll;
	JPanel p_south;
	JButton bt;
	JTextField t_input;
	//������ �ʿ��� ��ü�� �ִٸ� ��, ����� ��ü�� �ִٸ�
	/*has a����� �����ϸ��*/
	ChatA chatA; // null���� ��
	ChatC chatC;

	public ChatB() {
		area = new JTextArea();
		scroll = new JScrollPane(area);
		p_south = new JPanel();
		t_input = new JTextField(15);
		
		/*
		 * chatA=new ChatA(); new�ϸ� �ȵǴ� ����!! ���ο� ChatA�� �ƴ϶� ���� �¾�� �ߴ� �� ChatA��
		 * �ּҰ��� ���Ѵ�.
		 */
		
		this.add(scroll);
		p_south.add(t_input);
		this.add(p_south, BorderLayout.SOUTH);

		t_input.addKeyListener(this);

		setBounds(400, 100, 300, 400);
		setVisible(true);

	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		// ChatA, ChatC���� �޼��� ������
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			String msg= t_input.getText();
			area.append(msg+"\n");
			chatA.area.append(msg+"\n");
			chatC.area.append(msg+"\n");
			t_input.setText("");
			//����� ALT������ ����Ű ���Ʒ� �ϸ� ���ٴҼ� ����.
		}

	}
	
	//�ܺ��� � ��ü�� ������ �����͸� ���Խ����� �� �ִ� setter�� �غ�����!
	public void setChatA(ChatA chatA){
		this.chatA=chatA;
	}
	public void setChatC(ChatC chatC){
		this.chatC=chatC;
	}

}
