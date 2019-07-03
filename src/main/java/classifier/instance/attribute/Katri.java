package classifier.instance.attribute;

import java.util.Random;

public enum Katri {
    N("n"),
    W("w"),
    B("b");

    private final String value;

    Katri(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Katri getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
