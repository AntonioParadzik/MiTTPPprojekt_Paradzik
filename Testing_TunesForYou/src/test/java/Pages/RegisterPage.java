package Pages;

import io.appium.java_client.android.AndroidDriver;

public class RegisterPage {

    private static String editEmailRegisterId = "hr.ferit.antonioparadzik.tunesforyou:id/editEmailRegister";
    private static String editPasswordRegisterId = "hr.ferit.antonioparadzik.tunesforyou:id/editPasswordRegister";
    private static String registerButtonId = "hr.ferit.antonioparadzik.tunesforyou:id/registerButton";

    public static void addEmailText(AndroidDriver driver){
        driver.findElementById(editEmailRegisterId).click();
        driver.findElementById(editEmailRegisterId).sendKeys("123456@gmail.com");
    }

    public static void addPasswordText(AndroidDriver driver){
        driver.findElementById(editPasswordRegisterId).click();
        driver.findElementById(editPasswordRegisterId).sendKeys("123456");
    }

    public static void clickToRegister(AndroidDriver driver){
        driver.findElementById(registerButtonId).click();
    }

}
