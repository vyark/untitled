package com.company;

public class Main extends A{

    public static void main(String[] args) {
        new Main().print();
	    System.out.println("Hello, world!");
    }

    @Override
    public void print(){
        System.out.println("Hello, Main!");
    }
}
