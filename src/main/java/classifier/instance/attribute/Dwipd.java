package classifier.instance.attribute;

import java.util.Random;

public enum Dwipd {
    L("l"),
    G("g");

    private final String value;

    Dwipd(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Dwipd getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
