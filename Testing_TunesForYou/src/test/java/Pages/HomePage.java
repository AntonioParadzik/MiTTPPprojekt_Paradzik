package Pages;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    private static String energeticPlaylistXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]";

    public static void clickEnergeticPlaylist(AndroidDriver driver){
        driver.findElementByXPath(energeticPlaylistXPath).click();
    }


}
