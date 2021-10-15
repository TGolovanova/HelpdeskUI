package pages;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import static io.qameta.allure.Allure.addAttachment;

public class TicketsPage extends AbstractPage {

    private final WebElement queue = driver.findElement(By.xpath("//select[@id='id_queue']"));

    WebElement problem = driver.findElement(By.xpath("//input[@id='id_title']"));

    WebElement description = driver.findElement(By.xpath("//textarea[@name='body']"));

    WebElement priority = driver.findElement(By.xpath("//select[@name='priority']"));

    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

    WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

    @Step("Choose queue")
    public void chooseQueue(String text) throws IOException {
        Select choose = new Select(queue);
        choose.getOptions().forEach(option -> {
            System.out.println("Value = " + option.getAttribute("value") + ";Text = " + option.getText());
        });
        choose.selectByVisibleText(text);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("queue selected", FileUtils.openInputStream(screenshotFile));
    }

    @Step("Enter summary of problem")
    public void sumProblem(String text1) throws IOException {
        problem.sendKeys(text1);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("summary of problem added", FileUtils.openInputStream(screenshotFile));
    }

    @Step("Enter description")
    public void putDescription(String text2) throws IOException {
        description.sendKeys(text2);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("description added", FileUtils.openInputStream(screenshotFile));
    }
    @Step("Choose priority")
    public void choosePriority(String text3) throws IOException {
        Select chooseTwo = new Select(priority);
        chooseTwo.getOptions().forEach(option -> {
            System.out.println("Value = " + option.getAttribute("value") + ";Text = " + option.getText());
        });
        chooseTwo.selectByVisibleText(text3);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("priority selected", FileUtils.openInputStream(screenshotFile));
    }

    @Step("Enter email")
    public void putEmail(String text4) throws IOException {
        email.sendKeys(text4);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        addAttachment("email added", FileUtils.openInputStream(screenshotFile));
    }

    public void subButton() {
        submitButton.click();
    }

}
