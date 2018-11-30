package com.biz.ex02;

import com.biz.ex02.VO.TestVO;

public class Exec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestVO  testVO = new TestVO();
		int intNum = 100;
		numRet(intNum);
		System.out.println(intNum);
		intNum = numRet (intNum);
		System.out.println(intNum);
		System.out.println("stTest1:" + testVO.strTest1);
		testRet(testVO);
		System.out.println("stTest1:" + testVO.strTest2);
		testVO = tRet(testVO);

	}
	public static TestVO tRet(TestVO testVO) {
		testVO.strTest1 = "Republic of Korea";
		testVO.strTest2 = "우리나라 만세";
		return testVO;
	}
	public static void testRet(TestVO testVO) {
		testVO.strTest1 = "KOREA";
		testVO.strTest2 = "대한민국";
	}
	public static int numRet(int intNum) {
		intNum = 200;
		return intNum;
	}

}
