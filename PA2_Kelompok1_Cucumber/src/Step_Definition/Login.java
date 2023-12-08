//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
// public class Login {
//	WebDriver driver;
//	
//    @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	 System.setProperty("webdriver.chrome.driver",
//	 "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
//	  
//	  driver = new ChromeDriver(); driver.manage().window().maximize();
//	  driver.get("http://127.0.0.1:8000/login");
//	  
//	  }
//	  
//	  @When("^I enter valid username and valid password$") public void
//	 I_enter_valid_username_and_valid_password() throws Throwable {
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
//	  )).sendKeys("theresiacantik@gmail.com");
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
//	  )).sendKeys("theresia"); }
//	  
//	  @Then("I click the submit button") public void iClickTheSubmitButton() {
//	  WebElement submitButton = driver.findElement(By.xpath(
//	  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
//
//	  }
// }
//	
//	
//	  @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	 System.setProperty("webdriver.chrome.driver",
//	 "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
//	  
//	  driver = new ChromeDriver(); driver.manage().window().maximize();
//	  driver.get("http://127.0.0.1:8000/login");
//	  
//	  }
//	  
//	  @When("^I enter valid username and invalid password$") public void
//	 I_enter_valid_username_and_valid_password() throws Throwable {
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
//	  )).sendKeys("theresiacantik@gmail.com");
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
//	  )).sendKeys("theresia123"); }
//	  
//	  @Then("I click the submit button") public void iClickTheSubmitButton() {
//	  WebElement submitButton = driver.findElement(By.xpath(
//	  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
//
//	  }
// }
	  
//	  @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	 System.setProperty("webdriver.chrome.driver",
//	 "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
//	  
//	  driver = new ChromeDriver(); driver.manage().window().maximize();
//	  driver.get("http://127.0.0.1:8000/login");
//	  
//	  }
//	  
//	  @When("^I enter valid username and valid password$") public void
//	 I_enter_valid_username_and_valid_password() throws Throwable {
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
//	  )).sendKeys("theresiacantik123@gmail.com@gmail.com");
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
//	  )).sendKeys("theresia"); }
//	  
//	  @Then("I click the submit button") public void iClickTheSubmitButton() {
//	  WebElement submitButton = driver.findElement(By.xpath(
//	  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
//
//	  }}
//	  
	  
//	  @Given("^open chrome and start application$") public void
//	 open_chrome_and_start_application() throws Throwable {
//	 System.setProperty("webdriver.chrome.driver",
//	 "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
//	  
//	  driver = new ChromeDriver(); driver.manage().window().maximize();
//	  driver.get("http://127.0.0.1:8000/login");
//	  
//	  }
//	  
//	  @When("^I enter valid username and valid password$") public void
//	 I_enter_valid_username_and_valid_password() throws Throwable {
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
//	  )).sendKeys("theresiacantik123@gmail.com@gmail.com");
//	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
//	  )).sendKeys("tere"); }
//	  
//	  @Then("I click the submit button") public void iClickTheSubmitButton() {
//	  WebElement submitButton = driver.findElement(By.xpath(
//	  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
//
//	  }
	
	/*Login 2
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("AngelicaManurung@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Angelica123"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 3
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("SaimaritoSimanullang67@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Sai12345"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 4
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("AlbertManik20@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("AlbertManik12345"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 5
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("RefinaMarpaung11@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Refina12"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 6
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Fransiska20@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Fransiska123"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 7
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Dafne11@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Dafne12"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 8
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("MegaMarbun11@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Mega11"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 9
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Yosephine12@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Yosephine"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 10
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Elsa12@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Elsa"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	
	/*Login 11
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Samuel08@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Samuel00"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 12
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Chintya11@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Chintya22"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 13
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Kristina09@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Kristina22"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 14
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Rebecca30@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Rebecca33"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 15
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Yanti43@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Yanti90"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 16
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Regina01@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Regina01"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 17
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Agnes01@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Agnes"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	
	/*Login 18
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Lydia77@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Lydia12"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 19
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Yolanda@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Yolanda12"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 20
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Yuliana@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Yuliana"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login21
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Moranda@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Moranda"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 22
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Margareth@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Margareth"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	
	/*Login 23
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Christine@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Christine"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*Login 24
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Trinita@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Trinita"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * }
	 */
	
	/*
	 * @Given("^open chrome and start application$") public void
	 * open_chrome_and_start_application() throws Throwable {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	 * 
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://127.0.0.1:8000/login");
	 * 
	 * }
	 * 
	 * @When("^I enter valid username and valid password$") public void
	 * I_enter_valid_username_and_valid_password() throws Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
	 * )).sendKeys("Priskila77@gmail.com");
	 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
	 * )).sendKeys("Priskila67"); }
	 * 
	 * @Then("I click the submit button") public void iClickTheSubmitButton() {
	 * WebElement submitButton = driver.findElement(By.xpath(
	 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
	 * } }
	 */
