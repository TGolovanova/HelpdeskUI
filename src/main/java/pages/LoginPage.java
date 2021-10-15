package pages;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static io.qameta.allure.Allure.addAttachment;

public class LoginPage extends AbstractPage {

    WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

    WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));

    WebElement logButton = driver.findElement(By.xpath("//input[@value='Login']"));

    @Step("Enter username")
    public void logUser(String userText) throws IOException {
        username.sendKeys(userText);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("username added", FileUtils.openInputStream(screenshotFile));
    }

    @Step("Enter password")
    public void logPass(String passwordText) throws IOException {
        pass.sendKeys(passwordText);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("password added", FileUtils.openInputStream(screenshotFile));
    }

    public void pickLogin(){
        logButton.click();
    }
}
