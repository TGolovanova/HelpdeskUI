package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TicketsPage extends AbstractPage {

    private final WebElement queue = driver.findElement(By.xpath("//select[@id='id_queue']"));

    WebElement problem = driver.findElement(By.xpath("//input[@id='id_title']"));

    WebElement description = driver.findElement(By.xpath("//textarea[@name='body']"));

    WebElement priority = driver.findElement(By.xpath("//select[@name='priority']"));

    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

    WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

    public void chooseQueue(String text) {
        Select choose = new Select(queue);
        choose.getOptions().forEach(option -> {
            System.out.println("Value = " + option.getAttribute("value") + ";Text = " + option.getText());
        });
        choose.selectByVisibleText(text);
    }

    public void sumProblem(String text1) {
        problem.sendKeys(text1);
    }

    public void putDescription(String text2) {
        description.sendKeys(text2);
    }
    public void choosePriority(String text3) {
        Select chooseTwo = new Select(priority);
        chooseTwo.getOptions().forEach(option -> {
            System.out.println("Value = " + option.getAttribute("value") + ";Text = " + option.getText());
        });
        chooseTwo.selectByVisibleText(text3);
    }
    public void putEmail(String text4) {
        email.sendKeys(text4);
    }

    public void subButton() {
        submitButton.click();
    }

}
