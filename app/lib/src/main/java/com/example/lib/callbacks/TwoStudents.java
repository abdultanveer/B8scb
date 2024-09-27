package com.example.lib.callbacks;



public class TwoStudents {

    int baraniAdd(int a, int b){
        return a + b;
    }

    void abdulAdd(int a, int b, MobilePhone mobilePhone){
        try {
            Thread.sleep(10000);
            int result = a+b;
            mobilePhone.onSum(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
