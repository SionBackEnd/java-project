package com.codestates.seb.mystorage;

import java.util.Scanner;

public class MyStorage {
    //변수생성
    static String ABLE = "등록 가능";
    static int ZERO = 0;
    //제품목록 배열
    static String[] product = new String[]{ABLE, ABLE, ABLE, ABLE};
    //제품 갯수 배열
    static int[] count = new int[]{ZERO, ZERO, ZERO, ZERO};

    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner s = new Scanner(System.in);

        // 해당 프로그램의 버전, 점장님의 이름, 프로그램의 기능을 출력합니다.
        //TODO:
        System.out.println("[Item_Storage_V3]");
        System.out.println("-".repeat(24));
        System.out.println("[System] " + "백시온" + " 점장님 어서오세요.");
        System.out.println("[System] 해당 프로그램의 기능입니다.");

        //프로그램 기능 반복문
        while (true) {
            showMenu();
            //selectMenu 메소드가 먼저 실행되고 그 리턴값으로 selectSwitch메소드가 실행되고 만약 그 리턴값이 6이면 반복문 종료
            if (selectSwitch(selectMenu(s)) == 6) break;
        }
    }

    //▼함수 목록▼ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ▼

    //메뉴를 보여주는 메소드
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

    //제품 조회 메소드
    static void showProduct(String[] product, int[] count) {
        System.out.println("[System] 현재 등록된 제품 및 수량 ▼");
        for (int i = 0; i < count.length; i++) {
            System.out.println("> " + product[i] + " : " + count[i] + "개");
        }
    }

    //메뉴를 선택해서 선택한값을 리턴해주는 메소드
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

    //제품 등록 메소드
    static void prod_input(String[] product, Scanner s) {

        System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
        String ob = s.next();
        System.out.println("[System]등록이 완료됬습니다.");
        System.out.println("[System] 현재 등록된 제품 목록 ▼");
        for (int i = 0; i < product.length; i++) {
            if (product[i].equals(ABLE)) {
                product[i] = ob;
                break;
            }
        }
        for (String e : product) {
            System.out.println("> " + e);
        }
        System.out.println("-".repeat(24));
    }

    //제품 삭제 메소드
    static void prod_remove(String[] product, int[] count, Scanner s) {
        System.out.print("[System] 제품 등록 취소를 원하는 제품명을 입력하세요 : ");
        String cheakProd = s.next();
        for (int i = 0; i < product.length; i++) {
            if (cheakProd.equals(product[i])) {
                product[i] = ABLE;
                count[i] = ZERO;
                System.out.println("[System] 제품 취소가 완료됬습니다.");
                return;
            }
        }
        System.out.println("[Error] 해당 제품명이 존재하지 않습니다. 다시 확인해주세요.");

    }

    //제품 갯수 추가 메소드
    static void prod_amount_add(String[] product, int[] count, Scanner s) {
        System.out.println("[System] 물건의 수량을 추가합니다.(입고)");
        showProduct(product, count);
        System.out.print("[System] 수량을 추가할 제품명을 입력하세요 : ");
        String addProduct = s.next();
        System.out.print("[System] 추가할 수량을 입력해주세요 : ");
        int addCount = s.nextInt();
        for (int i = 0; i < count.length; i++) {
            if (addProduct.equals(product[i])) {
                count[i] = addCount;
                System.out.println("[Clear] 정상적으로 제품의 수량 추가가 완료되었습니다.");
                showProduct(product, count);
                break;
            }
        }
        System.out.println("[Error] 동일한 제품 명이 없습니다. 다시 확인해주세요!");
    }

    //제품 갯수 제거 메소드
    static void prod_amount_decrease(String[] product, int[] count, Scanner s) {
        System.out.println("[System] 제품의 출고를 진행합니다.");
        showProduct(product, count);
        System.out.print("[System] 출고를 진행할 제품명을 입력하세요 : ");
        String cheakProd = s.next();
        System.out.print("[System] 원하는 출고량을 입력하세요 : ");
        int checkCount = s.nextInt();
        for (int i = 0; i < product.length; i++) {
            if (cheakProd.equals(product[i])) {
                if (count[i] < checkCount) {
                    System.out.println("[Error] 희망 출고 갯수가 원래 있는 갯수보다 더 많습니다. 다시 확인해주세요.");
                    return;
                }
                count[i] -= checkCount;
                System.out.println("[Clear] 출고가 완료되었습니다.");
                showProduct(product, count);
            }
        }
        System.out.println("[Error] 해당 제품명과 동일한 제품이 없습니다. 다시 확인해주세요.");
    }

    //메뉴선택 스위치문
    static int selectSwitch(int i) {
        switch (i) {
            case 1: {
                prod_input(product, new Scanner(System.in));
                return 1;
            }
            case 2: {
                prod_remove(product, count, new Scanner(System.in));
                return 2;
            }
            case 3: {
                prod_amount_add(product, count, new Scanner(System.in));
                return 3;
            }
            case 4: {
                prod_amount_decrease(product, count, new Scanner(System.in));
                return 4;
            }
            case 5: {
                showProduct(product, count);
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
