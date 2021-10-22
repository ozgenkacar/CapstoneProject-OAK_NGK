package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ProductsPage;
import utils.Driver;
import utils.HELPER;

import java.util.List;

public class ProductsPage_StepDefinitions {

    ProductsPage productsPage = new ProductsPage();

    @When("I add an {int} item to cart")
    public void iAddAnItemToCart(int index) {
        List<WebElement> addToCartButtons = Driver.get().findElements(By.xpath("//button[contains(text(),'ADD TO CART')]"));
        addToCartButtons.get(index-1).click();
    }

    @When("I remove the item from cart")
    public void iRemoveTheItemFromCart() {
        productsPage.removeProductFromCart(1);
    }

    @Then("cart badge count disappears")
    public void cartBadgeCountDisappears() {
        Assert.assertFalse(productsPage.isCartBadgePresent());
    }

    @Then("cart badge count is {string}")
    public void cartBadgeCountIs(String count) {
        Assert.assertEquals(productsPage.getCartBadgeCount(), count);
    }

    @Then("user verify that {int} items at the inventory")
    public void userVerifyThatItemsAtTheInventory(int num){
        HELPER.wait(5);
        List<WebElement> productList = Driver.get().findElements(By.xpath("//*[@class='inventory_item_name']"));

        System.out.println("Number of product is : "+ productList.size());

         Assert.assertEquals(productList.size(),num);

        }


    @Then("user get list of all items at the inventory")
    public void userGetListOfAllItemsAtTheInventory() {
        List<WebElement> productList = Driver.get().findElements(By.xpath("//*[@class='inventory_item_name']"));

        System.out.println("Number of product is : "+ productList.size());

        for (WebElement webElement : productList) {
            String name = webElement.getText();
            System.out.println(name);
        }
    }


}

