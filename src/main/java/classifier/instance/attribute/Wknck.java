package classifier.instance.attribute;

import java.util.Random;

public enum Wknck {
    F("f"),
    T("t");

    private final String value;

    Wknck(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wknck getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
