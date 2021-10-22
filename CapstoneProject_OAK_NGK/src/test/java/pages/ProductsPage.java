package pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.HELPER;

import java.util.List;

public class ProductsPage {

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    public List<WebElement> productsList;

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    public List<WebElement> addToCartButton;

    @FindBy(xpath = "//button[contains(text(),'REMOVE')]")
    public List<WebElement> removeButton;

    @FindBy(css = ".shopping_cart_badge")
    public WebElement cartBadge;

    @FindBy(css = ".shopping_cart_link")
    public WebElement cartLink;

    public int getNumberOfProduct(){
        return HELPER.getListOfString(productsList).size();
    }
    public void clickCartLink(){
        cartLink.click();
    }


    public boolean isCartBadgePresent() {
        try {
            cartBadge.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getCartBadgeCount() {
        return cartBadge.getText();
    }

    public void addProductToCart(int index) {
        addToCartButton.get(index - 1).click();
    }

    public void removeProductFromCart(int index) {
        removeButton.get(index - 1).click();
    }





}
