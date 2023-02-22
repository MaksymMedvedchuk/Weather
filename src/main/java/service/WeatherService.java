package service;

import model.Day;
import model.Month;
import model.Year;
import util.MonthHelper;
import util.YearUnmarshaller;

import java.util.Comparator;

public class WeatherService {

    private static final int TEMPERATURE = 0;
    private final YearUnmarshaller yearUnmarshaller = new YearUnmarshaller();
    private final MonthHelper monthHelper = new MonthHelper();


    public double getAverageMonthTemp(util.Month month) {
        return getAverageMonthTemp(month, null);
    }

    public double getAverageMonthTemp(util.Month month, Year year) {
        if (year == null) {
            year = yearUnmarshaller.getInfoFromXml();
        }
        Month monthModel = monthHelper.getMonthModel(month, year);
        int daysInMonthQuantity = monthModel.getDay().size();
        int monthTempSum = monthModel.getDay()
                .stream()
                .mapToInt(Day::getTemperature)
                .sum();
        return Math.floor((((double) monthTempSum) / ((double) daysInMonthQuantity)) * 100) / 100.0;
    }

    public int getDaysInMonthAboveAverageTempQuantity(util.Month month) {
        Year year = yearUnmarshaller.getInfoFromXml();
        double avrTemp = getAverageMonthTemp(month, year);
        return Math.toIntExact(monthHelper.getMonthModel(month, year).getDay()
                .stream()
                .filter(day -> day.getTemperature() > avrTemp)
                .count());
    }

    public int getTempDaysBelowZeroQuantity(util.Month month) {
        Year year = yearUnmarshaller.getInfoFromXml();
        return Math.toIntExact(monthHelper.getMonthModel(month, year).getDay()
                .stream()
                .map(Day::getTemperature)
                .filter(integer -> integer < TEMPERATURE)
                .count());
    }

    public StringBuilder getThreeWarmestDays(util.Month month) {
        StringBuilder result = new StringBuilder();
        Year year = yearUnmarshaller.getInfoFromXml();
        monthHelper.getMonthModel(month, year).getDay()
                .stream()
                .sorted(Comparator.comparing(Day::getTemperature).reversed())
                .limit(3)
                .map(Day::getDayNumber)
                .forEach(integer -> result.append(integer).append(" "));
        return result;
    }
}









