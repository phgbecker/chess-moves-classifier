package classifier.instance.attribute;

import java.util.Random;

public enum Qxmsq {
    F("f"),
    T("t");

    private final String value;

    Qxmsq(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Qxmsq getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
