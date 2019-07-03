package classifier.instance.attribute;

import java.util.Random;

public enum Mulch {
    F("f"),
    T("t");

    private final String value;

    Mulch(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Mulch getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
