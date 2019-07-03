package classifier.instance.attribute;

import java.util.Random;

public enum Cntxt {
    F("f"),
    T("t");

    private final String value;

    Cntxt(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Cntxt getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
