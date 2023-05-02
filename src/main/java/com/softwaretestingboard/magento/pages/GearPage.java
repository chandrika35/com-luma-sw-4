package com.softwaretestingboard.magento.pages;

import org.openqa.selenium.By;
import com.softwaretestingboard.magento.utilities.Utility;

public class GearPage extends Utility {
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOvernightDuffle() {
        clickOnElement(overnightDuffle);
    }
}