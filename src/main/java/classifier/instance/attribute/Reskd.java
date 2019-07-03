package classifier.instance.attribute;

import java.util.Random;

public enum Reskd {
    F("f"),
    T("t");

    private final String value;

    Reskd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Reskd getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
