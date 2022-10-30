import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {
	
	 WebDriver driver;
	 
	 
	@Given("browser is open")
	public void browser_is_open() {
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@When("user enter usename and password")
	public void user_enter_usename_and_password() {
		
		driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _1Z69nn VJZDxU']")).sendKeys("7013474495");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _3mctLh VJZDxU']")).sendkeys("*1234567");
	}

	@And("hits login button")  
	public void hits_login_button() {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
		
		Thread.sleep(2000);
	
	}	
	

}

