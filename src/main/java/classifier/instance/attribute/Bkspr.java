package classifier.instance.attribute;

import java.util.Random;

public enum Bkspr {
    F("f"),
    T("t");

    private final String value;

    Bkspr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkspr getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
