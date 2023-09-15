package org.kevinroe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver webdriver;


    public void hello(String name) {
        System.out.println("Hello " + name + "!");
    }

    public WebDriver start() {
        webdriver = new ChromeDriver();
        return webdriver;
    }

    public void quit() {
        webdriver.quit();
    }
}
