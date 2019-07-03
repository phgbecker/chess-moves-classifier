package classifier.instance.attribute;

import java.util.Random;

public enum Stlmt {
    F("f"),
    T("t");

    private final String value;

    Stlmt(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Stlmt getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
