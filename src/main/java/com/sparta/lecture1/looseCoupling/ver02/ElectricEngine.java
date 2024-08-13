package com.sparta.lecture1.looseCoupling.ver02;

public class ElectricEngine implements Engine {

    @Override
    public void run() {
        System.out.println("::: looseCoupling ver02 - 전기 엔진이 동작합니다.");
    }
}
