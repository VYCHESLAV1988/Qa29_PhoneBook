package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    //1 open login form
    public void openLoginRegistrationForm(){
        //WebElement loginTab = wd.findElement(By.xpath("//a[text()='LOGIN']"));   //----VAR1
        WebElement loginTab = wd.findElement(By.cssSelector("a[href='/login']"));  //----VAR2

     //2 click to login element
        loginTab.click();
    }

     //3   click to fill email and password form == .click() .clear() and .sendKeys()

        public void fillLoginRegistrationForm(String email,String password){
            WebElement emailInput = wd.findElement(By.name("email"));
            emailInput.click();
            emailInput.clear();
            emailInput.sendKeys(email);

            WebElement passwordInput = wd.findElement(By.xpath("//input[last()]"));
            passwordInput.click();
            passwordInput.clear();
            passwordInput.sendKeys(password);
        }



}
