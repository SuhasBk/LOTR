package org.lotr.adapter.classes.adapter;

import org.lotr.adapter.classes.entity.Dwarf;
import org.lotr.adapter.interfaces.Warrior;

public class DwarfWarrior implements Warrior {
    private Dwarf dwarf;

    public DwarfWarrior(Dwarf dwarf) {
        this.dwarf = dwarf;
    }

    @Override
    public void attack() {
        this.dwarf.swingAxe();
    }
}
