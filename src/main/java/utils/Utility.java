package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
public static void scrrenshot(WebDriver driver,int TestID) {
	SimpleDateFormat dateformate=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	Date d=new Date();
	String newdate=dateformate.format(d);
             File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             
}
}
