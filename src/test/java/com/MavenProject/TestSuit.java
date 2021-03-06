package com.MavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Gamita on 19/05/2017.
 */
public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    public void userShouldAbleToRegisterSuccessfullyAndLoginSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.registerNewUSer();
        Assert.assertEquals("Your registration completed", Utils.getTextFromElement(By.className("result")) );
        Assert.assertTrue(Utils.getTextFromElement(By.linkText("Log out")).contains("Log out"),"User is not Login Successfully");
    }
}
