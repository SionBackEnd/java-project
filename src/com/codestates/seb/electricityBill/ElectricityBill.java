package com.codestates.seb.electricityBill;

import java.util.Scanner;

public class ElectricityBill {
    public static double Calculator(int kwh, double won) {
        double A, B, C, D, E;
        A = 100 * 60.7;
        B = 100 * 125.9 + A;
        C = 100 * 187.9 + B;
        D = 100 * 280.6 + C;
        E = 100 * 417.7 + D;

        if (kwh <= 100) {
            won = kwh * 60.7;
        } else if (kwh <= 200) {
            won = A + (kwh - 100) * 125.9;
        } else if (kwh <= 300) {
            won = B + ((kwh - 200) * 187.9);
        } else if (kwh <= 400) {
            won = C + ((kwh - 300) * 280.6);
        } else if (kwh <= 500) {
            won = D + ((kwh - 400) * 417.7);
        } else {
            won = E + (kwh - 500) * 670.6;
        }
        return won;
    }


    public static void main(String[] args) {
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));

        //TODO:
        // 저압의 경우 100kWh 이하는 kWh당 60.7원, 100kWh 초과는 125.9원, 200kWh 초과는 187.9원,
        // 300kWh 초과는 280.6원, 400kWh 초과는 417.7원, 500kWh초과는 670.6원의 전력량 요금을 내야한다.

        Scanner sc = new Scanner(System.in);
        System.out.print("전기 사용량을 적어주세요: ");
        int kwh = sc.nextInt();
        sc.close();
        double won = 0;
        double result = Calculator(kwh, won);
        System.out.println(kwh + "kWh의 전기 요금은 " + result + "원 입니다.");
    }
}
