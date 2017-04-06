/*
 * 이벤트 프로그래밍시 리스너가 인터페이스이기 때문에
 * 단 하나라도 메서드를 오버라이드 하지 않으면 구현강제의 약속을 어기게 되어 컴파일 오류가 나게된다.
 * 이 원칙은 특히나 추상메서드를 많이 보유한 인터페이스일 경우 너무 비효율적이고 피곤하다...
 * 
 * 해결책) 개발자를 대신하여 이미 리스너의 매서드들을 재정의 해놓은 객체들을 가리켜 어댑터라 한다!!
 * But!!! 어댑터는 무조건 지원되는게 아니라 , 강사님 경험상 보통 3개이상의 추상메서드를 보유한 리스너라면
 * 			어댑터 지원을 일단 의심해봐야 한다.
 * */
package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*윈도우 이벤트를 구현해보자!*/
public class WindowTest extends JFrame{
	
	JButton bt;
	
	public WindowTest() {
		bt=new JButton("나버튼");
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
