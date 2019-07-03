package classifier.instance.attribute;

import java.util.Random;

public enum Bxqsq {
    F("f"),
    T("t");

    private final String value;

    Bxqsq(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bxqsq getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
