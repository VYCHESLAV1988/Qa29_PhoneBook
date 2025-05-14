package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
public void loginSuccess(){
        //testBase rooting method for ApplicationManager(App) == App rooted HelperUser(.getHelperUser) == rooted link for methods .openLoginRegistrationForm()
        app.getHelperUser().openLoginRegistrationForm();
}


}
