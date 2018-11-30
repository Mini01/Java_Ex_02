package com.biz.ex02;

import com.biz.ex02.VO.TestVO;

public class Exec01 {
	
    // Ctrl + F11(Run)을 해서 코드를 테스트 해보려면 현재 보고있는 클래스에서
	// main method가 있어야한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestVO testVO; // TestVO라는 클래스(바구니)를 testVO라는 객체로 선언
		testVO = new TestVO(); // 초기화  : testVO에 포함된 변수에서 값을 읽거나
		                       // 저장하기위해  실행하는 명령
		testVO.strTest1 = "Korea";
		testVO.strTest2 = "대한민국";

	}

}
