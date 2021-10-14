package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

    WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));

    WebElement logButton = driver.findElement(By.xpath("//input[@value='Login']"));

    public void logUser(String userText) {
        username.sendKeys(userText);
    }

    public void logPass(String passwordText) {
        pass.sendKeys(passwordText);
    }

    public void pickLogin(){
        logButton.click();
    }
}
