package com.picocontainer.examples.juicer;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class Main {

//    from http://picocontainer.com/introduction.html

    public static void main(String[] args) {

        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(Apple.class);
        pico.addComponent(Juicer.class);
        pico.addComponent(Peeler.class);

        System.out.println("=====Added====");

        Juicer juicer = (Juicer) pico.getComponent(Juicer.class);

        System.out.println("====Finished====");

        Apple ap = (Apple) pico.getComponent(Apple.class);

        System.out.println("====Peeler====");

        Peeler pl = (Peeler) pico.getComponent(Peeler.class);



    }
}
