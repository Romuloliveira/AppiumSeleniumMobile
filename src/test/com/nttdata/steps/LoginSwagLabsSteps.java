package com.nttdata.steps;

import com.nttdata.screens.LoginSwagLabsScreen;

public class LoginSwagLabsSteps {

    LoginSwagLabsScreen loginSwagLabsScreen;



    public void fillUsername(String user){
        loginSwagLabsScreen.enterUsernameInput(user);
    }

    public void fillPassword(String password){
        loginSwagLabsScreen.enterPasswordInput(password);
    }

    public void clickBtn(){
        loginSwagLabsScreen.clickLoginBtn();
    }

    public String validateText(){
    return loginSwagLabsScreen.getMainPageText();
    }
}
