package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class GoogleSearchPage extends WebBase {

    @FindBy(xpath = "//a[@href='register.php']")
    protected WebElement btnRegistre;
    @FindBy(xpath = "//input[@name='firstName']")
    protected WebElement lblFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    protected WebElement lblLastname;

    @FindBy(xpath = "//input[@name='phone']")
    protected WebElement lblPhone;

    @FindBy(xpath = "//input[@name='userName']")
    protected WebElement lblUserName;

    @FindBy(xpath = "//input[@name='address1']")
    protected WebElement lblAddress;

    @FindBy(xpath = "//input[@name='address1']")
    protected WebElement lblCity;

    @FindBy(xpath = "//input[@name='email']")
    protected WebElement lblEmail;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElement lblPassword;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    protected WebElement lblConfirmPass;

    @FindBy(xpath = "//input[@name='submit']")
    protected WebElement btnSubmit;

    public void writeSearch() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnRegistre));
        click(btnRegistre);
    }
    public void search(String data, String data1, String data2, String data3) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblFirstName));
        type(lblFirstName, data);
        type(lblLastname, data1);
        type(lblPhone, data2);
        type(lblUserName, data3);
    }
    public void mailing(String data, String data1) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblAddress));
        type(lblAddress, data);
        type(lblCity, data1);
    }

    public void UserInfo(String data, String data1, String data2) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblEmail));
        type(lblEmail, data);
        type(lblPassword, data1);
        type(lblConfirmPass, data2);

    }
    public void submit() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        click(btnSubmit);
    }
}