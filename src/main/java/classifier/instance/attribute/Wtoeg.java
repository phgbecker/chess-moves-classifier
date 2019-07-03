package classifier.instance.attribute;

import java.util.Random;

public enum Wtoeg {
    N("n"),
    T("t");

    private final String value;

    Wtoeg(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wtoeg getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
