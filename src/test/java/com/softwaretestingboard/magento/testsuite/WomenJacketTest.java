package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.junit.Assert;
import org.junit.Test;


public class WomenJacketTest extends BaseTest {
   HomePage homepage = new HomePage();
   WomenJacketsPage womenjacketspage = new WomenJacketsPage();



    @Test
    public void verifyTheSortByProductNameFilter(){
    homepage.mouseHoverOnWomenMenu();
    homepage.mouseHoverOnTops();
    homepage.clickOnJackets();
    womenjacketspage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womenjacketspage.getProductList1(),womenjacketspage.getProductList2());
    }

@Test
public void verifyTheSortByPriceFilter() throws InterruptedException {
    homepage.mouseHoverOnWomenMenu();
    homepage.mouseHoverOnTops();
    homepage.clickOnJackets();
    womenjacketspage.selectProductNameFilter("Price");
    Assert.assertEquals(womenjacketspage.getPriceList1(),womenjacketspage.getPriceList2());
}

}