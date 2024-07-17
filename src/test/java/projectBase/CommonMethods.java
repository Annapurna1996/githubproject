package projectBase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonMethods extends BasePage {


public void isElementVisible(By locator) {
	Wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
}
