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
}
