package classifier.instance.attribute;

import java.util.Random;

public enum Reskr {
    F("f"),
    T("t");

    private final String value;

    Reskr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Reskr getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
