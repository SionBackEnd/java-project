package com.codestates.seb.Ai_V3;

import java.util.Arrays;

public class Ai_V3 {
    public static void main(String[] args) {

        //TODO:
        /*
         * 프로그램에 필요한 변수 선언
         * xy_lists       : 데이터를 담을 2차원 배열
         * diff           : 편차
         * diff_pow       : 편차의 제곱(double)
         * sum_diff_pow   : 편차 제곱의 합
         * */
        double[][] xy_lists = new double[4][];
        double sum_diff_pow = 0;

        // 프로그램 안내 문구 출력
        System.out.println("[인공지능 프로그램 V3]");

        // 1단계 2차원 배열 데이터 생성
        xy_lists[0] = new double[]{374.0, 1161.0};
        xy_lists[1] = new double[]{385.0, 1401.0};
        xy_lists[2] = new double[]{375.0, 1621.0};
        xy_lists[3] = new double[]{401.0, 1681.0};

        // 데이터 출력 안내 문구 생성
        System.out.println("==============================");
        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
        for (int i = 0; i < xy_lists.length; i++) {
            int j = 0;
            System.out.println(i + 1 + "번 째 데이터) [실제값] 웹 페이지 방문자 수 : " + xy_lists[i][j++] + "\t[인공지능 예측값] 웹 페이지 방문자 수 : " + xy_lists[i][j]);
            j = 0;
        }
        System.out.println();

        // 배열 속 값을 호출하며 편차 -> 제곱 -> 합산 과정을 수행합니다.
        for (int i = 0; i < xy_lists.length; i++) {
            int j = 0;
            pow(xy_lists[i][j++], xy_lists[i][j], i + 1);
            sum_diff_pow += Math.pow(xy_lists[i][0] - xy_lists[i][1], 2);
            j = 0;
        }
        System.out.println("==============================");

        System.out.println("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : " + sum_diff_pow);
    }

    //편차 구하기, 편차 제곱 구해기 메소드
    static void pow(double real, double ai, int i) {
        double diff = (real - ai);
        double diff_pow = Math.pow(real - ai, 2);
        System.out.println("[" + i + "번째 데이터] 실제 값과 예측값의 오차 : " + diff);
        System.out.println("[안내] 오차의 제곱 : " + diff_pow + "\n");
    }
}

