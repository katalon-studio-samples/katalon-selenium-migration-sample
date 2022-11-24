package main.java.pages.shared;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.java.helper.Browser;


public class HeaderSection extends Element {

    public HeaderSection(Browser browser) {
        super(browser);
    }

    @FindBy(id = "orbit-search-button")
    private WebElement searchFieldClick;

    @FindBy(id = "search-input")
    private WebElement searchInput;

    @FindBy(xpath = ".//*[@type='submit']/span")
    private WebElement searchSubmitButton;

    public void setSearchField(String value) {
    	searchFieldClick.click();
    	searchInput.sendKeys(value);
    }

    public void clickOnSearchButton() {
        // this element only appears when something is input into search field.
        searchSubmitButton.click();
    }
    

}
