package org.lotr.strategy.classes;

import org.lotr.strategy.interfaces.BattleStrategy;

public class DiplomaticStrategy implements BattleStrategy {
    public void fight() {
        System.out.println("Defeat Wormtongue using tricks");
    }
}
