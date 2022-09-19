import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Section4 extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingle.getDriverInstance(), Duration.ofSeconds(7));

    public void section4() throws InterruptedException {
        experience();
        // uploadFile();
        save();
    }

    private void experience() throws InterruptedException {
        clickElement(By.className("ng-tns-c34-12"));
        sendKeysToElement(By.id("AcademicSchoolName0"), "מכללה");
        sendKeysToElement(By.id("Profession0"), "חקר מימן באויר");
        clickElement(By.className("ng-tns-c45-13"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[8]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-research-experience/fieldset/nrg-repeat/div/div/div[1]/fieldset/div[3]/div[1]/p-calendar/span/div/div/div[2]/table/tbody/tr[4]/td[1]/a"));
        clickElement(By.className("ng-tns-c45-14"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[8]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-research-experience/fieldset/nrg-repeat/div/div/div[1]/fieldset/div[3]/div[2]/p-calendar/span/div/div/div[2]/table/tbody/tr[5]/td[1]/a"));
        // clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[8]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-research-experience/fieldset/div/div/div/p-radiobutton[2]/div/div[2]/span"));
    }

    private void save() throws InterruptedException {
        clickElement(By.className("fa-floppy-disk"));
        //Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(getWebElement(By.xpath("/html/body/app-root/app-mdn-form/div/nrg-alerts/p-dialog/div/div/div[3]/p-footer/button"))));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/nrg-alerts/p-dialog/div/div/div[3]/p-footer/button"));
        // clickElement(By.cssSelector("p-footer[class=ng-tns-c33-27]"));

    }

}

