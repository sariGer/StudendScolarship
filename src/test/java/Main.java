import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Main {
    @BeforeClass
    public void beforeAll() {
        String url = BasePage.getData("URL");
        DriverSingle.getDriverInstance().get(url);
        DriverSingle.getDriverInstance().manage().window().maximize();
        DriverSingle.getDriverInstance().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        DriverSingle.getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test001_login() throws InterruptedException {
        Thread.sleep(1000);
        Login loginPage = new Login();
        loginPage.login();
    }

    @Test
    public void test002_studyCourse() throws InterruptedException {
        Section2 section2Page = new Section2();
        section2Page.section2();
    }
    @Test
    public void test003_education() throws InterruptedException, IOException {
        Section3 section3Page = new Section3();
        section3Page.section3();
    }
    @Test
    public void test004_experience()throws InterruptedException{
        Section4 section4Page = new Section4();
        section4Page.section4();
    }

}
