package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Overview extends AbstractPage{

    WebElement dashboard = driver.findElement(By.xpath("//a[@href='/dashboard/']"));

    public void toDashboard() {
        dashboard.click();
    }
}