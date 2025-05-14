package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

    WebDriver wd;

    HelperUser helperUser;



    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app");

        //initialization helperUser
        helperUser = new HelperUser(wd);
    }

    public void stop(){
        //wd.quit();
    }

    //Generate to GETTERS == click to right button mouse chose Generate and click to GETTERS!= click to only helperUser

    public HelperUser getHelperUser() {
        return helperUser;
    }
}
