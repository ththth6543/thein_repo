package com.jun.array;

public class Ex5_array {
    public static void main(String[] args) {
        // String을 담을 배열 선언 및 공간 할당
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]); // 결과: "Volvo" - 인덱스는 항상 0부터 시작
        cars[0] = "Opel";
        System.out.println(cars[0]); // 결과: "Opel" - 배열의 값을 변경함
        System.out.println(cars.length); // 결과: 4 - cars 배열의 길이를 출력함
        // 별다른 조치를 취하지 않는한 배열의 크기는 4로 고정됨

        // cars 배열의 인덱스를 통한 접근
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // cars 배열의 멤버에 for-each를 통해서 접근
        for (String car : cars) {
            System.out.println(car);
        }

        // int를 담을 배열 선언 및 공간 할당
        int[] numbers = { 10, 20, 30, 40 };
        int sum = 0;

        // numbers 배열의 인덱스를 통한 접근
        // sum에 numbers 배열의 값을 더함
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum); // 결과: 100

        // double을 담을 배열 선언 및 공간 할당
        double[] decimals = { 10.0, 20.0, 30.0, 40.0 };
        // boolean을 담을 배열 선언 및 공간 할당
        boolean[] booleans = { true, false, true, false };

        // 다차원 배열
        int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8 } }; // 2차원 배열
        System.out.println(myNumbers[1][2]); // 결과: 8 -> 인덱스 [1]의 세번째 원소

        // 다차원 배열 인덱스를 통한 접근
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
