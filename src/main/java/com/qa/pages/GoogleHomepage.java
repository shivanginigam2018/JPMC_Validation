package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage extends TestBase {

    @FindBy(name = "q")
    WebElement searchKey;
    @FindBy(name = "btnK")
    WebElement searchBtn;

    public WebElement getSearchKey() {
        return searchKey;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }
    WebDriver driver;
    public GoogleHomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }
}
