package classifier.instance.attribute;

import java.util.Random;

public enum Wkpos {
    F("f"),
    T("t");

    private final String value;

    Wkpos(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wkpos getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
