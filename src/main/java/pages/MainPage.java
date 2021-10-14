package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {

    WebElement submitTicket = driver.findElement(By.xpath("//a[@href='/tickets/submit/']"));

    public void subTicket() {
        submitTicket.click();
    }

}
