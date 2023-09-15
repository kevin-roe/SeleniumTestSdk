package org.kevinroe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Driver {
    public WebDriver webdriver;


    void hello(String name) {
        System.out.println("Hello " + name + "!");
    }

     WebDriver start() {
        webdriver = new ChromeDriver();
        return webdriver;
    }

    void quit() {
        webdriver.quit();
    }
}
