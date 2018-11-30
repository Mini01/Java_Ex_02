package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.VO.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeVO gradeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("학번");
		String strNum = scanner.nextLine();
		gradeVO.setStrNum(strNum);
		
		System.out.print("국어점수");
		String strKor = scanner.nextLine();
		gradeVO.setIntKor(Integer.valueOf(strKor));
		
		System.out.print("영어점수");
		String strEng = scanner.nextLine();
		gradeVO.setIntEng(Integer.valueOf(strEng));
		
		System.out.print("수학점수");
		String strMath = scanner.nextLine();
		gradeVO.setIntMath(Integer.valueOf(strMath));
		
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMath();
		gradeVO.setIntSum(intSum);
		
		float floatAvg = intSum / 3.0f;
		gradeVO.setFloatAvg(floatAvg);
		
		
		System.out.println(gradeVO);
		
		
			
		}
	
	
		
		
	

	

}
