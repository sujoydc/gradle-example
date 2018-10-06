package org.sujoy.gradle.hello;


import org.joda.time.LocalTime;

public class Hello {

    public static void main(String args[]){

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeting greeter = new Greeting();
        System.out.println(greeter.sayHello());
    }
}