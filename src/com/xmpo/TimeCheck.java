package com.xmpo;

import java.util.ArrayList;
import java.util.Random;

public class TimeCheck {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ArrayList a = new ArrayList();

        for(int i=0;i<10000000;i++){
            a.add(new Random().nextInt());
        }

        long end = System.currentTimeMillis();

        System.out.println("start : " + start); //시작시간의 밀리세컨드
        System.out.println("end : " + end);  //종료시간의 밀리케선드
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //최종 실행시간

    }

}
