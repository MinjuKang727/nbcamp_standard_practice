package com.sparta.lecture1.directBinding.ver02;

public class Main {

    public static void main(String[] args) {
        // 프로그램 시작점

        // 가솔린 차량
        Car gasCar = new Car("gas");
        gasCar.drive();

        // 전기 차량
        Car electricCar = new Car("electric");
        electricCar.drive();
    }
}
