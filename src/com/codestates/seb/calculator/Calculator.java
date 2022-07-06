package com.codestates.seb.calculator;

import java.util.Locale;
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
        /*Advanced Challenge (심화 기능 구현)
         *Advanced Challenges는 여러분이 필수적으로 해야 하는 과제는 아닙니다.
         *앞서 Bare Minimum Requirements를 달성하고, 시간이 남거나 더 깊은 공부가 필요할 때 도전할 수 있는 과제입니다.
         *여러 번의 입력을 받고, 입력받은 만큼 계산을 할 수 있어야 합니다.
         *반복문을 통해 여러 번의 입력을 받을 수 있습니다.
         *사용자가 잘못된 값을 입력한 경우, 사용자에게 피드백을 줄 수 있습니다.
         *예를 들어 사칙연산 연산자(+, -, *, /)가 아닌 다른 기호가 들어온 경우, 잘못된 입력이라는 피드백을 줄 수 있어야 합니다.
         * (문구는 동일하지 않아도 괜찮습니다.)*/

       do {
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

           System.out.print("결과는 다음과 같습니다 => ");
           switch (kit) {
               case "+" : System.out.println(num1 + num2);
               break;
               case "-" : System.out.println(num1 - num2);
               break;
               case "*" : System.out.println(num1 * num2);
               break;
               case "/" : System.out.println(num1 / num2);
               break;
               default : System.out.println("정확한 사칙연산을 입력해주세요!");
           }

           System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

           System.out.print("추가적인 계산이 필요하신가요?[y/n]:  ");
           input.nextLine();
           String checking;

            out: while(true){
                checking = input.nextLine();
                if (checking.equals("y")||checking.equals("n"))
                        break out;
                else{
                    System.out.println("y,n중 하나만 입력해주세요");
                }
                    }

           if (checking.toLowerCase().equals("n")) {
                break;
           }
       }
        while(true);
    }
}
