package dev.victoire.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserSession {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            System.out.println("Title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());
        } finally {
            driver.quit();
        }
    }
}
