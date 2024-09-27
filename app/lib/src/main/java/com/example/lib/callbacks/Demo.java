package com.example.lib.callbacks;

public class Demo {

    public static void main(String[] args) {
        TwoStudents twoStudents = new TwoStudents();
        MobilePhone mobilePhone = new Myself();
        System.out.println("barani-"+twoStudents.baraniAdd(10,20));
        new Thread(){
            @Override
            public void run() {
                super.run();
                twoStudents.abdulAdd(30,40,mobilePhone);

            }
        }.start();
        System.out.println("manager is going to the airport");

    }
}
