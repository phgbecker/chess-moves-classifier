package classifier.instance.attribute;

import java.util.Random;

public enum Skach {
    F("f"),
    T("t");

    private final String value;

    Skach(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Skach getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
