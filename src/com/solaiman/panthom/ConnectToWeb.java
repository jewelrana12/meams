package com.solaiman.panthom;

import com.solaiman.java.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectToWeb {

    public static WebDriver PanthonJS() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "utility\\panthom\\bin\\phantomjs.exe"
        );
        WebDriver driver = new PhantomJSDriver(caps);
        System.out.println("PanthomJS Loaded successfully");
        return driver;
    }

    public static boolean LoadURL(WebDriver driver) {
        System.out.println("Browser maximize");
        driver.manage().window().maximize();
        System.out.println("Loading url");
        driver.get(URL.OTP);
        System.out.println("url loaded");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement aboutMe;
        System.out.println(driver.getTitle());
        System.out.println("waiting for captcha");
        aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".article_list > div:nth-child(2)")));
        System.out.println("captcha loaded");
        String fullText,finalText,otp;
        fullText = aboutMe.getText();
        String [] temp = fullText.split("following: ");
        finalText = temp[1];
        otp = finalText.substring(0,7);
        System.out.println("otp is:------------- "+otp);
        return true;
    }

    public static void main(String[] args) {
        WebDriver driver = ConnectToWeb.PanthonJS();
        boolean check = ConnectToWeb.LoadURL(driver);
        System.out.println("Done");
        
        driver.close();
    }
}
