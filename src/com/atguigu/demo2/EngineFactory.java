package com.atguigu.demo2;

public class EngineFactory {

    public static Engine createEngine(){
        return new EngineV8();
    }
}
