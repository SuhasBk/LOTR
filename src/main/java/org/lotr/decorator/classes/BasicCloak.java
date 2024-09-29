package org.lotr.decorator.classes;

import org.lotr.decorator.interfaces.Cloak;

public class BasicCloak implements Cloak {
    public void wear() {
        System.out.println("Wearing basic cloak");
    }
}
