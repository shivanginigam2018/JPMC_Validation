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

    @FindBy(xpath = "//*[@id='rso']/div/div[i]")
    WebElement randomItem;

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstItem() {
        return firstItem;
    }

    public int getListOfItems() {
        return listOfItems.size();
    }

    public void searchFirstItem() {
        firstItem.click();
    }

    public WebElement searchRandomItem() {
        int i = (int) Math.random();
        return listOfItems.get(i); }
}
