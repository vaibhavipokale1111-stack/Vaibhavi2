import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Automation1 {

    @Test
    public void LoginTest(){

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.saucedemo.com/");
        String ExpectedTitle= "Swag Labs";
        String ActualTitle = chrome.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle,"Title Mismatch");

        chrome.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        chrome.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        chrome.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        String ExpectedUrl = "https://www.saucedemo.com/inventory.html";
        String ActualUrl = chrome.getCurrentUrl();
        Assert.assertEquals(ActualUrl ,ActualUrl,"Login Failed");

        boolean isDisplayed = chrome.findElement(By.className("title")).isDisplayed();
        Assert.assertTrue(isDisplayed,"Page not visible ");
        chrome.quit();

    }
}