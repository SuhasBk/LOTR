package org.lotr.decorator.classes;

import org.lotr.decorator.interfaces.Cloak;

public class ElvenDecorator implements Cloak{
    private Cloak cloak;

    public ElvenDecorator(Cloak cloak) {
        this.cloak = cloak;
    }

    public void wear() {
        cloak.wear();
        System.out.println("The cloak now has Elven powers!");
    }
}
