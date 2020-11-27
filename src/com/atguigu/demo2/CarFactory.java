package com.atguigu.demo2;

public class CarFactory {
    public static Car createCar(String level){
        switch (level){
//            case "总裁":
//                return new BWMCarFactory().create();
//            case "秘书":
//                return QQCarFactory.QQCar();
            case "打工人":
                return new BCCarFactory().create();
            default:
                return null;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car car = CarFactory.createCar("打工人");
    }
}
