package Pages;

import io.appium.java_client.android.AndroidDriver;

public class AddSongsPage {
    private static String songToAddXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageButton";

    public static void clickSongToAdd(AndroidDriver driver){
        driver.findElementByXPath(songToAddXPath).click();
    }
}
