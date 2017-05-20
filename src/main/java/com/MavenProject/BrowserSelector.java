package com.MavenProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Gamita on 19/05/2017.
 */
public class BrowserSelector extends BasePage {

    LoadProp loadProp = new LoadProp();
//    String browser = loadProp.getProperty("browser");


    public void selectBrowser(String browser){

        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Gamita\\IdeaProjects\\SaucelabAgileBDD\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            DesiredCapabilities chromeCapablities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions","--disable-infobars","--disable-save-password-bubble","--disable-notification");
            chromeCapablities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(options);

        }else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\Gamita\\IdeaProjects\\SaucelabAgileBDD\\src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        }else {
            System.out.println("Browser name is wrong");
        }

    }

}
