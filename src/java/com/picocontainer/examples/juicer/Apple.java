package com.picocontainer.examples.juicer;

public class Apple implements Peelable {

    public Apple() {
        System.out.println("Apple " + this);
    }

    public void peel() { }
}
