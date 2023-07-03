package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class ValuePage {

    @FindBy(id = "lbl_val_1")
    private WebElement lblVal1;

    @FindBy(id = "lbl_val_2")
    private WebElement lblVal2;

    @FindBy(id = "lbl_val_3")
    private WebElement lblVal3;

    @FindBy(id = "lbl_val_4")
    private WebElement lblVal4;

    @FindBy(id = "lbl_val_5")
    private WebElement lblVal5;

    @FindBy(id = "lbl_ttl_val")
    private WebElement lblTtlVal;

    public ValuePage(WebDriver driver) {
        this.lblVal1 = lblVal1;
        this.lblVal2 = lblVal2;
        this.lblVal3 = lblVal3;
        this.lblVal4 = lblVal4;
        this.lblVal5 = lblVal5;
        this.lblTtlVal=lblTtlVal;
        PageFactory.initElements(driver, this);
    }



    public Map<String, String> getAllLabelValues() {
        Map<String, String> labelValues = new HashMap<>();

        labelValues.put("lbl_val_1", lblVal1.getText());
        labelValues.put("lbl_val_2", lblVal2.getText());
        labelValues.put("lbl_val_3", lblVal3.getText());
        labelValues.put("lbl_val_4", lblVal4.getText());
        labelValues.put("lbl_val_5", lblVal5.getText());
        labelValues.put("lbl_ttl_val", lblTtlVal.getText());

        return labelValues;
    }
}
