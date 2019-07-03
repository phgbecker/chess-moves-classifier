package classifier.instance.attribute;

import java.util.Random;

public enum Bkxwp {
    F("f"),
    T("t");

    private final String value;

    Bkxwp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkxwp getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
