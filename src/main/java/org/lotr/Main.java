package org.lotr;

import java.util.List;

import org.lotr.adapter.classes.adapter.DwarfWarrior;
import org.lotr.adapter.classes.adapter.ElfWarrior;
import org.lotr.adapter.classes.adapter.RohanManWarrior;
import org.lotr.adapter.classes.entity.Aragorn;
import org.lotr.adapter.classes.entity.Dwarf;
import org.lotr.adapter.classes.entity.Elf;
import org.lotr.adapter.classes.entity.RohanMan;
import org.lotr.adapter.interfaces.Warrior;
import org.lotr.command.classes.commands.ChillCommand;
import org.lotr.command.classes.commands.RunCommand;
import org.lotr.command.classes.horses.ElvenHorse;
import org.lotr.command.classes.horses.Shadowfax;
import org.lotr.command.interfaces.Command;
import org.lotr.command.interfaces.Horse;
import org.lotr.decorator.classes.BasicCloak;
import org.lotr.decorator.classes.ElvenDecorator;
import org.lotr.decorator.interfaces.Cloak;
import org.lotr.factory.OrcFactory;
import org.lotr.factory.interfaces.Orc;
import org.lotr.strategy.Gandalf;
import org.lotr.strategy.classes.DiplomaticStrategy;
import org.lotr.strategy.classes.MagicStrategy;

public class Main {
    public static void main(String[] args) {
        // Factory Pattern:
        Orc orc = OrcFactory.createOrc("Regular"); // Use "Uruk-hai" for stronger orcs
        orc.fight();

        System.out.println();

        // Strategy Pattern:
        Gandalf gandalf = new Gandalf(new MagicStrategy());
        gandalf.execute();
        gandalf.changeBattleStrategy(new DiplomaticStrategy());
        gandalf.execute();

        System.out.println();

        // Decorator Pattern
        Cloak basic = new BasicCloak();
        basic.wear();
        Cloak elven = new ElvenDecorator(basic);
        elven.wear();
        basic.wear();

        System.out.println();

        // Command Pattern
        Horse shadowfax = new Shadowfax();
        Horse elvenHorse = new ElvenHorse();

        Command run = new RunCommand(shadowfax);
        run.execute();
        
        Command chill = new ChillCommand(shadowfax);
        chill.execute();

        run = new RunCommand(elvenHorse);
        run.execute();

        chill = new ChillCommand(elvenHorse);
        chill.execute();

        System.out.println();

        // Adapter Pattern
        /*
         * Imagine the Elf, Dwarf and RohanMan are classes from a 3rd party library and we don't have access or option to modify their implementations.
         */
        Elf legolas = new Elf();
        Dwarf gimli = new Dwarf();
        RohanMan eomer = new RohanMan();

        /*
         * But, we can create our own wrappers around those objects to abstract away custom implementations.
         */
        
        Warrior elfAdapter = new ElfWarrior(legolas);
        Warrior dwarfAdapter = new DwarfWarrior(gimli);
        Warrior rohanAdapter = new RohanManWarrior(eomer);

        /*
         * Aragorn, heir of Elendil and Isildur is the heart of the battle, the ultimate Numenorean to charge against Mordor with exceptional allies under his command.
         */

        Aragorn aragorn = new Aragorn(List.of(elfAdapter, dwarfAdapter, rohanAdapter));
        aragorn.command();
    }
}