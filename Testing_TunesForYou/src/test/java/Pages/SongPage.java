package Pages;

import io.appium.java_client.android.AndroidDriver;

public class SongPage {
    private static String songToPlayXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.TextView";

    public static void playSong(AndroidDriver driver){
        driver.findElementByXPath(songToPlayXPath).click();
    }
}
