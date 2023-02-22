package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Options {

    FIRST_OPTION("Average monthly air temperature"),
    SECOND_OPTION("Quantity of days when the temperature was above the monthly average"),
    THIRD_OPTION("Quantity of days when the temperature was below 0C"),
    FORTH_OPTION("Three warmest days");

    private final String option;

    Options(String option) {
        this.option = option;
    }

    public static List<String> getOptions() {
        return Arrays.stream(Options.values())
                .sequential()
                .map(Options::getOption)
                .collect(Collectors.toList());
    }

    public static Options getByOptionValue(String string) {
        for (Options option : values()) {
            if (option.getOption().equals(string)) {
                return option;
            }
        }
        throw new IllegalArgumentException("No enum found with option");
    }

    public String getOption() {
        return option;
    }
}

