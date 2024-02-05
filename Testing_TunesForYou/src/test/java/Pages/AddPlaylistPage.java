package Pages;

import io.appium.java_client.android.AndroidDriver;

public class AddPlaylistPage {
    private static String editPlaylistNameId = "hr.ferit.antonioparadzik.tunesforyou:id/enteredPlaylistName";
    private static String createPlaylistId = "hr.ferit.antonioparadzik.tunesforyou:id/createText";
    public static String playlist_name = "my playlist";

    public static void enterPlaylistName(AndroidDriver driver){
        driver.findElementById(editPlaylistNameId).click();
        driver.findElementById(editPlaylistNameId).sendKeys(playlist_name);
    }
    public static void clickCreatePlaylist(AndroidDriver driver){
        driver.findElementById(createPlaylistId).click();
    }

}
