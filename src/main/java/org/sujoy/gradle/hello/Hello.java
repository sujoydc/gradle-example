package org.sujoy.gradle.hello;


public class Hello {

    public static void main(String args[]){
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}