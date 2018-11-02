package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderMenuPage  extends BasePage{
    private WebDriver driver;
    @FindBy(css = "*[class='demo-list'] *[href*='custom-handle.html']")
    private WebElement customHandle;

    public SliderMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void selectCustomHandle(){
        customHandle.click();
    }

}
