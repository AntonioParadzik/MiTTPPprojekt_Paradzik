package Pages;

import io.appium.java_client.android.AndroidDriver;

public class CustomPlaylistPage {
    private static String addSongsId = "hr.ferit.antonioparadzik.tunesforyou:id/addSongsButton";

    public static void clickAddSongs(AndroidDriver driver){
        driver.findElementById(addSongsId).click();
    }
}
