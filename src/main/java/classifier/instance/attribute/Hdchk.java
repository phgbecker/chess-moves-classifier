package classifier.instance.attribute;

import java.util.Random;

public enum Hdchk {
    F("f"),
    T("t");

    private final String value;

    Hdchk(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Hdchk getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
