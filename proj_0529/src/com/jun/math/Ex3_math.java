package com.jun.math;

public class Ex3_math {

    public static void main(String[] args) {
        int result = Math.max(5, 10);
        // 최댓값
        System.out.println("Math.max(5, 10) :" + result);
        // 최솟값
        System.out.println("Math.min(5, 10) :" + Math.min(5, 10));
        // 제곱근
        System.out.println("Math.sqrt(25) :" + Math.sqrt(25));
        // 거듭제곱
        System.out.println("Math.pow(2, 3) :" + Math.pow(2, 3));
        // 절대값
        System.out.println("Math.abs(-10.9) :" + Math.abs(-10.9));
        // 난수 (0 ~ 1 사이)
        System.out.println("Math.random() :" + Math.random());
        // 반올림
        System.out.println("Math.round(5.5) :" + Math.round(5.5));
        // 올림
        System.out.println("Math.ceil(5.5) :" + Math.ceil(5.5));
        // 내림
        System.out.println("Math.floor(5.5) :" + Math.floor(5.5));
        // 0 ~ 100 사이 정수 난수
        int randomNum = (int) Math.round(Math.random() * 100);
        System.out.println("Math.round(Math.random() * 100) :" + randomNum);
    }
}