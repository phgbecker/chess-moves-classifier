package classifier.instance.attribute;

import java.util.Random;

public enum Simpl {
    F("f"),
    T("t");

    private final String value;

    Simpl(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Simpl getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
