package com.sparta.lecture1.looseCoupling.ver01;

public class Main {

    public static void main(String[] args) {
        // 코드 시작점

        // 의존성 주입(DI : Dependency Injection)
        // 객체가 필요한 종속성을 외부에서 주입해 주는 것
        // IoC를 구현하기 위한 방법 중 하나

        // 객체의 생성을 외부로 위임
        GasEngine gasEngine = new GasEngine();

        // 프로그램 시작점
        Car car = new Car(gasEngine);

        // 자동차 주행
        car.drive();
    }
}
