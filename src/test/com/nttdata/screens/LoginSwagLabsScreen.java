package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginSwagLabsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement Username;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement Password;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement LoginBtn;

    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement MainPageText;

    public void enterUsernameInput(String user){
        Username.sendKeys(user);
    }
    public void enterPasswordInput(String password){
        Password.sendKeys(password);
    }
    public void clickLoginBtn(){
        LoginBtn.click();
    }
    public String getMainPageText(){
        return MainPageText.getText();
    }

}
