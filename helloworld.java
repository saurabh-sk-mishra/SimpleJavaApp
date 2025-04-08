package com.example;

public class HelloWorld {
    public String greet() {
        return "Hello from Java on Kubernetes!";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().greet());
    }
}
