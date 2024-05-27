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
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //1. userShouldNavigateToLoginPageSuccessfully
    public void userShouldNavigateToLoginPageSuccessfully() {
        //find login link and click on login link
        driver.findElement(By.linkText("Log in")).click();
        //Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Not Redirected to login page", expectedText, actualText);
    }

    @Test
    //2. userShouldLoginSuccessfullyWithValidCredentials
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter valid username
        driver.findElement(By.id("Email")).sendKeys("jigar123@gmail.com");
        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("Java123$selenium");
        //click on login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click(); //button-1 login-button
        //Verify the ‘Log out’ text is display
        String expectedText = "Log out";
        String actualText = driver.findElement(By.className("ico-logout")).getText();
        Assert.assertEquals("Text Not Found" , expectedText, actualText);
    }

    @Test
    //3. verifyTheErrorMessage
    public void verifyTheErrorMessage() {
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");
        //Enter invalid password
        driver.findElement(By.name("Password")).sendKeys("prime123");
        // Click on Login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        //Verify the error message ‘Login was unsuccessful.Please correct the errors and try again.No customer account found’
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error Message Not Displayed", expectedErrorMessage, actualErrorMessage);
    }

    //Close the sessions
    @After
    public void tearDown() {
        closeBrowser();
    }
}
