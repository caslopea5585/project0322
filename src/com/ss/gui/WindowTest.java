/*
 * �̺�Ʈ ���α׷��ֽ� �����ʰ� �������̽��̱� ������
 * �� �ϳ��� �޼��带 �������̵� ���� ������ ���������� ����� ���� �Ǿ� ������ ������ ���Եȴ�.
 * �� ��Ģ�� Ư���� �߻�޼��带 ���� ������ �������̽��� ��� �ʹ� ��ȿ�����̰� �ǰ��ϴ�...
 * 
 * �ذ�å) �����ڸ� ����Ͽ� �̹� �������� �ż������ ������ �س��� ��ü���� ������ ����Ͷ� �Ѵ�!!
 * But!!! ����ʹ� ������ �����Ǵ°� �ƴ϶� , ����� ����� ���� 3���̻��� �߻�޼��带 ������ �����ʶ��
 * 			����� ������ �ϴ� �ǽ��غ��� �Ѵ�.
 * */
package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*������ �̺�Ʈ�� �����غ���!*/
public class WindowTest extends JFrame{
	
	JButton bt;
	
	public WindowTest() {
		bt=new JButton("����ư");
		setLayout(new FlowLayout());
	
		add(bt);
		
		addWindowListener(new MyAdapter());
		setSize(300, 400);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new WindowTest();
	}

}
