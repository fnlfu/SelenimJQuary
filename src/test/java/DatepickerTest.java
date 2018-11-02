import Steps.DatepickerSteps;
import Steps.MainSteps;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatepickerTest extends BaseTest{

    DatepickerSteps datepickerSteps;

    @BeforeMethod
    public void setUpTest() {
        new MainSteps(driver).selectDatepicker();
        datepickerSteps = new DatepickerSteps(driver);
    }

    @Test
    public void testDatepicker() {
        datepickerSteps.setData("01.01.2018")
                       .moveTo()
                       .selectDay();
    }
}
