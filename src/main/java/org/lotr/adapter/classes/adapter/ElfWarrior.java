package org.lotr.adapter.classes.adapter;

import org.lotr.adapter.classes.entity.Elf;
import org.lotr.adapter.interfaces.Warrior;

public class ElfWarrior implements Warrior {
    private Elf elf;

    public ElfWarrior(Elf elf) {
        this.elf = elf;
    }
    
    @Override
    public void attack() {
        elf.shootArrow();
    }
}
