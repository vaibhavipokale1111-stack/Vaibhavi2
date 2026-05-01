import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prac {
    @Test
    public void LoginTest(){
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.saucedemo.com/");
        String expectedtitle =("Swag Labs");
        String actualtitle = chrome.getTitle();
        Assert.assertEquals(expectedtitle,actualtitle,"Mismatch");

        chrome.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        chrome.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        chrome.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        String expectedtitle1 ="https://www.saucedemo.com/inventory.html";
        String actualtitle1 = chrome.getCurrentUrl();
        Assert.assertEquals(expectedtitle1,actualtitle1,"Login Failed");

        chrome.quit();

    }
}
