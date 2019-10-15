package com.sahan.selenium.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explipro {
    public static void main(String[] args) throws InterruptedException {
//      System.setProperty("webdriver.chrome.driver","D:\\Z Drive\\Spring Boot Sweden\\SeleniumSampleApplication\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\cad1\\Documents\\Sahan\\SeleniumSampleApplication\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.get("http://google.com");
        Thread.sleep(1000);
        WebElement searchBox, searchBtn, workWithUsContent, whoWeAreContent, whoWeHelp, whoWeHelpContent, consultantManagers;
        searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Explipro Group AB");
        Thread.sleep(1000);
        searchBtn = driver.findElement(By.className("RNmpXc"));
        searchBtn.submit();
        Thread.sleep(1000);
        driver.findElement(By.className("LC20lb")).click();
        System.out.println("URL : " + driver.getCurrentUrl());
        System.out.println("Title of page : " + driver.getTitle());
        System.out.println("------------------------------------------------------------");

        whoWeHelp = driver.findElement(By.id("comp-irnrv6gi1label"));
        whoWeHelp.click();

        whoWeHelpContent = driver.findElement(By.id("comp-j8u4uollinlineContent"));
        System.out.println(whoWeHelpContent.getText());
        Thread.sleep(2000);
        System.out.println("------------------------------------------------------------");

        js.executeScript("window.scrollBy(0,1300)");
        Thread.sleep(1000);

        whoWeAreContent = driver.findElement(By.id("comp-jqm7e9s2inlineContent"));
        System.out.println(whoWeAreContent.getText());
        System.out.println("------------------------------------------------------------");

        js.executeScript("window.scrollBy(0,1600)");
        Thread.sleep(1000);
        workWithUsContent = driver.findElement(By.id("comp-jqm6wwq7inlineContent-gridContainer"));
        System.out.println(workWithUsContent.getText());
        System.out.println("------------------------------------------------------------");

        js.executeScript("window.scrollBy(0,4500)");
        Thread.sleep(1000);
        consultantManagers = driver.findElement(By.id("comp-jslpbxnc"));
        System.out.println(consultantManagers.getText());
        System.out.println("------------------------------------------------------------");

        consultantManagers = driver.findElement(By.id("comp-jsvve7y0"));
        System.out.println(consultantManagers.getText());
        js.executeScript("window.scrollBy(0,800)");
        System.out.println("------------------------------------------------------------");

        consultantManagers = driver.findElement(By.id("comp-jwgdwjgg"));
        System.out.println(consultantManagers.getText());
        System.out.println("------------------------------------------------------------");

        Thread.sleep(100000);
        driver.quit();
    }
}
