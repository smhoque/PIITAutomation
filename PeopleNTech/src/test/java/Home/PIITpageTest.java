package Home;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by riponctg on 2/12/2017.
 */
public class PIITpageTest extends CommonApi {

    @Test
    public void testPIIThome() {


        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div/div[3]/dl/dd[1]/input")).sendKeys("sehoque");
        driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div/div[3]/dl/dd[2]/input")).sendKeys("224974893102575");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div/div[3]/p/input")).click();
    }
}
