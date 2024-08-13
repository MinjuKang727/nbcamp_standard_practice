package com.sparta.lecture1.directBinding.ver02;

import com.sparta.lecture1.directBinding.ver01.GasEngine;

public class Car {
    private String model;
    private com.sparta.lecture1.directBinding.ver01.GasEngine gasEngine;
    private ElectricEngine electricEngine;

    // 생성자 == 클래스 조립 설명서
    public Car(String model) {
        this.model = model;

        if (model.equals("gas")) {
            gasEngine = new GasEngine();
        } else if (model.equals("electric")) {
            electricEngine = new ElectricEngine();
        }
    }

    // 자동차 부품
    public void drive() {
//        this.engine.run();
        if (model.equals("gas")) {
            this.gasEngine.run();
        } else if (model.equals("electric")) {
            electricEngine.run();
        }
    }
}
