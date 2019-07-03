package classifier.instance.attribute;

import java.util.Random;

public enum Wkna8 {
    F("f"),
    T("t");

    private final String value;

    Wkna8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wkna8 getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
