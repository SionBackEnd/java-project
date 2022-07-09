package com.codestates.seb.mystorage;

import java.util.Arrays;
import java.util.Scanner;

public class MyStorage {

    public static void main(String[] args) {
        //변수 생성
        String[] num1Arr = new String[]{"등록가능", "등록가능", "등록가능", "등록가능"};


        Scanner s = new Scanner(System.in);
        // 해당 프로그램의 버전, 점장님의 이름, 프로그램의 기능을 출력합니다.
        //TODO:
        System.out.println("[Item_Storage_V3]");
        System.out.println("-".repeat(24));
        System.out.println("[System] " + "백시온" + " 점장님 어서오세요.");
        System.out.println("[System] 해당 프로그램의 기능입니다.");

        while (true) {
            showMenu();
            if(selectSwitch(selectMenu(s)) == 6)
                break;
        }
    }

    //함수 목록!ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    static void showMenu() {
        // 사용자를 위해 해당 기능들 앞에 번호를 넣어 알아보기 쉽도록 합니다.
        //TODO:
        System.out.println("1. 물건 정보(제품명) 등록하기");
        System.out.println("2. 물건 정보(제품명) 등록 취소하기");
        System.out.println("3. 물건 넣기 (제품 입고)");
        System.out.println("4. 물건 빼기 (제품 출고)");
        System.out.println("5. 재고 조회");
        System.out.println("6. 프로그램 종료");
    }

    static int selectMenu(Scanner s) {
        // 해당 메서드가 호출되면 프로그램의 기능을 호출할 수 있도록 안내 메시지를 출력합니다.
        //TODO:
        // 프로그램의 기능은 번호(정수)로 전달받습니다.
        // 해당 프로그램은 사용자가 선택한 번호(select)를 반환하도록 합니다.
        int userNum;
        System.out.println("-".repeat(24));
        System.out.print("[System] 원하는 기능의 번호를 입력하세요 : ");
        userNum = s.nextInt();
        return userNum;
    }

    static void num1(String[] objects, Scanner s) {

        System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
        String ob = s.next();
        System.out.println("[System]등록이 완료됬습니다.");
        System.out.println("[System] 현재 등록된 제품 목록 ▼");
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals("등록가능")) {
                objects[i] = ob;
                break;
            }
        }
        for (String e : objects) {
            System.out.println("> " + e);
        }
        System.out.println("-".repeat(24));
    }

    static int selectSwitch(int i) {
        switch (i) {
            case 1: {
                System.out.println(1);
                return 1;
            }
            case 2: {
                System.out.println(2);
                return 2;
            }
            case 3: {
                System.out.println(3);
                return 3;
            }
            case 4: {
                System.out.println(4);
                return 4;
            }
            case 5: {
                System.out.println(5);
                return 5;
            }
            case 6: {
                System.out.println("[System] 프로그램을 종료합니다.");
                System.out.println("[System] 감사합니다.");
                return 6;
            }
            default:
                System.out.println("정확한 번호를 입력해주세요");
        }
        return 0;
    }
}
