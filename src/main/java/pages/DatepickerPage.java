package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatepickerPage extends BasePage{
    private WebDriver driver;
    @FindBy(id = "datepicker")
    private WebElement datapicker;
    @FindBy(className = "ui-datepicker-year")
    private WebElement currentYear;
    @FindBy(className = "ui-datepicker-month")
    private WebElement currentMonth;
    @FindBy(css = "a[title='Next']")
    private WebElement next;
    @FindBy(css = "a[title='Prev']")
    private WebElement prev;

    public DatepickerPage(WebDriver driver) {
        super(driver);
        WebElement frame = driver.findElement(By.className("demo-frame"));
        this.driver = driver.switchTo().frame(frame);
        PageFactory.initElements(this.driver, this);
    }

    public void selectDay(int month, int day) {
        List<WebElement> daysInCalendar = driver.findElements(By.cssSelector("td[data-month='" + (month - 1) + "']"));
        daysInCalendar.get(day - 1).findElement(By.tagName("a")).click();
    }

    public String dateFromCalendar() {
        return datapicker.getAttribute("value");
    }

    public void openCalendar() {
        waitToByClicable(datapicker);
        datapicker.click();
    }

    public void Next() {
        waitToByClicable(next);
        next.click();
    }

    public void Prev() {
        waitToByClicable(prev);
        prev.click();
    }

    public String getCurrentYear() {
        return currentYear.getText();
    }

    public String getCurrentMonth() {
        return currentMonth.getText();
    }
}
