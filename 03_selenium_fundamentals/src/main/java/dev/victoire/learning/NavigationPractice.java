package dev.victoire.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPractice{
    public static void main(String[] arg){
        WebDriver driver = new ChromeDriver();
        try {
            // 1. Open the Selenium practice form
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            System.out.println("Practice Form Title: "+ driver.getTitle());
            System.out.println("Practice Form URL: "+ driver.getCurrentUrl());

            //2. Navigate to the Selenium homepage
            driver.navigate().to("https://www.selenium.dev/");

            System.out.println("Homepage Title: "+ driver.getTitle());
            System.out.println("Homepage URL " + driver.getCurrentUrl());

            // 3. Go back to the previous page
            driver.navigate().back();

            System.out.println("After going back: " + driver.getTitle());


            // 4. Go forward again
            driver.navigate().forward();

            System.out.println("After going forward: "+ driver.getTitle());

            //5. Refresh the current page
            driver.navigate().refresh();
        }finally{
            driver.quit();
        }
    }
}
