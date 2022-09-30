package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends TestBase {
    @FindBy(xpath = "//ol[@id='rso']/li")
    WebElement listOfItems;

    @FindBy(xpath = "//*[@id='rso']//div//h3")
    WebElement firstItem;

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstItem() {
        return firstItem;
    }

    public WebElement getListOfItems() {
        return listOfItems;
    }

    public void searchFirstItem() {
        firstItem.click();
    }
}
