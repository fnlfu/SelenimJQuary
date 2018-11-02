package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage extends BasePage{

    private WebDriver driver;
    @FindBy(id = "custom-handle")
    private WebElement slider;

    public SliderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        this.driver.switchTo().frame(frame);
        PageFactory.initElements(this.driver,this);
    }

    public WebElement getSlider() {
        waitToByVisible(slider);
        return slider;
    }
}
