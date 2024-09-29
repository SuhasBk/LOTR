package org.lotr.strategy;

import org.lotr.strategy.interfaces.BattleStrategy;

public class Gandalf {
    private BattleStrategy strategy;

    public Gandalf(BattleStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeBattleStrategy(BattleStrategy newStrategy) {
        this.strategy = newStrategy;
    }

    public void execute() {
        this.strategy.fight();
    }
}
