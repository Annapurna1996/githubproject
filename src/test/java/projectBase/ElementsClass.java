package projectBase;

import org.openqa.selenium.By;

public class ElementsClass extends BasePage {
	public void click(By locator) {
		try {
			driver.findElement(locator).click();
			
		} catch (Exception e) {
			System.out.println("Unable to Type with the given locator");
			e.printStackTrace();
			
		}
		public void type(By locator, String text) {
			try {
				driver.findElement(locator).sendKeys(text);
			} catch (Exception e) {
				System.out.println("unable to Type with the given loctor");
				e.printStackTrace();
			}
		}
		
	}

}
