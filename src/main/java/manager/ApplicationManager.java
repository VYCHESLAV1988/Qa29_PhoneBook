package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    HelperUser helperUser;



    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();        //opened windows full
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // time timeout 5 seconds for watch to element Sign Out

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
