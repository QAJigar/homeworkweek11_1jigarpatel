package testsuite;
/**
 * Created by Jigar Patel
 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    //1. userShouldNavigateToRegisterPageSuccessfully
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //* click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        //* Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.linkText("Register")).getText();
        Assert.assertEquals("Text Not Found", expectedText, actualText);
    }

    @Test
    //2. userShouldRegisterAccountSuccessfully
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        // Select gender radio button
        driver.findElement(By.name("Gender")).click();
        // Enter First name
        driver.findElement(By.name("FirstName")).sendKeys("Prime");
        // Enter Last name
        driver.findElement(By.name("LastName")).sendKeys("Testing");
        // Select Day Month and Year
        Select drpDAy = new Select(driver.findElement(By.name("DateOfBirthDay")));
        drpDAy.selectByVisibleText("2");
        Select dropMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        dropMonth.selectByVisibleText("March");
        Select dropYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        dropYear.selectByVisibleText("2024");
        // Enter Email address
        driver.findElement(By.name("Email")).sendKeys("jigar123@gmail.com");
        // Enter Password
        driver.findElement(By.name("Password")).sendKeys("Java123$selenium");
        // Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Java123$selenium");
        // Click on REGISTER button
        driver.findElement(By.name("register-button")).click();
        // Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Text Not Found", expectedText,actualText);
    }

    //Close the sessions
    @After
    public void tearDown(){
        closeBrowser();
    }
}
