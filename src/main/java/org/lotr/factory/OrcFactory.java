package org.lotr.factory;

import org.lotr.factory.classes.RegularOrc;
import org.lotr.factory.classes.UrukHai;
import org.lotr.factory.interfaces.Orc;

public class OrcFactory {
    public static Orc createOrc(String type) {
        if (type.equals("Uruk-hai")) {
            return new UrukHai();
        } else {
            return new RegularOrc();
        }
    }
}
