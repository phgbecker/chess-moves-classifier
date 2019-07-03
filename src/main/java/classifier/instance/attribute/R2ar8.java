package classifier.instance.attribute;

import java.util.Random;

public enum R2ar8 {
    F("f"),
    T("t");

    private final String value;

    R2ar8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static R2ar8 getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
