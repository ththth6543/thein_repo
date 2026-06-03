package com.jun;

public class Ex1_String {
    public static void main(String[] args) {
        String str = "asdfjkADSFDSFvjskADSFSDFnjasasdADSFDsasdv";

        // str의 길이 출력
        System.out.println("str.length() :" + str.length());
        // 전부 대문자로 변경
        System.out.println("str.toUpperCase() :" + str.toUpperCase());
        // 전부 소문자로 변경
        System.out.println("str.toLowerCase() :" + str.toLowerCase());

        String txt = "Please locate where 'locate' occurs!";
        // 처음 locate가 시작하는 곳이 7번째 지점임
        System.out.println(txt.indexOf("locate"));

        String txt2 = "Hello";
        // n번째 char를 출력
        System.out.println(txt.charAt(0)); // H
        System.out.println(txt.charAt(4)); // o

        String txt3 = "Hello";
        String txt4 = "Hello";

        String txt5 = "Greetings";
        String txt6 = "Great things";

        // 두 문자열이 같은지 비교
        System.out.println(txt3.equals(txt4)); // true
        System.out.println(txt5.equals(txt6)); // false

        String txt7 = "   Hello World   ";
        System.out.println("Before: [" + txt7 + "]");
        // trim은 공백 제거
        System.out.println("After:  [" + txt7.trim() + "]");

        String a = "Java ";
        String b = "is ";
        String c = "fun!";

        // concat 문자열 연결
        String result = a.concat(b).concat(c);
        System.out.println(result);

        // " 문자열 안에 " 넣기
        String txt8 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt8);
        // ' 문자열 안에 ' 넣기
        System.out.println("It\'s alright.");
        // \ 넣기
        System.out.println("The character \\ is called backslash.");
    }
}
