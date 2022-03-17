package Scenarios;

import Base.BaseSteps;
import Constants.ElementConstants;
import Constants.TextConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class FastDeliveryLocationScenario extends BaseSteps {


    String selectedCityName = "";

    public FastDeliveryLocationScenario(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }


    public FastDeliveryLocationScenario saveCity() {
        System.out.println("Seçilen şehir kaydediliyor.");
        this.selectedCityName = findElement(ElementConstants.CityDropDownXpath).getText();
        System.out.println("Seçilen şehir kaydedildi.");
        return this;
    }

    public FastDeliveryLocationScenario compareCityText() {
        System.out.println("Kaydedilen şehir ile gözüken şehir karşılaştırması yapılıyor.");
        MobileElement element = findElement(ElementConstants.CategoriesFastDeliverySelectedCityTextXpath);
        if (element.isDisplayed()) {
            Assert.assertEquals(this.selectedCityName,element.getText());
        }else {
            Assert.fail();
        }
        return  this;
    }

    public FastDeliveryLocationScenario clickHomepageLocation() {
        System.out.println("Anasayfada konum alanına tıklanıyor.");
        existClickByKey(ElementConstants.HomePageLocationId);
        return this;
    }
    //Click Funcs
    public FastDeliveryLocationScenario clickCity() {
        System.out.println("İl listesi açılıyor");
        existClickByKey(ElementConstants.CityDropDownXpath);
        return  this;
    }

    public FastDeliveryLocationScenario clickDistrict() {
        System.out.println("İlçe listesi açılıyor");
        existClickByKey(ElementConstants.DistrictDropDownXpath);
        return  this;
    }

    public FastDeliveryLocationScenario clickStreet() {
        System.out.println("Mahalle listesi açılıyor");
        existClickByKey(ElementConstants.StreetDropDownXpath);
        return  this;
    }

    public  FastDeliveryLocationScenario clickSave() {
        System.out.println("Kaydet butonuna basılıyor.");
        existClickByKey(ElementConstants.LocationSaveButton);
        return  this;
    }

    public FastDeliveryLocationScenario selectCity() {
        waitBySecond(2);
        System.out.println("Varsayılan il seçiliyor.");
        existClickByKey(ElementConstants.DefaultCityXpath);
        return  this;
    }

    public FastDeliveryLocationScenario selectDistrict() {
        waitBySecond(2);
        System.out.println("Varsayılan ilçe seçiliyor.");
        existClickByKey(ElementConstants.DefaultDistrictXpath);
        return  this;
    }

    public FastDeliveryLocationScenario selectStreet() {
        waitBySecond(2);
        System.out.println("Varsayılan mahalle seçiliyor.");
        existClickByKey(ElementConstants.DefaultStreetXpath);
        return  this;
    }

    public  FastDeliveryLocationScenario selectRandomCategory() {
        waitBySecond(2);
        System.out.println("Rastgele ana kategori seçimi yapılıyor.");
        clickRandomElementInList(findElements(ElementConstants.CategoriesListXpath));
        return this;
    }

    public  FastDeliveryLocationScenario selectRandomSubCategory() {
        waitBySecond(2);
        System.out.println("Rastgele alt kategori seçimi yapılıyor.");
        clickRandomElementInList(findElements(ElementConstants.SubCategoriesListXpath));
        return this;
    }

    public FastDeliveryLocationScenario savedPopupIsExists() {
        System.out.println("-Konum Kaydedildi- Popup'ı kontrol ediliyor.");
        Assert.assertEquals(TextConstants.LocationSavedPopupText,findElement(ElementConstants.LocationSavedPopupTextId).getText());
        System.out.println("-Konum Kaydedildi- Popup'ı kontrolü başarıyla tamamlandı.");
        return this;
    }

    public FastDeliveryLocationScenario clickCategories() {
        System.out.println("Ana kategori seçiliyor");
        existClickByKey(ElementConstants.CategoriesTabItem);
        waitBySecond(2);
        return  this;
    }
}
