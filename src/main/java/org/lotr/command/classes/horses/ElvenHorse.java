package org.lotr.command.classes.horses;

import org.lotr.command.interfaces.Horse;

public class ElvenHorse implements Horse {
    @Override
    public void chill() {
        System.out.println("Elven Horse is always chill with elegance");
    }

    @Override
    public void run() {
        System.out.println("Elven horse running faster than orcs");
    }
}
