package swaglabs;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("lin-btton");
    private By errorMesssage = By.xpath("#login_button_container h3");


}
