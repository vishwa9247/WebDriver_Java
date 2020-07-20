package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import org.testng.annotations.*;

public class BaseTest
{

    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty( "webdriver.chrome.driver", "resources/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get( "https://the-internet.herokuapp.com/" );
        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize( new Dimension( 375, 812 ) );
//        WebElement inputLink = driver.findElement( By.linkText("Inputs") );
//        inputLink.click();
//        List <WebElement> links= driver.findElements( By.tagName( "a" ) );
//        System.out.println( links.size());
//        WebElement Shifting_Content = driver.findElement( By.linkText("Shifting Content") );
//        Shifting_Content.click();
//
//        WebElement ExampleOne = driver.findElement( By.linkText("Example 1: Menu Element") );
//        ExampleOne.click();
//        List <WebElement> items = driver.findElements( By.tagName("a" ));
//        System.out.println(items.size());
//        System.out.println(driver.getTitle());

        homepage = new HomePage( driver );
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }


}