package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.VO.GradeVO;

public class GradeExec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List <GradeVO> gradeList = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++) {
			GradeVO vo = new GradeVO();
			
			System.out.print("학번");
			String strNum = scanner.nextLine();
			
			System.out.print("국어점수");
			String strKor = scanner.nextLine();
			
			System.out.print("영어점수");
			String strEng = scanner.nextLine();
			
			System.out.print("수학점수");
			String strMath = scanner.nextLine();
			
			vo.setStrNum(strNum);
			vo.setIntKor(Integer.valueOf(strKor));
			vo.setIntEng(Integer.valueOf(strEng));
			vo.setIntMath(Integer.valueOf(strMath));
		    int intSum = vo.getIntKor();
			intSum += vo.getIntEng();
			intSum += vo.getIntMath();
			vo.setIntSum(intSum);
			
			float floatAvg = intSum / 3.0f;
			vo.setFloatAvg(floatAvg);
			gradeList.add(vo);
		}
		System.out.println("==========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------");
		for(int i = 0 ; i < gradeList.size(); i ++) {
			System.out.print(gradeList.get(i).getStrNum() + "\t");
			System.out.print(gradeList.get(i).getIntKor() + "\t");
			System.out.print(gradeList.get(i).getIntEng() + "\t");
			System.out.print(gradeList.get(i).getIntMath() + "\t");
			System.out.print(gradeList.get(i).getIntSum() + "\t");
			System.out.print(gradeList.get(i).getFloatAvg() + "\n");
			

	}
	}

}
