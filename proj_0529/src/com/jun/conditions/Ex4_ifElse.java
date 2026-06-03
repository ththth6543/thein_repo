package com.jun.conditions;

public class Ex4_ifElse {
    public static void main(String[] args) {
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("Do not bring an umbrella.");
        }

        int x = 20;
        int y = 20;
        if (x == y) {
            System.out.println("x is equal to y");
        }

        // switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                break;
        } // 결과: 목요일(day = 4)

        int i = 0;
        // 조건이 참인 동안 반복
        while (i < 5) {
            System.out.println(i);
            i++;
        } // 결과: 0~4(5번 반복)

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (i < 5);
        // 조건이 참인 동안 반복(최소 1번은 실행됨)

        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
        // 0~4(5번 반복)
        // 코드는 다르지만 다 같은 결과값을 가짐.

        // 중첩 루프
        for (i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } // 결과: Outer: 1 -> Inner: 1~3 -> Outer: 2 -> Inner: 1~3

        // 향상된 for문(for-each)
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        // cars에 있는 요소들을 처음부터 끝까지 출력
        for (String car : cars) {
            System.out.println(car);
        } // 결과: Volvo, BMW, Ford, Mazda

        // break -> 말그대로 루프를 중단 시킴
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } // 결과 0, 1, 2, 3 - i = 4일때 break를 만나 for문이 깨짐

        // continue -> 조건이 참이면 그 루프만 건너뛰고 for문이 계속됨
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        } // 결과 0, 1, 2, 3, 5, 6, 7, 8, 9 - i = 4일때 continue를 만나 건너뛰어지고 for문이 계속됨

        // break - continue 같이 사용
        for (i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } // 결과 0, 1, 3 - i = 2일때 continue를 만나 건너뛰어지고 for문이 계속됨,
          // i = 4일때 break를 만나 for문이 깨짐

        // 이중 루프 + break
        for (i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // 1, 2 출력

            for (j = 1; j <= 4; j++) {
                if (j == 3) {
                    break; // 이 순간 내부 루프만 멈춤
                }
                System.out.println(" Inner: " + j); // 1, 2 출력 (j=3일때 break)
            }
        } // 결과: Outer: 1 -> Inner: 1, 2 -> Outer: 2 -> Inner: 1, 2
    }
}
