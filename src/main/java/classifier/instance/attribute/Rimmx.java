package classifier.instance.attribute;

import java.util.Random;

public enum Rimmx {
    F("f"),
    T("t");

    private final String value;

    Rimmx(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Rimmx getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
