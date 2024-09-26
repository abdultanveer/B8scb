package com.example.lib;

public class Wiring {

    public static void main(String[] args) {
        ISwtichBoardListener user = new GEAppliances();
                //new ConaAppliances();
       user.switchOne();
       user.switchTwo();
       user.switchThree();
       user.switchFour();

    }
}
