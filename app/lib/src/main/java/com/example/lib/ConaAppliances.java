package com.example.lib;

//wire enndings 2b connected to the socket

public class ConaAppliances implements ISwtichBoardListener{

    @Override
    public void switchOne() {
        System.out.println("cona ac is on");
    }

    @Override
    public void switchTwo() {
        System.out.println("cona bulb is on");

    }

    @Override
    public void switchThree() {
        System.out.println("cona tubeligh is on");

    }

    @Override
    public void switchFour() {
        System.out.println("cona buzzer is on");

    }

    @Override
    public void switchFive() {
        System.out.println("cona fan is on");

    }
}
