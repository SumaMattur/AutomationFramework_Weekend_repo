package books;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass{
	@Test
	public void clickOnBooks() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.getBooksLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop.","books page is not displayed");
		test.log(Status.PASS, "books page is displayed");
		test.log(Status.PASS, "books page is displayed");
	}
}
