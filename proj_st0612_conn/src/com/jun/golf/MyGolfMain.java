package com.jun.golf;

import com.jun.golf.print.PrintGolfMember;
import com.jun.golf.print.PrintGolfProfit;
import com.jun.golf.print.PrintGolfTeacher;

public class MyGolfMain {

	public static void main(String[] args) {
		
		System.out.println("--- 골프 관리 프로그램 가동 ---");

        // printmember 클래스의 인스턴스(객체) 생성
        PrintGolfMember memberPrinter = new PrintGolfMember();
        PrintGolfTeacher teacherPrinter = new PrintGolfTeacher();
        PrintGolfProfit profitPrinter = new PrintGolfProfit();
        // 조회를 담당하는 메서드 호출!
        memberPrinter.displayAllMembers();
        teacherPrinter.displayAllTeachers();
        profitPrinter.displayAllClasses();

        System.out.println("--- 프로그램 종료 ---");
	}

}
