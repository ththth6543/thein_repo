package com.jun.operators;

public class Ex2_oper4 {
    public static void main(String[] args) {
        // 연산자
        System.out.println("논리연산자 \n ----------");

        int age = 25;
        boolean hasLicense = true;

        // 1. AND (&&) 연산자 : 나이가 20세 이상 '이면서' 면허가 있어야 함
        if (age >= 20 && hasLicense) {
            System.out.println("렌터카를 대여할 수 있습니다."); // 실행됨
        }

        // 2. OR (||) 연산자 : 나이가 65세 이상 '이거나' 면허가 없으면 운전 불가
        if (age >= 65 || !hasLicense) {
            System.out.println("운전 제한 대상자입니다.");
        } else {
            System.out.println("운전이 가능한 상태입니다."); // 실행됨
        }

        // 3. NOT (!) 연산자 : 값을 반대로 뒤집음
        boolean isWeekend = false;
        System.out.println("평일인가요? " + !isWeekend); // true 출력

        // 단락 평가 -> 앞에 조건만 보고 결과를 알면 뒤를 평가하지 않음

        int num = 10;
        int count = 0;

        // 앞의 조건 (num < 5)은 거짓
        // 따라서 자바는 뒤의 조건 (++count > 0)을 아예 실행하지 않음
        if (num < 5 && ++count > 0) {
            System.out.println("이 조건문 안쪽은 실행되지 않습니다.");
        }

        System.out.println("결과 num : " + num); // 10
        System.out.println("결과 count : " + count); // 0 (뒤쪽 ++count가 실행 안 됨!)
    }

}
