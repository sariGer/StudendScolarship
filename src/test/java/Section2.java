import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Section2 extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingle.getDriverInstance(), Duration.ofSeconds(7));

    public void section2() throws InterruptedException {
        studyCourse();
    }

    private void studyCourse() throws InterruptedException {
        clickElement(By.className("ng-tns-c34-5"));
        clickElement(By.className("ng-tns-c43-6"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[5]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-course-of-study/fieldset/div[1]/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li"));
        sendKeysToElement(By.id("Profession"), "כימיה");
        clickElement(By.className("ng-tns-c43-7"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[5]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-course-of-study/fieldset/div[1]/div[3]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li"));
        clickElement(By.className("ng-tns-c45-8"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[5]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-course-of-study/fieldset/div[2]/div[1]/p-calendar/span/div/div/div[2]/table/tbody/tr[3]/td[4]/a"));
        clickElement(By.className("ng-tns-c45-9"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[5]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-course-of-study/fieldset/div[2]/div[2]/p-calendar/span/div/div/div[2]/table/tbody/tr[3]/td[5]/a"));
        clickElement(By.className("ng-tns-c43-10"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[5]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-course-of-study/fieldset/div[2]/div[3]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
        clickElement(By.id("GradeAverage"));
        sendKeysToElement(By.id("GradeAverage"), "95");
        clickElement(By.id("Thesis"));
        sendKeysToElement(By.id("ThesisMotifHebrew"), "מימן");
        sendKeysToElement(By.id("ThesisMotifHinglish"), "hydrogen");
        clickElement(By.className("ng-tns-c45-20"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[5]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-course-of-study/fieldset/div[7]/div/p-calendar/span/div/div/div[2]/table/tbody/tr[5]/td[5]/a"));
       sendKeysToElement(By.id("DirectorName0"),"מנחם");
       sendKeysToElement(By.id("Name0"),"מחקר ופיתוח");




    }
}
