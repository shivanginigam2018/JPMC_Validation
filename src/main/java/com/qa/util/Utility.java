package com.qa.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility extends TestBase {

    public void takeScreenshot(String filePath) throws IOException {
        TakesScreenshot srcShot = ((TakesScreenshot) TestBase.driver);
        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        FileUtils.copyFile(srcFile,destFile);
    }

}
