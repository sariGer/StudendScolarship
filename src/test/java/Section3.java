import io.opentelemetry.api.metrics.BoundLongHistogram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Section3 extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingle.getDriverInstance(), Duration.ofSeconds(7));

    public void section3() throws InterruptedException, IOException {
        education();
      //  uploadFile();
    }

    private void education() throws InterruptedException, IOException {
        clickElement(By.className("ng-tns-c34-11"));
        clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[1]/div/div/p-radiobutton[1]/div/div[2]"));
        sendKeysToElement(By.id("HighSchoolName"), "תיכון אריאל");
        sendKeysToElement(By.id("HighSchoolProfession"), "חקר הגז");
        sendKeysToElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[2]/div[3]/nrg-input-number/div/input"), "2005");
        sendKeysToElement(By.id("WeightedGPA"), "95");
     // clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[3]/div[1]/nrg-input-file/div/div[2]"));
     //  sendKeysToElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[3]/div[1]/nrg-input-file/div/div[1]/div/div/a"),("C:\\Users\\Owner\\Desktop\\automation\\Test.docx"));
        //clickElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[3]/div[1]/nrg-input-file/div/div[2]/button"));
        //Runtime.getRuntime().exec(new String[]{"C:\\Users\\Owner\\Documents\\test2.exe"});
    }





















    //העלאת קובץ
   // private void uploadFile() throws InterruptedException, IOException {
        //clickElement((By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[3]/div[1]/nrg-input-file/div/div[2]/button")));
//sendKeysToElement(By.xpath("/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[3]/div[1]/nrg-input-file/div/div[1]/div/input"),"C:\\Users\\Owner\\Desktop\\automation\\Test.docx");
    //  getFile.click();
    //  Thread.sleep(5000);
       // WebElement getFile1 = DriverSingle.getDriverInstance().findElement(By.xpath("\"/html/body/app-root/app-mdn-form/div/div/form/div[6]/nrg-container/div/p-panel/div/div[2]/div/div/nrg-dcl-wrapper/app-education/fieldset/div[3]/div[1]/nrg-input-file/div/div[1]/div/input"));
       //getFile.sendKeys("C:\\Users\\Owner\\Desktop\\automation\\Test.docx");




//    }
  //  }
}
