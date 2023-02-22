package servlet;

import service.WeatherService;
import util.Month;
import util.Options;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/weather")
public class OptionsServlet extends HttpServlet {

    private final static String MONTHS_LIST_ATTRIBUTE = "months";
    private final static String OPTIONS_LIST_ATTRIBUTE = "options";
    private final static String RESULT_ATTRIBUTE = "result";
    private final static String MAIN_JSP_PAGE = "mainPage.jsp";
    private final static String RESULT_JSP = "result.jsp";
    private final static String PARAMETER_MONTH = "currentMonth";
    private final static String PARAMETER_OPTION = "currentOption";
    private final WeatherService weatherService = new WeatherService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setAttribute(MONTHS_LIST_ATTRIBUTE, Month.getMonths());
            request.setAttribute(OPTIONS_LIST_ATTRIBUTE, Options.getOptions());

            RequestDispatcher requestDispatcher = request.getRequestDispatcher(MAIN_JSP_PAGE);
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String month = request.getParameter(PARAMETER_MONTH);
            String option = request.getParameter(PARAMETER_OPTION);
            Options optionValue = Options.getByOptionValue(option);
            if (optionValue.equals(Options.FIRST_OPTION)) {
                request.setAttribute(RESULT_ATTRIBUTE, weatherService.getAverageMonthTemp(Month.getByMonthValue(month)));
            } else if (optionValue.equals(Options.SECOND_OPTION)) {
                request.setAttribute(RESULT_ATTRIBUTE, weatherService.getDaysInMonthAboveAverageTempQuantity(Month.getByMonthValue(month)));
            } else if (optionValue.equals(Options.THIRD_OPTION)) {
                request.setAttribute(RESULT_ATTRIBUTE, weatherService.getTempDaysBelowZeroQuantity(Month.getByMonthValue(month)));
            } else if (optionValue.equals(Options.FORTH_OPTION)) {
                request.setAttribute(RESULT_ATTRIBUTE, weatherService.getThreeWarmestDays(Month.getByMonthValue(month)));
            }

            request.getRequestDispatcher(RESULT_JSP).forward(request, response);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

