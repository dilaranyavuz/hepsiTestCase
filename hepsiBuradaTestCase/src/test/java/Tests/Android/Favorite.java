package Tests.Android;

import Base.BaseTest;
import Scenarios.AddToFavoriteScenario;
import org.testng.annotations.Test;

public class Favorite extends BaseTest {

    @Test
    public void addToFavoriteFromSuperPriceProductDetail()  {
        AddToFavoriteScenario scenario = new AddToFavoriteScenario(appiumDriver);
        System.out.println("Süper Fiyat, Süper Teklif alanından ürün detaya gidilerek favorilenen ürünün, favori listesinde görünülürlüğü testi başlıyor. ");
        scenario.
                clickAllSuperPriceButton().
                findHasMultiplePhotoForProduct().
                saveProduct().
                clickPhoto().
                photoSwipeLeft().
                closePhotoDetail().
                clickAddToFavorite().
                fillEmailAndGo().
                fillPasswordAndGo().
                checkLogin().
                complateLogin().
                backToProductListScreen().
                openMyLists().
                goFavotires().
                clickFirstFavoritedProduct().
                compareFavoritedProduct();
    }
}
