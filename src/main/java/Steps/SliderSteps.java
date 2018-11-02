package Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.SliderPage;

public class SliderSteps {
    private WebDriver driver;
    private SliderPage SliderPage;
    private WebElement slider;

    public SliderSteps(WebDriver driver) {
        this.driver = driver;
        SliderPage=new SliderPage(driver);
        slider = SliderPage.getSlider();
    }

    public void SliderMove(int i) {
        if (Integer.parseInt(slider.getText()) < i)
            while (Integer.parseInt(slider.getText()) != i) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        else
            while (Integer.parseInt(slider.getText()) != i) {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
    }

}
