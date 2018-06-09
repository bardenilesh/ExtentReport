package pages;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryToursRegisterPage {
	WebDriver driver;
	@FindBy(xpath = "//input[@name='email']") WebElement email;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(css = "input[name='confirmPassword']") WebElement confirmPassword;
	@FindBy(name = "register") WebElement register;
	@FindBy(linkText = "SIGN-OFF") WebElement signoff;

	public MercuryToursRegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String clickUserInfo() {
		email.sendKeys("askmail18");
		password.sendKeys("askmail18");
		confirmPassword.sendKeys("askmail18");
		register.click();
		return driver.getTitle();
	}

	public void clickSignOff() {
		Assert.assertFalse(true,"Intentionally failed");
		signoff.click();
	}

}
