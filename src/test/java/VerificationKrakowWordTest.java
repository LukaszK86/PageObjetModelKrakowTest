import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationKrakowWordTest {


       @Test
       public void verifyKrakowWordTest () {
           WebDriver driver = new ChromeDriver();
           driver.get("http://google.com");

           MainPage google = new MainPage(driver); //related with Mainpage

           google.typeSearchBox("Kraków");
           google.clickOnLoginButton();
           google.verifyWordKrakow();

           Assertions.assertEquals(4,4);
    }
}
