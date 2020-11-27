package com.atguigu.demo;

public class SystemManager {


    public String load(ConfigLoader configLoader){
        return configLoader.load();
    }

    public static void main(String[] args) {
        SystemManager systemManager = new SystemManager();
        systemManager.load(new DiskFile());
    }

    interface ConfigLoader{
             String load();
    }

    static class NetWorkFile implements ConfigLoader{
        @Override
        public String load() {
            System.out.println("NetWorkFile");
            return null;
        }
    }

    static class DiskFile implements ConfigLoader{
        @Override
        public String load() {
            System.out.println("DiskFile");
            return null;
        }
    }

    }



