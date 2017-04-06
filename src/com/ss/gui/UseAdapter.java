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
		bt= new JButton("나버튼");
		area = new JTextArea(20,40);
		
		setLayout(new FlowLayout());
		add(txt);
		add(bt);
		add(area);
		
		//txt와 리스너와의 연결
		//txt.addKeyListener(new MyKeyAdapter(area,txt));
		
		//.java파일을 만들기 싫은경우... ,클래스 코드 자체를 메서드의 인수나 클래스의 멤버변수등에 바로 대입할 수도 있다.
		//내부익명클래스 // mykeyadapter extends 뒤에 key어댑터부터 다 복사한 개념으로 생각
		/*내부 익명클래스(Anonymous inner Class)를 사용하는 이유
		 * 	- .java vs 내부익명
		 *    .java를 물리적으로 원본소스까지 작성하는 이유는 코드의 재사용성에 있다..하지만,
		 *    GUI프로그래밍등에서 특히 이벤트 구현 코드는 특정 클래스에 종속적이기 때문에 재사용성이 상당히 떨어진다...
		 *    이경우 개발자가 .java까지 만들어가며 인수를 통해 객체를 넘겨받는 수고를 해야할까??
		 *    해답!) 일회성코드로 가자!! 즉 현재 클래스에 일부로 클래스를 존재시켜 사용하자!!
		 *    증거!) bin파일에 보면 useadapater$1이 생김..클래스 인증. 내부익명이 증가될때마다$1, $2, $3으로 나타난다.
		 *    
		 *    
		 *    내부익명클래스의장점
		 *    - 내부 익명 메서드 코드 안에서 자신을 포함한 외부클래스의 멤버변수를 내것처럼 쓸 수 있다.(멤버변수의 공유를 위함!)
		 *    - 자격증 시험에서 나왔던 문제!
		 *       내부 익명클래스의 사용으로 얻는 이득은 멤버변수를 공유할 수 있다는 것인데, 만약 개발자가 지역변수를 내부익명내에서
		 *       사용하고자 할때는 그 지역변수는 final로 선언되어 있어야 한다.. 즉!) 사용만 가능하다는 것!
		 *    		
		 * 	   
		 * 	    
		 * 
		 * */
		txt.addKeyListener(new KeyAdapter(){
			//내부니깐 ... area,txt를 넘길필요가없다.
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
				System.out.println("눌렀어?");
				System.out.println(a);
			}
		});
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//내방식 - Adapter.java사용.
		//adapter= new Adapter();
		//txt.addKeyListener(adapter);
		
		//adapter.setUseAdapter(this);
		
	}
	
	public static void main(String[] args) {
		new UseAdapter();

	}

}
