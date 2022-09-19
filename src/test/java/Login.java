import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingle.getDriverInstance(), Duration.ofSeconds(7));

    public void login() throws InterruptedException {
        studentInfo();
    }

    private void studentInfo() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(By.className("ng-tns-c34-4"));
        sendKeysToElement(By.id("FirstName"), Constant.firstName);
        sendKeysToElement(By.id("LastName"), Constant.lastName);
        sendKeysToElement(By.id("OfferId"), Constant.id);
        sendKeysToElement(By.id("phoneNumber"), Constant.phone);
        sendKeysToElement(By.id("mobileNumber"), Constant.mobilePhone);
        sendKeysToElement(By.id("EmailContact"), Constant.email);
       // clickElement(By.className("fa-floppy-disk"));
      //  wait.until(ExpectedConditions.elementToBeClickable(getWebElement(By.cssSelector("p-footer[class=ng-tns-c33-20]"))));
      //  clickElement(By.cssSelector("p-footer[class=ng-tns-c33-20]"));
    }

}
