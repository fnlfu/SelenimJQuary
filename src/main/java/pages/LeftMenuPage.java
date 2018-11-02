package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenuPage extends BasePage{
    WebDriver driver;
    @FindBy(css = "*[href*='slider']")
    private WebElement slider;
    @FindBy(css = "[href*='datepicker']")
    private WebElement datapicker;
    @FindBy(css = "[href*='droppable']")
    private WebElement droppable;

    public LeftMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public WebElement getSlider() {
        return slider;
    }

    public WebElement getDatapicker() {
        return datapicker;
    }

    public WebElement getDroppable() {
        return droppable;
    }
}
