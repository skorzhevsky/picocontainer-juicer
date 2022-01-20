package com.picocontainer.examples.juicer;

public class Juicer {
    private final Peelable peelable;
    private final Peeler peeler;
    public Juicer(Peelable peelable, Peeler peeler) {
        this.peelable = peelable;
        this.peeler = peeler;
        System.out.print("Juicer ");
        System.out.println(peelable);
    }
}