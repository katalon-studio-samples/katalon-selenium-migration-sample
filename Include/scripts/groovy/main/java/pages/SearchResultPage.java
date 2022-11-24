package main.java.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.java.helper.Browser;
import main.java.pages.shared.Page;

public class SearchResultPage extends Page {
    public SearchResultPage(Browser browser) {
        super(browser);
    }

    // List of all search results
    @FindBy(id = "search-content")
    private List<WebElement> searchResultList;

    public int getSearchResultSize() {
        return searchResultList.size();
    }
}
