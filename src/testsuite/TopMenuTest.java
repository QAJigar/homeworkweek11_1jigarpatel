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

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    //1. userShouldNavigateToComputerPageSuccessfully
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘Computers’ Tab
        driver.findElement(By.linkText("Computers")).click();
        //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//strong[@class='current-item']")).getText();
        Assert.assertEquals("Text Not Found", expectedText,actualText);
    }

    @Test
    //2. userShouldNavigateToElectronicsPageSuccessfully
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        driver.findElement(By.linkText("Electronics")).click();
        //Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.linkText("Electronics")).getText();
        Assert.assertEquals("Text Not Found", expectedText,actualText);
    }

    @Test
    //3. userShouldNavigateToApparelPageSuccessfully
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.linkText("Apparel")).click();
        //Verify the text ‘Digital downloads’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.linkText("Apparel")).getText();
        Assert.assertEquals("Text Not Found", expectedText,actualText);
    }

    @Test
    //4. userShouldNavigateToDigitalDownloadsPageSuccessfully
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.linkText("Digital downloads")).click();
        //Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.linkText("Digital downloads")).getText();
        Assert.assertEquals("Text Not Found", expectedText, actualText);
    }

    @Test
    //5. userShouldNavigateToBooksPageSuccessfully
    public void userShouldNavigateToBooksPageSuccessfully(){
        // click on the ‘Books’ Tab
        driver.findElement(By.linkText("Books")).click();
        // Verify the text ‘Books’
        String expectedText = "Books";
        String actualText = driver.findElement(By.linkText("Books")).getText();
        Assert.assertEquals("Text Not Found", expectedText,actualText);
    }

    @Test
    //6. userShouldNavigateToJewelryPageSuccessfully
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on the ‘Jewelry’ Tab
        driver.findElement(By.linkText("Jewelry")).click();
        // Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.linkText("Jewelry")).getText();
        Assert.assertEquals("Text Not Found", expectedText,actualText);
    }

    @Test
    //7. userShouldNavigateToGiftCardsPageSuccessfully
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the ‘Gift Cards’ Tab
        driver.findElement(By.linkText("Gift Cards")).click();
        // Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.linkText("Gift Cards")).getText();
    }

    //Close the sessions
    @After
    public void tearDown(){
        closeBrowser();
    }
}
