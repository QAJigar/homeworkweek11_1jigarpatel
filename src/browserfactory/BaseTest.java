package browserfactory;
/**
 * Created by Jigar Patel
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest {

    //object of the WebDriver
    public static WebDriver driver;
    //Parameterised method for baseUrl
    public void openBrowser(String baseUrl){
        //launch Chrome browser by using Web driver object
        driver = new ChromeDriver();
        //Open Url by get method
        driver.get(baseUrl);
        //manage window to maximize
        driver.manage().window().maximize();
        //Implicitly waite time out set
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    //quit the season
    public void closeBrowser(){
        driver.quit();
    }
}
