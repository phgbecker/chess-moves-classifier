package classifier.instance.attribute;

import java.util.Random;

public enum Skewr {
    F("f"),
    T("t");

    private final String value;

    Skewr(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Skewr getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
