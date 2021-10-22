package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage {

    @FindBy(css = ".cart_item")
    public List<WebElement> items;


    public int getItemsCount() {
        return items.size();
    }

}
