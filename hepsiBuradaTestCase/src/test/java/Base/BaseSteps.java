package Base;

import Constants.ElementConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;


public class BaseSteps extends BaseTest {

    public AndroidDriver<MobileElement> appiumDriver;

    public BaseSteps(AndroidDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public void waitBySecond(int seconds) {
        System.out.println(seconds +" saniye bekleme süresi ayarlandı.");
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public MobileElement findElement(By by) {
        return appiumDriver.findElement(by);
    }

    public List<MobileElement> findElements(By by) {
        return appiumDriver.findElements(by);
    }

    public void existClickByKey(By key) {
        System.out.println("İlgili element aranıyor.");
        MobileElement element;
        element = findElement(key);
        if (element != null) {
            System.out.println("Element bulundu. Tıklama işlemi yapılıyor.");
            element.click();
        }
        waitBySecond(2);
    }

    public void clickRandomElementInList (List<MobileElement> elementList) {
        System.out.println("Liste içerisinden rastgele bir element seçiliyor.");
        if (elementList.size() < 1) throw new IllegalArgumentException();
        Random rand = new Random();
        int index = rand.nextInt(elementList.size()-1);
        elementList.get(index).click();
        waitBySecond(3);
    }

    public void setValueByKey(By key, String text) { // clears
        System.out.println("Değer giriş işlemi başladı.");
        MobileElement element = findElement(key);
        System.out.println("İlgili alan temizleniyor.");
        element.clear();
        System.out.println("İlgili alana değer yazdırılıyor.");
        element.setValue(text);
    }

    public void clickBackButton () {
        System.out.println("Önceki sayfaya geri dönülüyor.");
        existClickByKey(ElementConstants.BackButtonId);
    }

    public void swipeElement(int endx,int endy,MobileElement element) {
        System.out.println("Kaydırma işlemi başlatılıyor.");
        System.out.println("Gerekli cihaz ve element lokasyon bilgisi alınıyor.");
        TouchAction touchAction = new TouchAction(appiumDriver);
        Point point = element.getLocation();
        System.out.println("Kaydırma işlemi gerçekleştiriliyor.");
        touchAction.press(point(point.x + 20, point.y + 30)).waitAction(waitOptions(ofSeconds(1))).moveTo(point(endx,endy)).release().perform();
        System.out.println("Kaydırma işlemi tamamlandı..");
    }

    public void pressElement(MobileElement element) {
        System.out.println("Dokunma işlemi başlatılıyor.");
        System.out.println("Gerekli cihaz ve element lokasyon bilgisi alınıyor.");
        Point point = element.getLocation();
        System.out.println("Dokunma işlemi gerçekleştiriliyor.");
        new TouchAction(appiumDriver)
                .press(point(point.x + 20, point.y + 30))
                .waitAction(waitOptions(ofSeconds(1)))
                .release()
                .perform();
        System.out.println("Dokunma işlemi tamamlandı.");
    }
}


