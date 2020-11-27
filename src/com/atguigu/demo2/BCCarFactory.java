package com.atguigu.demo2;

public class BCCarFactory implements BCCarCustomFactory{
    @Override
    public Engine createEngine() {
        return EngineFactory.createEngine();
    }

    @Override
    public Seat createSeat() {
        return SeatFactory.createSeat();
    }

    @Override
    public Car create() {
        Car car = new BC();
        car.setEngine(createEngine());
        car.setSeat(createSeat());
        return car;
    }
}
