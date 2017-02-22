package FaceBookHome;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by riponctg on 2/12/2017.
 */
public class FaceBookSerch extends CommonApi {
    @Test
    public void FaceBookSearch(){
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("email")).sendKeys("emdad.ripon");
        driver.findElement(By.id("pass")).sendKeys("$Ctg1025");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();

    }
    @Test
    public void getWebElement(){
        List<WebElement> elements = driver.findElements(By.xpath("//*"));
        System.out.println(Integer.toString(elements.size()));
        for(WebElement web:elements){
            System.out.println(web.getTagName()+":" +web.getText());
        }
    }
}
