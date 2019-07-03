package classifier.instance.attribute;

import java.util.Random;

public enum EndGame {
    WON("WON   "),
    NO_WIN("NO WIN");

    private final String value;

    EndGame(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
