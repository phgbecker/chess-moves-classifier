package classifier.instance.attribute;

import java.util.Random;

public enum Spcop {
    F("f"),
    T("t");

    private final String value;

    Spcop(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Spcop getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
