package pages;

import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {
        $x("//select[@class='react-datepicker__month-select']").selectOption(month);
        $x("//select[@class='react-datepicker__year-select']").selectOption(year);
        $x("//div[@class='react-datepicker__day react-datepicker__day--0" + day + "']").click();
    }

}
