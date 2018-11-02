package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatepickerMenuPage extends BasePage{
    private WebDriver driver;
    @FindBy(css = "*[class='demo-list'] *[href*='other-months.html']")
    private WebElement otherMonths;

    public DatepickerMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void selectOtherMonths(){
        waitToByClicable(otherMonths);
        otherMonths.click();
    }
}
