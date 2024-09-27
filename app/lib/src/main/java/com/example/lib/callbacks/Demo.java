package com.example.lib.callbacks;

public class Demo {

    public static void main(String[] args) {
        TwoStudents twoStudents = new TwoStudents();
        MobilePhone mobilePhone = new Myself();
        System.out.println("barani-"+twoStudents.baraniAdd(10,20));
        System.out.println("abdul-"+twoStudents.abdulAdd(30,40));

    }
}
