package com.codestates.seb.gugudan;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        //TODO:
        // 0. 구구단을 정의하기 전 구구단 연산을 위한 변수를 선언합니다.
        int min, max, input;
        min = 2;
        max = 9;
        int [] gugudanList = new int[9];
        //input 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
        input = sc.nextInt();
        System.out.println();
        sc.close();
        //잘못된 input값 -> 프로그램 종료
        if (min > input || input > max) {
            System.out.println(input+" 단 이 입력되었습니다.");
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
            return;
        }
        //input값 확인
        System.out.println(input+" 단 이 입력되었습니다.");
        //input 구구단 출력
        for(int i =1; i<=gugudanList.length;i++){
            System.out.println(input+" * "+ i+ " = "+ input*i);
        }
    }
}
