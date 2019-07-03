package classifier.instance.attribute;

import java.util.Random;

public enum Blxwp {
    F("f"),
    T("t");

    private final String value;

    Blxwp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Blxwp getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
