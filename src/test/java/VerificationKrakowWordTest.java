import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationKrakowWordTest {


       @Test
       public void verifyKrakowWord () {
           WebDriver driver = new ChromeDriver();
           driver.get("http://google.com");

           MainPage google = new MainPage(driver); //related with Mainpage

           google.typeSearchBox("Kraków");
           google.clickOnLoginButton();
           google.verifyWordKrakow();
    }
}
