package Steps;

import org.openqa.selenium.WebDriver;
import pages.DatepickerPage;
import utilities.DateKeeper;
import utilities.StringToDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatepickerSteps{
    private WebDriver driver;
    private StringToDate inputDate;
    private DateKeeper dateKeeper;
    private DatepickerPage page;

    public DatepickerSteps(WebDriver driver) {
        this.driver = driver;

    }

    public DatepickerSteps setData(String date){
        this.inputDate = new StringToDate(date);
        dateKeeper = new DateKeeper();
        dateKeeper.setDay(inputDate.getDay());
        dateKeeper.setMonth(inputDate.getMonth());
        dateKeeper.setYear(inputDate.getYear());
        this.page = new DatepickerPage(driver);
        return this;
    }

    public DatepickerSteps selectDay(){
        page.selectDay(dateKeeper.getMonth(),dateKeeper.getDay());
        return this;
    }

    private int getMonthToMove(){
        page.openCalendar();
        int currentMonth = monthInt(page.getCurrentMonth());
        int currentYear = Integer.parseInt(page.getCurrentYear());
        return ((dateKeeper.getYear()*12)+dateKeeper.getMonth())-((currentYear*12)+currentMonth);
    }


    public DatepickerSteps moveTo(){
        int countMonths = getMonthToMove();
        if (countMonths>0) {
            while (countMonths > 0) {
                page.Next();
                countMonths--;
            }
        }
        else {
            while (countMonths < 0) {
                page.Prev();
                countMonths++;
            }
        }
        return this;
    }

    private int monthInt(String inputMonth){
        try {
            Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(inputMonth);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal.get(Calendar.MONTH)+1;
        }catch (Exception e){}
        return 0;
    }

}
