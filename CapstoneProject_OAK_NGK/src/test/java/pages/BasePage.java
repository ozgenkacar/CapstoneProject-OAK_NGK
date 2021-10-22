package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BasePage {
    public BasePage(){

            PageFactory.initElements(Driver.get(), this);
        }

    @FindBy(css = "[class='user_name ng-star-inserted']")
    public WebElement displayUserName;

    @FindBy(css = "[class='user_role']")
    public WebElement userRoleButton;

    @FindBy(css = "#cdk-overlay-0 > div > div > button")
    public WebElement logOutButton;


        public String getPageTitle(){
             return Driver.get().getTitle();
        }

        public String getDisplayUserName(){
        return displayUserName.getText();
        }

        public String getUserRole(){
            return userRoleButton.getText();
        }

        public void clickUserRoleButton(){
            userRoleButton.click();
        }

        public void clickLogOutButton(){
            logOutButton.click();
        }
}
