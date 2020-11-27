package com.atguigu.demo2;

public interface BCCarCustomFactory {
    Engine createEngine();

    Seat createSeat();

    default Car create(){
        Car car = new BC();
        car.setSeat(createSeat());
        car.setEngine(createEngine());
        return car;
    }

}
