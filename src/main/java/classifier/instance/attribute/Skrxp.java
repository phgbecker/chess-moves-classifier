package classifier.instance.attribute;

import java.util.Random;

public enum Skrxp {
    F("f"),
    T("t");

    private final String value;

    Skrxp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Skrxp getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
