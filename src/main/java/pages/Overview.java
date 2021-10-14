package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Overview extends AbstractPage{

    WebElement dashboard = driver.findElement(By.xpath("//a[@href='/dashboard/']"));

    public void toDashboard() {
        dashboard.click();
    }
}