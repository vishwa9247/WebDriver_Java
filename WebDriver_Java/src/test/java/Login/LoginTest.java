package Login;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest
{
    @Test
    public void successfulLoginTest(){
      LoginPage loginpage =  homepage.ClickFormAuthentication();
      loginpage.setusernameField( "tomsmith" );
      loginpage.setpasswordField( "SuperSecretPassword!" );
      SecureAreaPage secureareapage = loginpage.clickLogin();
      assertTrue( secureareapage.getAlertText().contains(  "You logged into a secure area!"));
    }
}
