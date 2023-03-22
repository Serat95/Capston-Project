package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailPage extends BaseSetup {
	public RetailPage() {
		 PageFactory.initElements(getDriver(), this);
	}
 
 @FindBy(xpath ="//*[@id='orderLink']")
	public WebElement orderSection;
 
 @FindBy(xpath ="//*[@id='orderLink']")
	public WebElement firstOrder;
 
 @FindBy(xpath ="//*[@id=\"cancelBtn\"]")
	public WebElement cancelOrder;
 
 @FindBy(xpath ="//*[@id=\"reasonInput\"]")
	public WebElement CancelReason;
 
 @FindBy(xpath ="//*[@id=\"orderSubmitBtn\"]")
	public WebElement canelOrderBtn;
 @FindBy(xpath= "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/p")
 public WebElement YourOrderHasBeenCancelled;
 
 @FindBy(xpath ="//*[@id=\"returnBtn\"]")
	public WebElement returnItem;

 
 @FindBy(xpath ="//*[@id=\"reasonInput\"]")
	public WebElement returnReason;
 
 @FindBy(xpath ="//*[@id=\"dropOffInput\"]")
	public WebElement dropOffService;
 
  @FindBy(xpath ="//*[@id=\"orderSubmitBtn\"]") 
  public WebElement returnOrder;
 
 @FindBy(xpath ="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div/p")
 public WebElement cancelationMessageShouldBeDisplayed ;
 
 
    @FindBy(xpath ="//*[@id=\"reviewBtn\"]")
	public WebElement reviewBtn ;
    
 @FindBy(xpath ="//*[@id=\"headlineInput\"]")
	public WebElement addHeadlin ;
 @FindBy(xpath ="//*[@id=\"descriptionInput\"]") 
	public WebElement addWritten ;
 
 @FindBy(xpath ="//*[@id=\"reviewSubmitBtn\"]")
 public WebElement addYourReview;
 
 @FindBy(xpath ="//div[contains(text(),'Your review was added successfully')]")
 public WebElement yourReviewWassAddedSuccessfully ;

 
 
 
}



