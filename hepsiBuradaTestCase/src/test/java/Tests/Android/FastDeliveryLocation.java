package Tests.Android;

import Base.BaseTest;
import Scenarios.FastDeliveryLocationScenario;

import org.testng.annotations.Test;


public class FastDeliveryLocation extends BaseTest {

    @Test
    public void saveAndCheckLocation()  {
        FastDeliveryLocationScenario scenario = new FastDeliveryLocationScenario(appiumDriver);
        System.out.println("Anasayfada kaydedilen şehirin, ürün listeleme sayfasında görünürlüğü testi başlıyor.");
        scenario.
                clickHomepageLocation().
                clickCity().
                selectCity().
                clickDistrict().
                selectDistrict().
                clickStreet().
                selectStreet().
                saveCity().
                clickSave().
                savedPopupIsExists().
                clickCategories().
                selectRandomCategory().
                selectRandomSubCategory().
                compareCityText();
    }
}
