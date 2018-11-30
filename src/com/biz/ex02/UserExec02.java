package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.VO.UserVO;

public class UserExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserVO userVO = new UserVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번");
		String strNum = scanner.nextLine();
		userVO.setStrNum(strNum);
		
		
		System.out.print("이름");
		String strName = scanner.nextLine();
		userVO.setStrName(strName);
		
		
		System.out.print("학년");
		String strGrade = scanner.nextLine();
		userVO.setStrGrade(strGrade);
		
		System.out.print("주소");
		String strJuso = scanner.nextLine();
		userVO.setStrJuso(strJuso);
		
		System.out.print("번호");
		String strPhone = scanner.nextLine();
		userVO.setStrPhone(strPhone);
		
		System.out.println(userVO.toString());
		

	}
	
	
	}


