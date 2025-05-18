package manager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HelperBase {
    WebDriver wd;

//Create Constructor click right mouse button and selected Generate and click to Constructor!
    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    //Create methods for type to element (By locator,String text)
    public void type(By locator,String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        if(text!=null) {         //Checking to text dot not = 0 null
            element.sendKeys(text);
        }
    }

    //Crete methods for click to element (By locator,String text)
    public void click (By locator){
        WebElement element = wd.findElement(locator);
        element.click();
    }

    //Create methods for elementPresent
    public boolean isElementPresent(By locator){
        List<WebElement> list = wd.findElements(locator);
        return list.size()>0;
//        List<WebElement> list2 = wd.findElements(locator);
//        List<WebElement> list3 = wd.findElements(locator);
//        List<WebElement> list4 = wd.findElements(locator);
//        List<WebElement> list5 = wd.findElements(locator);
//        List<WebElement> list6 = wd.findElements(locator);
//        List<WebElement> list7 = wd.findElements(locator);
//        List<WebElement> list8 = wd.findElements(locator);
//        List<WebElement> list9 = wd.findElements(locator);
//        List<WebElement> list0 = wd.findElements(locator);

    }
     //Creted cheking is Alert with string error message
    public boolean isAlertPresend(String message) {
        Alert alert = new WebDriverWait(wd, Duration.ofSeconds(10))   // created alert == 10 second
                .until(ExpectedConditions.alertIsPresent());  // if text founded <10 second test passed
                if (alert!=null&&alert.getText().contains(message)){

                    //alert.accept(); ---> click OK
                    //alert.dismiss(); ---> click Cansel
                    //alert.sendKeys("Hello"); ---> type into alert

                    alert.accept();
                    return true;
    }
                    return false;
    }

}
