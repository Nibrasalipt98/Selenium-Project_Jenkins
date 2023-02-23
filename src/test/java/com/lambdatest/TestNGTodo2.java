package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodo2 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C://Users//Nibras Ali//driver//chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void basicTest() throws InterruptedException {
        System.out.println("Loading Url");

        driver.get("https://lambdatest.github.io/sample-todo-app/");
        System.out.println("Set 2");
        System.out.println("Checking Box");
        driver.findElement(By.name("li1")).click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}