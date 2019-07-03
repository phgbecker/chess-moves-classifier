package classifier.instance.attribute;

import java.util.Random;

public enum Bkblk {
    F("f"),
    T("t");

    private final String value;

    Bkblk(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bkblk getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
