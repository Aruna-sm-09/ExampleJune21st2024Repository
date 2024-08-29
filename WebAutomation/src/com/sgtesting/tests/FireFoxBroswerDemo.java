package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBroswerDemo {
    public static WebDriver obj=null;

    public static void main(String[] args) throws Exception {

        openFireFox();
        navigateURL();
        closeFirefox();
    }
    private static void openFireFox()throws Exception
    {
        obj=new FirefoxDriver();
        Thread.sleep(5000);
    }
    private static void navigateURL()throws Exception
    {
        obj.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=5926462671200906140&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
        Thread.sleep(5000);
    }
    private static void closeFirefox()throws Exception
    {
        obj.close();

    }
}
