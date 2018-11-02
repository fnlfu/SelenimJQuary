package Steps;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.DatepickerMenuPage;
import pages.LeftMenuPage;
import pages.SliderMenuPage;

public class MainSteps extends BasePage {
    private WebDriver driver;
    private LeftMenuPage leftMenuPage;

    public MainSteps(WebDriver driver) {
        super(driver);
        this.driver = driver;
        leftMenuPage = new LeftMenuPage(driver);
    }

    public void selectSlider(){
        waitToByClicable(leftMenuPage.getSlider());
        leftMenuPage.getSlider().click();
        new SliderMenuPage(driver).selectCustomHandle();
    }
    public void selectDatepicker(){
        waitToByClicable(leftMenuPage.getDatapicker());
        leftMenuPage.getDatapicker().click();
        new DatepickerMenuPage(driver).selectOtherMonths();
    }
    public void selectDroppable(){
        waitToByClicable(leftMenuPage.getDroppable());
        leftMenuPage.getDroppable().click();
    }
}
