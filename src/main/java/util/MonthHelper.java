package util;

import model.Month;
import model.Year;

public class MonthHelper {

    //todo replace compareMonth with this
    public Month getMonthModel(util.Month month, Year year) {
        for (Month monthModel : year.getMonth()) {
            if (monthModel.getMonthName().toString().equalsIgnoreCase(month.getMonth()))
                return monthModel;
        }
        throw new IllegalArgumentException("Month not found");
    }
}

