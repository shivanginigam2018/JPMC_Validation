package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPMorganHomePage extends TestBase {

   @FindBy(xpath = "//img[@class = 'first-logo']")
   WebElement logo;

    public JPMorganHomePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean logoDisplayed() {
        Boolean flag;
        try {
            flag = (Boolean) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].complete "
                            + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                            + "&& arguments[0].naturalWidth > 0", logo);
        }
        catch(NoSuchElementException e) {
            flag = false;
        }
       return flag;
    }
}
