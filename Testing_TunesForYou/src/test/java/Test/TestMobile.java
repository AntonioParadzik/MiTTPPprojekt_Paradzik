package Test;

import Pages.*;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestMobile {
    AndroidDriver driver;
    @BeforeClass()
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\Antonio\\AndroidStudioProjects\\TunesForYou\\app\\build\\outputs\\apk\\debug\\TunesForYou.apk");
        capabilities.setCapability("VERSION", "1.0");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test(priority = 1)
    public void registerUser() throws Exception{
        LoginPage.goToRegisterPage(driver);
        RegisterPage.addEmailText(driver);
        driver.hideKeyboard();
        RegisterPage.addPasswordText(driver);
        driver.hideKeyboard();
        RegisterPage.clickToRegister(driver);
        Assert.assertTrue(driver.findElementById("hr.ferit.antonioparadzik.tunesforyou:id/loginText").isDisplayed(), "Test is unsuccessful");
    }

    @Test(dependsOnMethods = "registerUser")
    public void loginUser() throws Exception{
        LoginPage.addEmailText(driver);
        driver.hideKeyboard();
        LoginPage.addPasswordText(driver);
        driver.hideKeyboard();
        LoginPage.clickToLogin(driver);
        Assert.assertTrue(driver.findElementById("hr.ferit.antonioparadzik.tunesforyou:id/welcomeText").isDisplayed(), "Test is unsuccessful");
    }

    @Test(dependsOnMethods = "loginUser")
    public void playSongFromPlaylist() throws Exception{
        HomePage.clickEnergeticPlaylist(driver);
        PlaylistPage.clickFirstSong(driver);
        SongPage.playSong(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")));

        Assert.assertTrue(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.SeekBar").isDisplayed(), "Test is unsuccessful");
        Thread.sleep(2000);

    }

    @Test(dependsOnMethods = "playSongFromPlaylist")
    public void createCustomPlaylist()throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Playlists")));
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("My Playlists");
        el2.click();
        MyPlaylistsPage.clickAddPlaylist(driver);
        AddPlaylistPage.enterPlaylistName(driver);
        driver.hideKeyboard();
        AddPlaylistPage.clickCreatePlaylist(driver);
        Assert.assertEquals(driver.findElementById("hr.ferit.antonioparadzik.tunesforyou:id/myPlaylistNameText").getText(), AddPlaylistPage.playlist_name);

    }

    @Test(dependsOnMethods = "createCustomPlaylist")
    public void addSongToCustomPlaylist()throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Playlists")));
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("My Playlists");
        el2.click();
        MyPlaylistsPage.clickCustomPlaylist(driver);
        CustomPlaylistPage.clickAddSongs(driver);
        AddSongsPage.clickSongToAdd(driver);
        driver.navigate().back();
        Assert.assertTrue(driver.findElementById("hr.ferit.antonioparadzik.tunesforyou:id/mySongNameText").isDisplayed(), "Test is unsuccessful");


    }

    @AfterClass
    public void teardown() throws Exception{
        driver.quit();
    }
}
