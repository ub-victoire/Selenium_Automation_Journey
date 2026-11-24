package dev.victoire.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChomeDriver;

public class FristBrowserSession{
    public static  void main(String[] args){
        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            System.out.println("Title: " + driver.getTitle());
            System.out.println("Current URL: "+ driver.CurrentUrl());
        }finally{
            driver.quit();
        }
    }
}
