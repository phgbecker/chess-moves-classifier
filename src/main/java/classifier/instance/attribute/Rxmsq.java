package classifier.instance.attribute;

import java.util.Random;

public enum Rxmsq {
    F("f"),
    T("t");

    private final String value;

    Rxmsq(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Rxmsq getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
