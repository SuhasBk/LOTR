package org.lotr.adapter.classes.entity;

import java.util.List;

import org.lotr.adapter.interfaces.Warrior;

public class Aragorn {
    private List<Warrior> warriors;

    public Aragorn(List<Warrior> warriors) {
        this.warriors = warriors;
    }

    public void command() {
        for(Warrior warrior: warriors) {
            warrior.attack();
        }
    }
}
