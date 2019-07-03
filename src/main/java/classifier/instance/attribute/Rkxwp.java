package classifier.instance.attribute;

import java.util.Random;

public enum Rkxwp {
    F("f"),
    T("t");

    private final String value;

    Rkxwp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Rkxwp getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
