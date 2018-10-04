package org.sujoy.gradle.hello;


public class Hello {

    public static void main(String args[]){
        Greeting greeter = new Greeting();
        System.out.println(greeter.sayHello());
    }
}