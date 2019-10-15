package com.sahan.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Election {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cad1\\Documents\\Sahan\\SeleniumSampleApplication\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.get("http://votesl.com/");
        WebElement voteBtn, nicBox, anuraKumara;
        voteBtn = driver.findElement(By.id("btn"));
        voteBtn.click();
        Thread.sleep(1000);
        nicBox = driver.findElement(By.id("id"));
        nicBox.sendKeys("763345977V");
        nicBox.submit();
        Thread.sleep(1000);
        anuraKumara = driver.findElement(By.id("Btn3"));
        anuraKumara.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
