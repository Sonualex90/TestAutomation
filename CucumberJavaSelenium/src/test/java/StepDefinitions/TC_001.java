package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_001 {
	
	WebDriver driver=null;
	
	
	@SuppressWarnings("deprecation")
	@Given("User open the browser")
	public void user_open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside Step-Opening the browser");
	    String path=System.getProperty("user.dir");
	    System.out.println(path);
	    System.setProperty("webdriver.chrome.driver", path+"/src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	@When("Hit the  the url")
	public void hit_the_the_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside step-hit the url");
	    driver.get("https://www.ergo.com");
	    //driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
	   Thread.sleep(2000);
	    
	}

	@And("Check url redirection is happening")
	public void check_url_redirection_is_happening() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Inside step-Check url redirection");
	   try {
	        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"] ")).click();
	 	    }catch (Exception e){
	 	    	System.out.println(e);
	 	    	System.out.println("no cookies");
	 	    } 
	}

	@Then("navigate to Ergo.com home page")
	public void navigate_to_ergo_com_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside Step-Navigate to Home page");
	   String pageTitle= driver.getTitle();
	   System.out.println(pageTitle);
	   if(pageTitle.equalsIgnoreCase("Willkommen bei ERGO | ERGO Group AG")) {
		   System.out.println("Successfully navigate to Ergo.de page");
	   }
	   driver.close();
	   driver.quit();
	}

}
