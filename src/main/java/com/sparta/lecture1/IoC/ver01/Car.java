package com.sparta.lecture1.IoC.ver01;

public class Car {

    private GasEngine engine;

    // 생성자 == 클래스 조립 설명서
    public Car(GasEngine engine) {
        this.engine = engine;
    }

    // 자동차 부품
    public void drive() {
        this.engine.run();
    }
}
