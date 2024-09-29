package org.lotr.command.classes.horses;

import org.lotr.command.interfaces.Horse;

public class Shadowfax implements Horse {
    @Override
    public void chill() {
        System.out.println("Shadowfax don't chill! It keeps on horsing."); 
    }

    @Override
    public void run() {
        System.out.println("Shadowfax horsing at the speed of light.");
    }
}
