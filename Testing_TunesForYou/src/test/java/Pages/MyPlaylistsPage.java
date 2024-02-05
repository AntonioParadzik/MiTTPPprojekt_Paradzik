package Pages;

import io.appium.java_client.android.AndroidDriver;

public class MyPlaylistsPage {
    private static String addPlaylistId = "hr.ferit.antonioparadzik.tunesforyou:id/addPlaylistButton";
    private static String customPlaylistXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup";

    public static void clickAddPlaylist(AndroidDriver driver){
        driver.findElementById(addPlaylistId).click();
    }

    public static void clickCustomPlaylist(AndroidDriver driver){
        driver.findElementByXPath(customPlaylistXPath).click();
    }
}
