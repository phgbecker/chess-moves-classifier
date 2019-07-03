package classifier.instance.attribute;

import java.util.Random;

public enum Dsopp {
    F("f"),
    T("t");

    private final String value;

    Dsopp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Dsopp getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
