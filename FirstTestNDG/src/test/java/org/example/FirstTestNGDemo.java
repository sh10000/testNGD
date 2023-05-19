package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTestNGDemo {
    public WebDriver driver;

    @Test
    public void testURL() {

        //打开搜狗首页
        driver.get("https://www.sogou.com/");

        String CurrentPageUrl;
        //获取当前页面的URL地址
        CurrentPageUrl=driver.getCurrentUrl();
        //断言当前页面的URL地址是否为""https://www.sogou.com/"
        Assert.assertEquals("https://www.sogou.com/",CurrentPageUrl);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    @Test
    public void testsearch() {

        //打开搜狗首页
        driver.get("https://www.sogou.com/");

        //在搜索框中输入“自动化测试”
        driver.findElement(By.id("query")).sendKeys("自动化测试");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        //单击搜索按钮
        driver.findElement(By.id("stb")).click();
        //调用driver的getPageSource方法获取页面的源代码
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        String pageSourse=driver.getPageSource();
        //断言页面的源代码中是否包含“图片”关键字，以此判断页面内容是否正确
        Assert.assertTrue(pageSourse.contains("图片"));
    }
    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\quan\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit(); //关闭浏览器
    }

}
