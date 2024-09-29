package org.lotr.strategy.classes;

import org.lotr.strategy.interfaces.BattleStrategy;

public class MagicStrategy implements BattleStrategy {
    public void fight() {
        System.out.println("Shifting to my walking stick!");
    }
}
