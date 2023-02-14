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

    private String name;

    Month(String month) {
        this.name = month;
    }

    public String getMonth() {
        return name;
    }

    public static List<String> getMonths() {
        return Arrays.stream(Month.values()).sequential().map(Month::getMonth).collect(Collectors.toList());
    }
}
