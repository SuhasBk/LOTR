package org.lotr.command.classes.commands;

import org.lotr.command.interfaces.Command;
import org.lotr.command.interfaces.Horse;

public class RunCommand implements Command{
    private Horse horse;

    public RunCommand(Horse horse) {
        this.horse = horse;
    }
    
    @Override
    public void execute() {
        horse.run();
    }
}
