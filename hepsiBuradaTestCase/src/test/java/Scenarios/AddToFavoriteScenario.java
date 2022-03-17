package Scenarios;

import Base.BaseSteps;
import Constants.ElementConstants;
import Constants.TextConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class AddToFavoriteScenario extends BaseSteps {

    String selectedProductName = "";

    public AddToFavoriteScenario(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public AddToFavoriteScenario clickAllSuperPriceButton() {
        System.out.println("Süper Fiyat, Süper Teklif ürünlerinin tümü görüntüleniyor.");
        existClickByKey(ElementConstants.AllSuperPriceButtonId);
        return  this;
    }

    public AddToFavoriteScenario findHasMultiplePhotoForProduct() {
        System.out.println("Çoklu fotoğrafı olan ürün aranıyor.");
        MobileElement element = findElement(ElementConstants.SuperPriceProductMultiplePictureId);
        if(element.isDisplayed()){
            System.out.println("Ürün bulundu. Ürün detay ekranı açılıyor.");
             pressElement(element);
        } else {
            System.out.println("Ürün bulunamadı. Yukarı kaydırılıyor.");
            swipeElement(10,100,element);
            findHasMultiplePhotoForProduct();
        }
        return  this;
    }

    public AddToFavoriteScenario saveProduct() {
        System.out.println("Seçilen ürün ismi kaydediliyor.");
        this.selectedProductName = findElement(ElementConstants.ProductNameId).getText();
        System.out.println("Seçilen ürün ismi kaydedildi. Ürün adı: " + this.selectedProductName);
        return this;
    }

    public AddToFavoriteScenario photoSwipeLeft () {
        System.out.println("Ürün fotoğrafları sola doğru kaydırılıyor.");
        swipeElement(-500,100,findElement(ElementConstants.ProductZoomableImageId));
        return  this;
    }

    public AddToFavoriteScenario clickPhoto() {
        System.out.println("Ürün fotoğrafları açılıyor.");
        existClickByKey(ElementConstants.ProductImagePagerId);
        return  this;
    }

    public AddToFavoriteScenario closePhotoDetail() {
        System.out.println("Ürün fotoğrafları kapatılıyor.");
        existClickByKey(ElementConstants.BackButtonId);
        return  this;
    }


    public AddToFavoriteScenario clickAddToFavorite() {
        System.out.println("Ürün favorilere ekleniyor.");
        existClickByKey(ElementConstants.ProductDetailFavoriteButtonId);
        return  this;
    }

    public AddToFavoriteScenario backToProductListScreen() {
        clickBackButton();
        return  this;
    }

    //Login
    public AddToFavoriteScenario fillEmailAndGo() {
        waitBySecond(5);
        System.out.println("E-mail giriliyor.");
        existClickByKey(ElementConstants.LoginUserNameTextboxXpath);
        setValueByKey(ElementConstants.LoginUserNameTextboxXpath,TextConstants.TestUserId);
        System.out.println("Giriş yap butonu seçiliyor.");
        existClickByKey(ElementConstants.LoginUserNameButtonXpath);
        return  this;
    }
    public AddToFavoriteScenario fillPasswordAndGo() {
        waitBySecond(5);
        System.out.println("Şifre giriliyor.");
        existClickByKey(ElementConstants.LoginUserPasswordTextBoxXpath);
        setValueByKey(ElementConstants.LoginUserPasswordTextBoxXpath,TextConstants.TestUserPassword);
        System.out.println("Giriş yap butonu seçiliyor.");
        existClickByKey(ElementConstants.LoginUserPasswordButtonXpath);
        return  this;
    }

    public AddToFavoriteScenario checkLogin() {
        System.out.println("Login doğruluğu kontrol ediliyor.");
        waitBySecond(3);
        Assert.assertEquals(true,findElement(ElementConstants.WelcomePopupTextId).getText().contains(TextConstants.WelcomePopupText));
        return this;
    }

    public  AddToFavoriteScenario complateLogin() {
        System.out.println("Login başarıyla tamamlandı. Popup kapatılıyor.");
        existClickByKey(ElementConstants.WelcomePopupButtonId);
        return  this;
    }
    //MyLists
    public AddToFavoriteScenario openMyLists() {
        System.out.println("Listelerim açılıyor.");
        existClickByKey(ElementConstants.MyListTabItem);
        return  this;
    }

    public AddToFavoriteScenario goFavotires() {
        waitBySecond(5);
        System.out.println("Beğenilerim listesine gidiliyor.");
        existClickByKey(ElementConstants.MyFavoritesListButtonXpath);
        return this;
    }

    public AddToFavoriteScenario clickFirstFavoritedProduct() {
        System.out.println("Beğenilen ürün listesinde ilk eleman seçiliyor.");
        existClickByKey(ElementConstants.MyFavoritesListFirstProductXpath);
        return  this;
    }

    public AddToFavoriteScenario compareFavoritedProduct() {
        System.out.println("Kaydedilen ürün ile gözüken ürün karşılaştırması yapılıyor.");
        Assert.assertEquals(this.selectedProductName,findElement(ElementConstants.ProductNameId).getText());
        return  this;
    }
}
