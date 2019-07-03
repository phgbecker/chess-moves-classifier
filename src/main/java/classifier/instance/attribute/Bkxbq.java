package classifier.instance.attribute;

import java.util.Random;

public enum Bkxbq {
    F("f"),
    T("t");

    private final String value;

    Bkxbq(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkxbq getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
