package stepDefinition;

import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import runnerTest.webPages.HomePage;

public class HomePageSD {
      private HomePage homePage = new HomePage();

      @Given("^I am on DarkSky home page$")

   public void IamOnHomePage(){
         Assert.assertEquals(BasePage.get().getCurrentUrl(), "https://darksky.net/forecast/40.7127,-74.0059/us12/en");
      }
      @When("^I click on navigation button on home page screen$")
    public void clickNavButton() throws InterruptedException {
          homePage.clickNavigationButton();
      }
      @And("^I click on today temperature button$")
    public void clickTodayButton(){
          homePage.clickElementByJS();
      }
      @Then("^Verify min and max temperature$")
    public void verifyMaxAndMin() throws InterruptedException {
          homePage.verifyTemp();
      }
}
