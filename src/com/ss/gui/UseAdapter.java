package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UseAdapter extends JFrame{
	JTextField txt;
	JButton bt;
	JTextArea area;
	
	Adapter adapter;
	
	
	
	public UseAdapter() {
		txt=new JTextField(20);
		bt= new JButton("����ư");
		area = new JTextArea(20,40);
		
		setLayout(new FlowLayout());
		add(txt);
		add(bt);
		add(area);
		
		//txt�� �����ʿ��� ����
		//txt.addKeyListener(new MyKeyAdapter(area,txt));
		
		//.java������ ����� �������... ,Ŭ���� �ڵ� ��ü�� �޼����� �μ��� Ŭ������ �������� �ٷ� ������ ���� �ִ�.
		//�����͸�Ŭ���� // mykeyadapter extends �ڿ� key����ͺ��� �� ������ �������� ����
		/*���� �͸�Ŭ����(Anonymous inner Class)�� ����ϴ� ����
		 * 	- .java vs �����͸�
		 *    .java�� ���������� �����ҽ����� �ۼ��ϴ� ������ �ڵ��� ���뼺�� �ִ�..������,
		 *    GUI���α׷��ֵ�� Ư�� �̺�Ʈ ���� �ڵ�� Ư�� Ŭ������ �������̱� ������ ���뼺�� ����� ��������...
		 *    �̰�� �����ڰ� .java���� ������ �μ��� ���� ��ü�� �Ѱܹ޴� ���� �ؾ��ұ�??
		 *    �ش�!) ��ȸ���ڵ�� ����!! �� ���� Ŭ������ �Ϻη� Ŭ������ ������� �������!!
		 *    ����!) bin���Ͽ� ���� useadapater$1�� ����..Ŭ���� ����. �����͸��� �����ɶ�����$1, $2, $3���� ��Ÿ����.
		 *    
		 *    
		 *    �����͸�Ŭ����������
		 *    - ���� �͸� �޼��� �ڵ� �ȿ��� �ڽ��� ������ �ܺ�Ŭ������ ��������� ����ó�� �� �� �ִ�.(��������� ������ ����!)
		 *    - �ڰ��� ���迡�� ���Դ� ����!
		 *       ���� �͸�Ŭ������ ������� ��� �̵��� ��������� ������ �� �ִٴ� ���ε�, ���� �����ڰ� ���������� �����͸�����
		 *       ����ϰ��� �Ҷ��� �� ���������� final�� ����Ǿ� �־�� �Ѵ�.. ��!) ��븸 �����ϴٴ� ��!
		 *    		
		 * 	   
		 * 	    
		 * 
		 * */
		txt.addKeyListener(new KeyAdapter(){
			//���δϱ� ... area,txt�� �ѱ��ʿ䰡����.
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					String msg = txt.getText();
					area.append(msg+"\n");
					txt.setText("");
				}
			}
			
		});
		
		final int a=9;
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("������?");
				System.out.println(a);
			}
		});
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//����� - Adapter.java���.
		//adapter= new Adapter();
		//txt.addKeyListener(adapter);
		
		//adapter.setUseAdapter(this);
		
	}
	
	public static void main(String[] args) {
		new UseAdapter();

	}

}
