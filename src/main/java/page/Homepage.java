package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declarartion
		public class Homepage {
	@FindBy (xpath="(//div [@class='prd-icon add shadowHandler short'])[1]")
	 private WebElement lifeinsurance;
	@FindBy (xpath="//div [@class='prd-icon add shadowHandler short']")
	private List <WebElement> helthinsurance;  ///                            by list of webelement
	
	@FindBy (xpath="(//div [@class='prd-icon add shadowHandler short'])[4]")
	private WebElement carinsurance;
	@FindBy (xpath="(//div [@class='prd-icon add shadowHandler short'])[6]")
	private WebElement familyinsurance;
	@FindBy (xpath="(//div [@class='prd-icon add shadowHandler short'])[7]")
	private WebElement travelinsurance;

	//initialization

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//action
	 
	public  void gotolifeinsurance() {
		lifeinsurance.click();
	}
	public void gotohelthinsurance() {
		helthinsurance.get(1).click();                                  //by get method   
	}
	public void gotocarinsurance() {
		carinsurance.click();
	}
	public void gotofamilyinsurance() {
		familyinsurance.click();
	}
}
