package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeDriver {
    public static WebDriver MSobj=null;

    public static void main(String[] args) throws Exception {
        OpenEdge();
        NavigateUrl();
        closeEdge();
    }
    private static void OpenEdge()throws Exception
    {
        MSobj=new EdgeDriver();
        Thread.sleep(5000);
        }
    private static void NavigateUrl()throws Exception
    {
        MSobj.get("https://www.youtube.com/");
        Thread.sleep(5000);
    }
    private static void closeEdge()throws Exception
    {
        MSobj.close();
        Thread.sleep(5000);
    }

    }

