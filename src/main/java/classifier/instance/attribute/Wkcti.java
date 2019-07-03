package classifier.instance.attribute;

import java.util.Random;

public enum Wkcti {
    F("f"),
    T("t");

    private final String value;

    Wkcti(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Wkcti getRandomValue() {
        return values()[new Random().nextInt(values().length)];
    }
}
