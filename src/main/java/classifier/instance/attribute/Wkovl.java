package classifier.instance.attribute;

import java.util.Random;

public enum Wkovl {
    F("f"),
    T("t");

    private final String value;

    Wkovl(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wkovl getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
