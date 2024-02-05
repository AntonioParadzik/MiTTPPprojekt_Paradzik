package Pages;

import io.appium.java_client.android.AndroidDriver;

public class PlaylistPage {
    private static String firstSongXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";

    public static void clickFirstSong(AndroidDriver driver){
        driver.findElementByXPath(firstSongXPath).click();
    }
}
