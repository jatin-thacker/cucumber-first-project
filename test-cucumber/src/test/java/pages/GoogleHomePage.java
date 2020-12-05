package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	static By imageLink = By.linkText("Images");
	public static WebElement getImageIcon(WebDriver driver) {
		WebElement imageIcon = driver.findElement(imageLink);
		return imageIcon;
	}
}
