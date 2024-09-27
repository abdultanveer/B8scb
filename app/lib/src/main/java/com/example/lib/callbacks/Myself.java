package com.example.lib.callbacks;


public class Myself implements MobilePhone{

    @Override
    public void onSum(int result) {
        System.out.println("abduls sum is --"+result);
    }
}
