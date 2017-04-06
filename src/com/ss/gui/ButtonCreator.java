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
	ArrayList list=new ArrayList(); //얘 완전 배열!
	//크기를 명시하지 않아도 되고 , 겍체만을 다룸.
	
	/*지금 까지 사용해왔던 배열은 대량의 데이터를 순서있게 처리함에 있어서 엄청난 이득을 줬따.
	 * 하지만, C,C#,자바와 같은 응용프로그램에서는  배열이 그 크기를 반드시 명시해야한다는 특징 (+) 배열은 선언시 자료형이 결정되어야 한다. 오히려 유연성이 떨어진다..
	 * 
	 * 자바에서는  대량의 객체를 (★★★★)를 처리하는데 유용한 라이브러리를 제공하는데 이러한 라이브러리를 가리켜
	 * 컬렉션 프레임웍이라 하고, java.util 패키지에 모여있다.
	 * 
	 * 자바의 Collection framework에서 제공하는 객체는 상당하다....
	 * 모두 사용한다는 것은 멍청한 짓이다....
	 * 업무에 따라 그떄마다 적절한 것을 선택하면 된다..
	 * 
	 * 주의!!!!!!!!!!!!!!!!!!!! 배열과는 달리 컬렉션 프레임웍의 대상이 되는 것은 오직 사물인 객체에 한정된다!!!
	 * 배열과 공통점은 = 모아서 처리하는데 매우 유용함...
	 * 1. set유형 (순서없는 유 형)
	 * 2. list유형(순서있는 유형)
	 * 3. 키값을 가지고 value를 가지고 오는..유형...
	 * */
	
	
	int count=0;
	
	public ButtonCreator() {
		bt_create = new JButton("버튼 생성");
		bt_color = new JButton("색상");
		p_north = new JPanel();
		p_center = new JPanel();
		
		p_north.add(bt_create);
		p_north.add(bt_color);
		
		add(p_north,BorderLayout.NORTH);
		add(p_center,BorderLayout.CENTER);
		
		//이벤트 구현
		bt_create.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//버튼 생성하기
				//이벤트 리스터안에...로직을 웬만하면 빼서 하자
				createButton();
				
			}
		});
		
		bt_color.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//모든 버튼을 대상으로 배경색 변경..
				
				setColor();			
			}
		});
		
		
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//버튼 생성메서드
	//피곤함에도 별도로 뺀 이유는??
	//이벤트에 의존하여 로직을 작성하면 이벤트 방식의 변경에 의해 로직도 손상 받으니깐...
	public void createButton(){
		count++;
		JButton bt = new JButton(Integer.toString(count));
		
		//javascript의 push()와 완전 비슷한 메서드 호출하자!!
		list.add(bt); //1건 추가!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("현재까지 누적수는  = "+list.size());
		
		p_center.add(bt);
		p_center.updateUI(); //화면 refresh하기... 화면은 모두 지웟다가 다시 나오는거...
	}
	
	public void setColor(){
		for(int i=0;i<list.size();i++){
			//i번째 버튼의 .setBackground();
			JButton bt= (JButton)list.get(i);
			bt.setBackground(Color.YELLOW);
			
		}
	}
	
	public static void main(String[] args) {
		new ButtonCreator();

	}

}
