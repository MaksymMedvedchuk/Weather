package servlet;

import logic.Person;
import util.Month;
import util.Options;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/options")
public class OptionsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.setAttribute("months", Month.getMonths());
            req.setAttribute("options", Options.getOptions());

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("options.jsp");
            requestDispatcher.forward(req, resp);
        } catch (Exception e) {
  /*          try {
                req.setAttribute("errorText", e.getMessage());
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("error.jsp");
                requestDispatcher.forward(req, resp);
            } catch (Exception ignore) {*/
            }
        }
    }

