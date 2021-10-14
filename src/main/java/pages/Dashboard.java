package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard extends AbstractPage{

    WebElement ticket = driver.findElement(By.xpath("//a[@href='/tickets/290/']"));

    public void checkTicket() {
        ticket.click();
    }
}
