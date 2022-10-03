package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public Properties init_prop() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
            prop.load(fis);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

    public WebDriver init_driver(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/config/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "..");
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Please pass correct browser value");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
