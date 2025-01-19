package com.example.ontapktnc2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phan3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://vitimex.com.vn/");
        driver.manage().window().maximize();
        Thread.sleep(5000);


        WebElement btnClick = driver.findElement(By.cssSelector("#myPage > header > div.container-header > div > div.menu-search-icon > div.icon > div.li_log > a > svg"));
        btnClick.click();
        System.out.println("oke");
        Thread.sleep(1000);

        WebElement btnClickdn = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div[3]/a[1]"));
        btnClickdn.click();
        Thread.sleep(5000);
        System.out.println("okev");


        WebElement hoTen = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        hoTen.sendKeys("Trần Trung Phong");
        Thread.sleep(1000);
        System.out.println("oke1");


        WebElement soDienThoai = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        soDienThoai.sendKeys("0352485138");
        Thread.sleep(1000);
        System.out.println("oke1");

        WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Email.sendKeys("phong11@gmail.com");
        Thread.sleep(1000);
        System.out.println("oke1");

        WebElement matKhau = driver.findElement(By.xpath("//*[@id=\"pass-regis\"]"));
        matKhau.sendKeys("phong99xz");
        Thread.sleep(1000);
        System.out.println("oke1");

        WebElement nhapLaiMatKhau = driver.findElement(By.xpath("//*[@id=\"pass-confirm\"]"));
        nhapLaiMatKhau.sendKeys("phong99xz");
        Thread.sleep(1000);
        System.out.println("oke1");


        WebElement btnClickDK = driver.findElement(By.xpath("//*[@id=\"register-btn\"]"));
        btnClickDK.click();
        Thread.sleep(5000);

    }
}
