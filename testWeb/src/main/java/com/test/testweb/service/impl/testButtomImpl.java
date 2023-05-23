package com.test.testweb.service.impl;

import com.test.testweb.service.testButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testButtomImpl implements testButton {
    public WebDriver driver;
    @Override
    public void reach(String web){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\quan\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(web);
    }


}
