package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructureTimeComp_PF {
	@FindBy(xpath="//a[text()=\"Time Complexity\"]") WebElement lnk_timeComplexity;
public void ClickDStimeComplexity() {
	lnk_timeComplexity.click();
}
}
