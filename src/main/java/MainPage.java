import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    By searchBox = By.id("lst-ib");
    By searchButton = By.name("btnK");
    By word = By.id("rhs_title");

    public MainPage (WebDriver driver){
this.driver = driver;
    }

    public void typeSearchBox (String wording){
        driver.findElement(searchBox).sendKeys(wording);
    }

    public void clickOnLoginButton(){
        driver.findElement(searchButton).click();
    }

    public void verifyWordKrakow (){
        String word = driver.findElement(By.id("rhs_title")).getText();
        Assertions.assertEquals("Kraków", word);
    }

}
