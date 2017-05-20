package com.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Gamita on 19/05/2017.
 */
public class HomePage extends Utils {

    public void clickOnRegisterButton() {

        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        Assert.assertEquals("Register", getTextFromElement(By.xpath("//div[@class='page-title']/h1")));

    }
}