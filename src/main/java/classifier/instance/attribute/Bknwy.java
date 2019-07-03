package classifier.instance.attribute;

import java.util.Random;

public enum Bknwy {
    F("f"),
    T("t");

    private final String value;

    Bknwy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Bknwy getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
