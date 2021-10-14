
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HelpdeskUITest {

    private WebDriver driver;

    @BeforeEach
    public void setup() throws IOException {

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("user.properties"));

        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        AbstractPage.setDriver(driver);
    }

    @Test
    public void createTicketTest() throws InterruptedException {

        driver.get(System.getProperty("site.url"));

        MainPage mainPage = new MainPage();
        mainPage.subTicket();

        TicketsPage ticketsPage = new TicketsPage();
        ticketsPage.chooseQueue("Some Product");
        Thread.sleep(2000);
        ticketsPage.sumProblem("How to use Git");
        Thread.sleep(2000);
        ticketsPage.putDescription("This is a ticket which talk us about all problems with Git");
        Thread.sleep(2000);
        ticketsPage.choosePriority("2. High");
        Thread.sleep(2000);
        ticketsPage.putEmail("ferrana2430@yandex.ru");
        Thread.sleep(2000);
        ticketsPage.subButton();
        Thread.sleep(2000);
        //номер тикета - 290

        SubmitPage submitPage = new SubmitPage();
        submitPage.goLog();

        LoginPage loginPage = new LoginPage();
        loginPage.logUser(System.getProperty("user"));
        Thread.sleep(2000);
        loginPage.logPass(System.getProperty("password"));
        Thread.sleep(2000);
        loginPage.pickLogin();
        Thread.sleep(2000);

        Overview overview = new Overview();
        overview.toDashboard();
        Thread.sleep(2000);

        Dashboard dashboardPage = new Dashboard();
        dashboardPage.checkTicket();
        Thread.sleep(6000);

        driver.close();
    }
}
