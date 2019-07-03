package classifier.instance.attribute;

import java.util.Random;

public enum Thrsk {
    F("f"),
    T("t");

    private final String value;

    Thrsk(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Thrsk getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
