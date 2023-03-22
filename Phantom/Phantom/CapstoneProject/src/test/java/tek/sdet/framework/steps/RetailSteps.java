package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");
	}
	
	@And("User search for {string} item")
	public void userSearchForItem(String value) {
		sendText(factory.homePage().searchBarInput,value);
		click(factory.homePage().searchButton);
		logger.info("User searched for " + value+ " item");
		
	}
	@And("Product should be displayed")
	public void productShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
		logger.info("Product is displayed");
		
		
	}
	
	@And("User click on Orders section")
	public void user_click_on_orders_section() {
	click(factory.retailPage().orderSection);
	logger.info("User clicked on Order Section");
		
	}

	@And("User click on first order in list")
	public void user_click_on_first_order_in_list() {
		click(factory.retailPage().firstOrder);
		logger.info("User clicked on first Order");
	}

	@And("User click on Cancel The Order button")
	public void user_click_on_cancel_the_order_button() {
		click(factory.retailPage().cancelOrder);
		logger.info("User clicked on cancel Section");
	}

	@And("User select the cancelation Reason ‘Bought wrong item’")
	public void user_select_the_cancelation_reason_bought_wrong_item() throws InterruptedException {
		click(factory.retailPage().CancelReason);
		Select selectBox = new Select((WebElement)factory.retailPage().CancelReason);
		selectBox.selectByVisibleText("Bought wrong item");
		logger.info("user selected the cancellation reason");
		Thread.sleep(3000);
	}
	@And("User click on Cancel Order button")
	public void user_click_on_cancel_order_button() throws InterruptedException {
		click(factory.retailPage().canelOrderBtn);
		logger.info("User clicked on cancel order button");
		Thread.sleep(3000);

	}
 
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void a_cancelation_message_should_be_displayed_your_order_has_been_cancelled() {
		waitTillPresence(factory.retailPage().YourOrderHasBeenCancelled);
		Assert.assertTrue(isElementDisplayed(factory.retailPage().YourOrderHasBeenCancelled));	
		logger.info("order cancelled");
	}
	
	
	
	
	//Next scenario 

	@When("User click on Return Items button")
	public void user_click_on_return_items_button() {
		click(factory.retailPage().returnItem);
		logger.info("User clicked on return item button");
	}

	@When("User select the Return Reason ‘Item damaged’")
	public void user_select_the_return_reason_item_damaged() throws InterruptedException {
		click(factory.retailPage().returnReason);
		Select selectBox = new Select((WebElement)factory.retailPage().returnReason);
		selectBox.selectByVisibleText("Item damaged");
		logger.info("user selected the return reason");
		Thread.sleep(3000);
		
		
	}

	@When("User select the drop off service ‘FedEx’")
	public void user_select_the_drop_off_service_fed_ex() throws InterruptedException {
		click(factory.retailPage().dropOffService);
		Select selectBox = new Select((WebElement)factory.retailPage().dropOffService);
		selectBox.selectByVisibleText("FedEx");
		logger.info("user selected the drop Off Service");
		Thread.sleep(3000);
	}

	@When("User click on Return Order button")
	public void user_click_on_return_order_button() {
		click(factory.retailPage().returnOrder);
		logger.info("User clicked on return order button");
	}

	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void a_cancelation_message_should_be_displayed_return_was_successful() {
		waitTillPresence(factory.retailPage().cancelationMessageShouldBeDisplayed);
		Assert.assertTrue(isElementDisplayed(factory.retailPage().cancelationMessageShouldBeDisplayed));	
		logger.info("order cancelled");
	}
	
	
	//Next scenario

	@When("User click on Review button")
	public void user_click_on_review_button() throws InterruptedException {
	     click(factory.retailPage().reviewBtn);
		 logger.info("User clicked on review button");
		 Thread.sleep(3000);

	}

	@When("User write add a headline {string} and add  a written {string}")
	public void userWriteAddAHeadlineAndAddAWritten(String string, String string2) throws InterruptedException {
     sendText(factory.retailPage().addHeadlin, string);
     Thread.sleep(3000);
     sendText(factory.retailPage().addWritten, string2);
     logger.info("User clicked added headline value and review text");
		  
	}

	@And("User click Add your Review button")
	public void user_click_add_your_review_button() throws InterruptedException {
		  click(factory.retailPage().addYourReview);
			 logger.info("User clicked on add review button");
			 Thread.sleep(5000);
	}

	@Then("a review message should be displayed ‘Your review was added successfully")
	public void a_review_message_should_be_displayed_your_review_was_added_successfully() {
		waitTillPresence(factory.retailPage().yourReviewWassAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.retailPage().yourReviewWassAddedSuccessfully));
 			 logger.info("your review as added is displayed");
	
	}
	
	
	
}

