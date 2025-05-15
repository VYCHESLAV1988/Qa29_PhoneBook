package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }


    public void openLoginRegistrationForm(){
//========================================VAR1============================================
//  1 open login form
//        WebElement loginTab = wd.findElement(By.xpath("//a[text()='LOGIN']"));   //----VAR1
//        WebElement loginTab = wd.findElement(By.cssSelector("a[href='/login']"));  //----VAR2
//
//  2 click to login element
//
//        loginTab.click();
// ==========================VAR2==============Method click created class HelperBase========
        click(By.xpath("//a[text()='LOGIN']"));

    }

     //3   click to fill email and password form == .click() .clear() and .sendKeys()

        public void fillLoginRegistrationForm(String email,String password){
            //======================VAR1======================
//            WebElement emailInput = wd.findElement(By.name("email"));
//            emailInput.click();
//            emailInput.clear();
//            emailInput.sendKeys(email);
//
//            WebElement passwordInput = wd.findElement(By.xpath("//input[last()]"));
//            passwordInput.click();
//            passwordInput.clear();
//            passwordInput.sendKeys(password);
            //======================VAR2==============Method type created class HelperBase========

            type(By.name("email"),email); //("locator",and method for type)
            type(By.xpath("//input[last()]"),password); //("locator",and method for type)

        }
    //4 Submit to Login button

        public void submitLogin(){
        click(By.xpath("//button[text()='Login']"));
        }




}
