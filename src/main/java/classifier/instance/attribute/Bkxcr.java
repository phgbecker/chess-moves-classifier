package classifier.instance.attribute;

import java.util.Random;

public enum Bkxcr {
    F("f"),
    T("t");

    private final String value;

    Bkxcr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkxcr getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
