package Constants;

import org.openqa.selenium.By;

public class ElementConstants {

    public static By HomePageLocationId = By.id("com.pozitron.hepsiburada:id/textViewTitle");
    public static By CityDropDownXpath = By.xpath("//android.widget.TextView[@content-desc=\"İl seçin\"]");
    public static By DistrictDropDownXpath = By.xpath("//android.widget.TextView[@content-desc=\"İlçe seçin\"]");
    public static By StreetDropDownXpath = By.xpath("//android.widget.TextView[@content-desc=\"Mahalle seçin\"]");
    public static By DefaultCityXpath = By.xpath("//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
    public static By DefaultDistrictXpath = By.xpath("//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    public static By DefaultStreetXpath = By.xpath("//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    public static By LocationSaveButton = By.id("com.pozitron.hepsiburada:id/button");
    public static By LocationSavedPopupTextId = By.id("com.pozitron.hepsiburada:id/tvTitle");
    public static By CategoriesTabItem = By.id("com.pozitron.hepsiburada:id/nav_graph_category");
    public static By CategoriesListXpath = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView");
    public static By SubCategoriesListXpath = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
    public static By AllSuperPriceButtonId = By.id("com.pozitron.hepsiburada:id/dod_all");
    public static By SuperPriceProductMultiplePictureId = By.id("com.pozitron.hepsiburada:id/pi_product_list_item_image");
    public static By ProductDetailFavoriteButtonId = By.id("com.pozitron.hepsiburada:id/product_detail_favourites");
    public static By CategoriesFastDeliverySelectedCityTextXpath = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView");
    public static By BackButtonId = By.id("com.pozitron.hepsiburada:id/leftIcon");
    public static By ProductImagePagerId = By.id("com.pozitron.hepsiburada:id/imagePager");
    public static By ProductNameId = By.id("com.pozitron.hepsiburada:id/productName");
    public static By ProductZoomableImageId = By.id("com.pozitron.hepsiburada:id/zoomableImage");
    public static By MyListTabItem = By.id("com.pozitron.hepsiburada:id/nav_graph_my_list");
    public static By LoginUserNameTextboxXpath = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    public static By LoginUserNameButtonXpath= By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public static By LoginUserPasswordTextBoxXpath = By.xpath("//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
    public static By LoginUserPasswordButtonXpath= By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    public static By WelcomePopupTextId = By.id("android:id/message");
    public static By WelcomePopupButtonId = By.id("android:id/button1");
    public static By MyFavoritesListButtonXpath = By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
    public static By MyFavoritesListFirstProductXpath = By.xpath("(//android.view.View[@content-desc=\"123\"])[1]/android.view.View/android.view.View/android.view.View");

}