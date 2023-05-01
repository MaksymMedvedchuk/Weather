package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private final String name;

    Month(String month) {
        this.name = month;
    }

    public static List<String> getMonths() {
        return Arrays.stream(Month.values())
                .sequential()
                .map(Month::getMonth)
                .collect(Collectors.toList());
    }

    public static Month getByMonthValue(String string) {
        for (Month month : values()) {
            if (month.getMonth().equals(string)) {
                return month;
            }
        }
        throw new IllegalArgumentException("No enum found with month");
    }

    public String getMonth() {
        return name;
    }
}
