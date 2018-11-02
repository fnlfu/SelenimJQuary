package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DroppableSteps {
    private WebDriver driver;
    @FindBy(id = "draggable")
    private WebElement draggable;
    @FindBy(id = "droppable")
    private WebElement droppable;


    public DroppableSteps(WebDriver driver) {
        this.driver = driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        PageFactory.initElements(this.driver,this);
    }

    public void doDragAndDrop(){
        Actions act = new Actions(driver);
        act.dragAndDrop(draggable,droppable).build().perform();
    }
}
