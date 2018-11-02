import Steps.MainSteps;
import Steps.SliderSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest{

    SliderSteps sliderSteps;

    @BeforeMethod
    public void setUpTest() {
        new MainSteps(driver).selectSlider();
        sliderSteps = new SliderSteps(driver);
    }

    @Test
    public void testSlider() {

        sliderSteps.SliderMove(55);

    }
}
