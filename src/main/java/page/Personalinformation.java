package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Personalinformation {
  @ FindBy (xpath="(// i [@ class='radio'])[1]")
   private WebElement male;
  @FindBy (xpath="(// i [@ class='radio'])[1]")
  private WebElement female;
  
  @FindBy (xpath="//input[@id='nameAdd']")
  private WebElement yourname;
  
  @ FindBy (xpath="//input[@id='dob']")
   private WebElement datebofbirth;
  
  @FindBy (xpath="//input[@id='mobileNo']")
  private WebElement mobileno;
  @FindBy (xpath="//span[text()='View Free Quotes ']")
  private WebElement viewqutes;
  
}
