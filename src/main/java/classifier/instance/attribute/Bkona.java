package classifier.instance.attribute;

import java.util.Random;

public enum Bkona {
    F("f"),
    T("t");

    private final String value;

    Bkona(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkona getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
