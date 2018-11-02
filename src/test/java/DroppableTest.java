import Steps.DroppablePage;
import Steps.DroppableSteps;
import Steps.MainSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTest extends BaseTest{

    DroppablePage droppablePage;
    @BeforeMethod
    public void setUpTest() {
        new MainSteps(driver).selectDroppable();
        droppablePage = new DroppablePage(driver);
    }

    @Test
    public void testDroppable() {

        droppablePage.doDragAndDrop();

    }
}
