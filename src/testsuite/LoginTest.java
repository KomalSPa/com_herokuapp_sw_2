package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * userSholdLoginSuccessfullyWithValidCredentials
 * Enter “tomsmith” username
 * Enter “SuperSecretPassword!” password
 * Click on ‘LOGIN’ button
 * Verify the error message “Your password is invalid!”
 */

public class LoginTest extends BaseTest {

    String baseURL = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        // Enter “tomsmith1” username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith1");

        // Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");

        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
    }





@Test
        public void userSholdLoginSuccessfullyWithValidCredentialsTest(){
        // Enter “tomsmith” username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");

        // Enter “SuperSecretPassword!” password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword");

        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

        // Verify the error message “Your password is invalid!”
        String expectedText = "Your password is invalid!\n" +"×";
        String actualText = driver.findElement(By.xpath("//div[1]/div/div|/text()")).getText();
        Assert.assertEquals("'Your password is invalid!' text not correct." , expectedText, actualText);
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }

}