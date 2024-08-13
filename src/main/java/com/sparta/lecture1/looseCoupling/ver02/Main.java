package com.sparta.lecture1.looseCoupling.ver02;

public class Main {

    public static void main(String[] args) {
        // 프로그램 시작점

        // 의존성 주입(DI : Dependency Injection)
        // 객체가 필요한 종속성ㅇ르 외부에서 주입해 주는 것
        // IoC를 구현하기 위한 방법 중 하나

        // 객체의 생성을 외부로 위임
        // 가스 차량
        GasEngine gasEngine = new GasEngine();
        Car gasCar = new Car(gasEngine);
        gasCar.drive();

        // 전기 차량
        ElectricEngine electricEngine = new ElectricEngine();
        Car electicCar = new Car(electricEngine);
        electicCar.drive();
    }
}
