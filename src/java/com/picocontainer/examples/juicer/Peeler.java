package com.picocontainer.examples.juicer;

import org.picocontainer.Startable;

public class Peeler implements Startable {
    private final Peelable peelable;
    public Peeler(Peelable peelable) {
        this.peelable = peelable;
        System.out.print("Peeler ");
        System.out.println(this.peelable);
    }
    public void start() {
        peelable.peel();
    }
    public void stop() { }
}