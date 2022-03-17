package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public  class BaseTest {



    protected static AndroidDriver<MobileElement> appiumDriver;

    public static boolean localAndroid = true;
    DesiredCapabilities capabilities;
    URL localUrl;

    @BeforeClass
    public void beforeScenario() throws MalformedURLException{

        System.out.println("************************************  Before Scenario  ************************************");

        localUrl = new URL("http://0.0.0.0:4723/wd/hub");
        if (localAndroid) {
            System.out.println("Local cihazda Android ortamında test ayağa kaldırılıyor.");
            appiumDriver = new AndroidDriver(localUrl, androidCapabilities(true));
            appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } else {
            System.out.println("Cihaz Android değil ");
        }
    }

    public DesiredCapabilities androidCapabilities ( boolean isLocal){
        System.out.println("Local cihaz ayarları yapılıyor.");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        capabilities.setCapability("unicodeKeyboard", false);
        capabilities.setCapability("resetKeyboard", false);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.pozitron.hepsiburada");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.hepsiburada.ui.startup.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        if (isLocal) {
            capabilities.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
        } else {
            capabilities.setCapability("key", System.getenv("key"));
        }
        System.out.println("Local cihaz ayarları tamamlandı.");
        return capabilities;
    }

    @AfterClass
    public void afterScenario () {

        if (appiumDriver != null) {
            appiumDriver.closeApp();
            appiumDriver.quit();
        }

        System.out.println("*************************************************************************" + "\r\n");
    }

}


