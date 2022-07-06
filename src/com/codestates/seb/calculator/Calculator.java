package com.codestates.seb.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        String kit;
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        num1 = input.nextDouble();
        System.out.print("연산자를 입력해주세요: ");
        kit = input.next();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        num2 = input.nextDouble();
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        System.out.println("결과는 다음과 같습니다 =>");
        switch (kit) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1 / num2);
            default -> System.out.println("정확한 사칙연산을 입력해주세요");
        }


    }
}
