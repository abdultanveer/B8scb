package com.example.lib;

public class GEAppliances implements ISwtichBoardListener{

    @Override
    public void switchOne() {
        System.out.println("GE ac is on");
    }

    @Override
    public void switchTwo() {
        System.out.println("GE bulb is on");

    }

    @Override
    public void switchThree() {
        System.out.println("GE tubeligh is on");

    }

    @Override
    public void switchFour() {
        System.out.println("GE buzzer is on");

    }

    @Override
    public void switchFive() {
        System.out.println("GE fan is on");

    }
}
