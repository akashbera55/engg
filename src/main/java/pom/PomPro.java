package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstants;
import generics.ExcelLibrary;

public class PomPro implements AutoConstants
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public PomPro(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 1));
		keepMeLoggedInCheckBox.click();
		loginButton.click();
	}

}
