package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends TestBase {
    @FindBy(xpath = "//*[@id='rso']/div")
    List<WebElement> listOfItems;

    @FindBy(xpath = "//*[@id='rso']//div//h3")
    WebElement firstItem;

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstItem() {
        return firstItem;
    }

    public int getListOfItems() {
        return listOfItems.size();
    }

    public WebElement searchRandomItem() {
        int i = (int) Math.random();
        while (i == 1) {
            i = (int) Math.random();
        }
        return listOfItems.get(i);
    }
    public String getTitle() {
        return driver.getTitle();
    }
}
