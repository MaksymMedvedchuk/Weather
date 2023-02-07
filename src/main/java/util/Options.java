package util;

public enum Options {

    FIRST_OPTION("Average monthly air temperature"),
    SECOND_OPTION("Number of days when the temperature was above the monthly average"),
    THIRD_OPTION("Number of days when the temperature was below 0C"),
    FORTH_OPTION("Three warmest days");

    private String option;

    Options(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
