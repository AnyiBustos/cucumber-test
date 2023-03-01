package com.unir.test.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class SearchSteps {

    WebDriver driver = new ChromeDriver();

    @Given("the user in the index page")
    public void theUserIsInTheIndexPage(){
        driver.get("https://automationexercise.com/");
    }

    @When("click product button")
    public void clickProductsButton(){
        driver.findElement(By.xpath("//a[@href='/products']")).click();
    }

 /*  @When("the user enters dresses in search bar")
    public void entersDressesInSearchBar(){
        driver.findElement(By.id("search_product")).sendKeys("dress");
    }

    @When("click in the search button")
    public void clickInSearchButton(){
        driver.findElement(By.id("submit_search")).click();
    }*/

    @Then("the dresses page appears")
    public void showDressesPage(){
        String title =
                driver.findElement(By.className("features_items")).findElement(By.className(
                        "title")).getText();
        //String title = driver.findElement(By.name("ALL PRODUCTS")).getText();
        //Assert.assertEquals(title, "SEARCHED PRODUCTS" );
        Assert.assertEquals(title, "ALL PRODUCTS" );

    }
}
