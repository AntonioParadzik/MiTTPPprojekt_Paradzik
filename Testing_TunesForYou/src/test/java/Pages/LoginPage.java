package Pages;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

    private static String editEmailLoginId = "hr.ferit.antonioparadzik.tunesforyou:id/editEmailLogin";
    private static String editPasswordLoginId = "hr.ferit.antonioparadzik.tunesforyou:id/editPasswordLogin";
    private static String loginButtonId = "hr.ferit.antonioparadzik.tunesforyou:id/loginButton";
    private static String registerTextId = "hr.ferit.antonioparadzik.tunesforyou:id/registerHereText";

    public static void addEmailText(AndroidDriver driver){
        driver.findElementById(editEmailLoginId).click();
        driver.findElementById(editEmailLoginId).sendKeys("123456@gmail.com");
    }

    public static void addPasswordText(AndroidDriver driver){
        driver.findElementById(editPasswordLoginId).click();
        driver.findElementById(editPasswordLoginId).sendKeys("123456");
    }

    public static void clickToLogin(AndroidDriver driver){
        driver.findElementById(loginButtonId).click();
    }

    public static void goToRegisterPage(AndroidDriver driver){
        driver.findElementById(registerTextId).click();
    }

}
