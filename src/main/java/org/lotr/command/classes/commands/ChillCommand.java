package org.lotr.command.classes.commands;

import org.lotr.command.interfaces.Command;
import org.lotr.command.interfaces.Horse;

public class ChillCommand implements Command {
    private Horse horse;

    public ChillCommand(Horse horse) {
        this.horse = horse;
    }
    
    @Override
    public void execute() {
        horse.chill();
    }
}
