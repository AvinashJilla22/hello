import Page.ValuePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MyStepdefs extends BaseStep {
    public static class ValueStepDefinitions {
        private WebDriver driver;
        private ValuePage valuePage;

        public ValueStepDefinitions(WebDriver driver, ValuePage valuePage) {
            this.driver = driver;
            this.valuePage = valuePage;
        }

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            valuePage = new ValuePage(driver);
        }

        @Given("I am on the value page")
        public void iAmOnTheValuePage() {
            driver.get("https://example.com/value");
        }

        @Then("I should see the correct values for all labels")
        public void iShouldSeeTheCorrectValuesForAllLabels() {
            Map<String, String> expectedValues = new HashMap<>();
            expectedValues.put("lbl_val_1", "$122,365.24");
            expectedValues.put("lbl_val_2", "$599.00");
            expectedValues.put("lbl_val_3", "$850,139.99");
            expectedValues.put("lbl_val_4", "$23,329.50");
            expectedValues.put("lbl_val_5", "$566.27");
            expectedValues.put("lbl_ttl_val", "$1,000,000.00");

            Map<String, String> actualValues = valuePage.getAllLabelValues();

            assertEquals(expectedValues, actualValues);
        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }
}
