package org.lotr.factory.classes;

import org.lotr.factory.interfaces.Orc;

public class RegularOrc implements Orc{
    public void fight() {
        System.out.println("Regular weak orcs!");
    }
}
