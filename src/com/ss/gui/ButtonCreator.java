package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCreator extends JFrame {
	
	JButton bt_create,bt_color;
	JPanel p_north,p_center;
	ArrayList list=new ArrayList(); //�� ���� �迭!
	//ũ�⸦ ������� �ʾƵ� �ǰ� , ��ü���� �ٷ�.
	
	/*���� ���� ����ؿԴ� �迭�� �뷮�� �����͸� �����ְ� ó���Կ� �־ ��û�� �̵��� ���.
	 * ������, C,C#,�ڹٿ� ���� �������α׷�������  �迭�� �� ũ�⸦ �ݵ�� ����ؾ��Ѵٴ� Ư¡ (+) �迭�� ����� �ڷ����� �����Ǿ�� �Ѵ�. ������ �������� ��������..
	 * 
	 * �ڹٿ�����  �뷮�� ��ü�� (�ڡڡڡ�)�� ó���ϴµ� ������ ���̺귯���� �����ϴµ� �̷��� ���̺귯���� ������
	 * �÷��� �����ӿ��̶� �ϰ�, java.util ��Ű���� ���ִ�.
	 * 
	 * �ڹ��� Collection framework���� �����ϴ� ��ü�� ����ϴ�....
	 * ��� ����Ѵٴ� ���� ��û�� ���̴�....
	 * ������ ���� �׋����� ������ ���� �����ϸ� �ȴ�..
	 * 
	 * ����!!!!!!!!!!!!!!!!!!!! �迭���� �޸� �÷��� �����ӿ��� ����� �Ǵ� ���� ���� �繰�� ��ü�� �����ȴ�!!!
	 * �迭�� �������� = ��Ƽ� ó���ϴµ� �ſ� ������...
	 * 1. set���� (�������� �� ��)
	 * 2. list����(�����ִ� ����)
	 * 3. Ű���� ������ value�� ������ ����..����...
	 * */
	
	
	int count=0;
	
	public ButtonCreator() {
		bt_create = new JButton("��ư ����");
		bt_color = new JButton("����");
		p_north = new JPanel();
		p_center = new JPanel();
		
		p_north.add(bt_create);
		p_north.add(bt_color);
		
		add(p_north,BorderLayout.NORTH);
		add(p_center,BorderLayout.CENTER);
		
		//�̺�Ʈ ����
		bt_create.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//��ư �����ϱ�
				//�̺�Ʈ �����;ȿ�...������ �����ϸ� ���� ����
				createButton();
				
			}
		});
		
		bt_color.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//��� ��ư�� ������� ���� ����..
				
				setColor();			
			}
		});
		
		
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//��ư �����޼���
	//�ǰ��Կ��� ������ �� ������??
	//�̺�Ʈ�� �����Ͽ� ������ �ۼ��ϸ� �̺�Ʈ ����� ���濡 ���� ������ �ջ� �����ϱ�...
	public void createButton(){
		count++;
		JButton bt = new JButton(Integer.toString(count));
		
		//javascript�� push()�� ���� ����� �޼��� ȣ������!!
		list.add(bt); //1�� �߰�!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("������� ��������  = "+list.size());
		
		p_center.add(bt);
		p_center.updateUI(); //ȭ�� refresh�ϱ�... ȭ���� ��� ���m�ٰ� �ٽ� �����°�...
	}
	
	public void setColor(){
		for(int i=0;i<list.size();i++){
			//i��° ��ư�� .setBackground();
			JButton bt= (JButton)list.get(i);
			bt.setBackground(Color.YELLOW);
			
		}
	}
	
	public static void main(String[] args) {
		new ButtonCreator();

	}

}
