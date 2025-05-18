package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){    //Method for checking to logged or not logged . And exit Log Out
        //if Sign Out present -----> logout
        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logout();     //Create method logout for class HelperUser
        }
    }

    @Test
public void loginSuccess(){
        //testBase rooting method for ApplicationManager(App) == App rooted HelperUser(.getHelperUser) == rooted link for methods .openLoginRegistrationForm()
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("svngdv@gmail.com","A123456789a@");
        app.getHelperUser().submitLogin();

//        Assert.assertEquals();
//        Assert.assertNotEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();

       Assert.assertTrue(app.getHelperUser().isLogged()); //Create method .isLogged for class HelperUser
}

    @Test
    public void loginSuccessModels(){
        //testBase rooting method for ApplicationManager(App) == App rooted HelperUser(.getHelperUser) == rooted link for methods .openLoginRegistrationForm()
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("svngdv@gmail.com","A123456789a@");
        app.getHelperUser().submitLogin();

//        Assert.assertEquals();
//        Assert.assertNotEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();

        Assert.assertTrue(app.getHelperUser().isLogged()); //Create method .isLogged for class HelperUser
    }

    @Test
    public void loginWrongEmail(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("svngdvgmail.com","A123456789a@");
        app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isAlertPresend("Wrong email or password")); //Create method isAlertPresent to class HelperBase
    }

    @Test
    public void loginWrongPassword(){
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("svngdv@gmail.com","A123456789a");
    app.getHelperUser().submitLogin();
    Assert.assertTrue(app.getHelperUser().isAlertPresend("Wrong email or password"));
    }

    @Test
    public void loginWrongUnregisteredUser(){
    app.getHelperUser().openLoginRegistrationForm();
    app.getHelperUser().fillLoginRegistrationForm("svngdv1988@gmail.com","A123456789a@");  //added "svngd[1988]@gmail.com
    app.getHelperUser().submitLogin();
    Assert.assertTrue(app.getHelperUser().isAlertPresend("Wrong email or password"));
    }
}
