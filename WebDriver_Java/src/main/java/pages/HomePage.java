package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    WebDriver driver;
    private By FormAuthenticationLink = By.linkText( "Form Authentication" );
    private By DropdownLink = By.linkText( "Dropdown" );

    public HomePage( WebDriver driver )
    {
        this.driver=driver;
    }
    public LoginPage ClickFormAuthentication(){
        driver.findElement( FormAuthenticationLink ).click();
        return new LoginPage(driver);
    }

    public DropDownPage ClickDropdown(){
        driver.findElement( DropdownLink ).click();
        return new DropDownPage(driver);
    }
}
