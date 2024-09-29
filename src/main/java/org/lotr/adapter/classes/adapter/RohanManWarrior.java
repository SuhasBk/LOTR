package org.lotr.adapter.classes.adapter;

import org.lotr.adapter.classes.entity.RohanMan;
import org.lotr.adapter.interfaces.Warrior;

public class RohanManWarrior implements Warrior {
    private RohanMan rohanMan;

    public RohanManWarrior(RohanMan rohanMan) {
        this.rohanMan = rohanMan;
    }

    @Override
    public void attack() {
        this.rohanMan.chargeWithSword();    
    }
}
