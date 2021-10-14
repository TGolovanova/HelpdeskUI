package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubmitPage extends AbstractPage{

    WebElement logPage = driver.findElement(By.xpath("//a[@role='button']"));

    public void goLog() {
        logPage.click();
    }
}
