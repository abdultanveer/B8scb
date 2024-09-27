package com.example.lib.callbacks;



public class TwoStudents {

    int baraniAdd(int a, int b){
        return a + b;
    }

    int abdulAdd(int a, int b){
        try {
            Thread.sleep(10000);
            return  a+b;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
