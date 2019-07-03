package classifier.instance.attribute;

import java.util.Random;

public enum Bkon8 {
    F("f"),
    T("t");

    private final String value;

    Bkon8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkon8 getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
