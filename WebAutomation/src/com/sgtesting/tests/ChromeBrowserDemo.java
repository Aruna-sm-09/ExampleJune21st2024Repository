package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    public static WebDriver oBrowser=null;

    public static void main(String[] args) throws Exception {

        launchBrowser();
        navigateURL();
        closeBrowser();

    }
    private static void launchBrowser()throws Exception
    {
        oBrowser=new ChromeDriver();
        Thread.sleep(5000);
    }

    private static void navigateURL()throws Exception
    {
        oBrowser.get("http://localhost:81/login.do");
        Thread.sleep(6000);
    }
    private static void closeBrowser()throws Exception
    {
        oBrowser.close();
        Thread.sleep(8000);
    }
}
