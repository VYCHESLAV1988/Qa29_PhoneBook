package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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


}
