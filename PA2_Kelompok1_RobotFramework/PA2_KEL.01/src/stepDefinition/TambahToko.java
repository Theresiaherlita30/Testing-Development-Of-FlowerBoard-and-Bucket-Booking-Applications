
  package stepDefinition;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import
 org.openqa.selenium.chrome.ChromeDriver;
 
 import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 cucumber.api.java.en.When;
  
  public class TambahToko { WebDriver driver;

// Testcase 1
  @Given("^open chrome and start application$") public void
  open_chrome_and_start_application() throws Throwable {
  System.setProperty("webdriver.chrome.driver",
  "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
  
  driver = new ChromeDriver(); driver.manage().window().maximize();
  driver.get("http://127.0.0.1:8000/login"); }
  
  @When("^I enter valid username and valid password$") public void
  I_enter_valid_username_and_valid_password() throws Throwable {
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
  )).sendKeys("penjual@gmail.com");
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
  )).sendKeys("penjual"); }
  
  @Then("I click the sign in button") public void iClickTheSignInButton() { WebElement
  submitButton = driver.findElement(By.xpath(
  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click(); }
  
  @Then("I click the store in button") public void iClickTheStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a")); submitButton.click(); }
  
  @Then("I click the add store in button") public void iClickTheAddStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  "  /html/body/div/div[4]/div[2]/a")); submitButton.click(); }
  
  @When("^I enter valid name and address$") public void I_enter_valid_name_and_valid_password() 
     throws Throwable { driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys("Deloverystore");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(""); }
  
  @Then("I click the save submit button") public void iClickTheSaveButton() {WebElement 
	  submitButton = driver.findElement(By.xpath(
	  "//*[@id=\"login-form\"]/div/button")); submitButton.click();
	  }
  
}
  
/*Testcase 2
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Deloverystore");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl."); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 3
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Delo");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl.Sisingamangaraja"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 4
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Delo");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl.S"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  

/*Testcase 5
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Angel’s Cabin");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl. Merdeka No. 10"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 6
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Angel’s Cabin");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl.M"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 7
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Ange"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl. Merdeka No. 10"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  

/*Testcase 8
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Ange");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl."); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
//  Testcase 9
//  @Given("^open chrome and start application$") public void
//  open_chrome_and_start_application() throws Throwable {
//  System.setProperty("webdriver.chrome.driver",
//  "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
//  
//  driver = new ChromeDriver(); driver.manage().window().maximize();
//  driver.get("http://127.0.0.1:8000/login"); }
//  
//  @When("^I enter valid username and valid password$") public void
//  I_enter_valid_username_and_valid_password() throws Throwable {
//  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
//  )).sendKeys("penjual@gmail.com");
//  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
//  )).sendKeys("penjual"); }
//  
//  @Then("I click the sign in button") public void iClickTheSignInButton() { WebElement
//  submitButton = driver.findElement(By.xpath(
//  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click(); }
//  
//  @Then("I click the store in button") public void iClickTheStoreButton() { WebElement
//	  submitButton = driver.findElement(By.xpath(
//	  " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a")); submitButton.click(); }
//  
//  @Then("I click the add store in button") public void iClickTheAddStoreButton() { WebElement
//	  submitButton = driver.findElement(By.xpath(
//	  "  /html/body/div/div[4]/div[2]/a")); submitButton.click(); }
//  
//  @When("^I enter valid name and address$") public void I_enter_valid_name_and_valid_password() 
//     throws Throwable { driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys("Artistic Touches");
//	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys("123 Main Street, New York City"); }
//  
//  @Then("I click the save submit button") public void iClickTheSaveButton() {WebElement 
//	  submitButton = driver.findElement(By.xpath(
//	  "//*[@id=\"login-form\"]/div/button")); submitButton.click();
//	  }
  
/*Testcase 10
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Arti"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("123 Main Street, New York City"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  /*Testcase 11
   * @Given("^open chrome and start application$") public void
   * open_chrome_and_start_application() throws Throwable {
   * System.setProperty("webdriver.chrome.driver",
   * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
   * 
   * driver = new ChromeDriver(); driver.manage().window().maximize();
   * driver.get("http://127.0.0.1:8000/login"); }
   * 
   * @When("^I enter valid username and valid password$") public void
   * I_enter_valid_username_and_valid_password() throws Throwable {
   * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
   * )).sendKeys("penjual@gmail.com");
   * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
   * )).sendKeys("penjual"); }
   * 
   * @Then("I click the sign in button") public void iClickTheSignInButton() {
   * WebElement submitButton = driver.findElement(By.xpath(
   * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
   * }
   * 
   * @Then("I click the store in button") public void iClickTheStoreButton() {
   * WebElement submitButton = driver.findElement(By.xpath(
   * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
   * submitButton.click(); }
   * 
   * @Then("I click the add store in button") public void
   * iClickTheAddStoreButton() { WebElement submitButton =
   * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
   * submitButton.click(); }
   * 
   * @When("^I enter valid name and address$") public void
   * I_enter_valid_name_and_valid_password() throws Throwable {
   * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
   * "Artistic Touches");
   * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
   * "123"); }
   * 
   * @Then("I click the save submit button") public void iClickTheSaveButton()
   * {WebElement submitButton = driver.findElement(By.xpath(
   * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
   */
  
/*Taskcase 12
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Arti");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 13
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Bloom Florists");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("45 Rue de la Paix, Paris 75002, Prancis"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
 //Taskcase 14 
/*  @Given("^open chrome and start application$") public void
  open_chrome_and_start_application() throws Throwable {
  System.setProperty("webdriver.chrome.driver",
  "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
  
  driver = new ChromeDriver(); driver.manage().window().maximize();
  driver.get("http://127.0.0.1:8000/login"); }
  
  @When("^I enter valid username and valid password$") public void
  I_enter_valid_username_and_valid_password() throws Throwable {
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
  )).sendKeys("penjual@gmail.com");
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
  )).sendKeys("penjual"); }
  
  @Then("I click the sign in button") public void iClickTheSignInButton() { WebElement
  submitButton = driver.findElement(By.xpath(
  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click(); }
  
  @Then("I click the store in button") public void iClickTheStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a")); submitButton.click(); }
  
  @Then("I click the add store in button") public void iClickTheAddStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  "  /html/body/div/div[4]/div[2]/a")); submitButton.click(); }
  
  @When("^I enter valid name and address$") public void I_enter_valid_name_and_valid_password() 
     throws Throwable { driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys("Bloom Florists");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys("45"); }
  
  @Then("I click the save submit button") public void iClickTheSaveButton() {WebElement 
	  submitButton = driver.findElement(By.xpath(
	  "//*[@id=\"login-form\"]/div/button")); submitButton.click();
	  }
*/
  
/*Taskcase 15
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Blo"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("45 Rue de la Paix, Paris 75002, Prancis"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 16
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Blo");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "45"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Taskcase 17
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Bright Vase");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("10 Downing Street, London SW1A 2AA, Inggris"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Taskcase 18
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Bright Vase");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("10 D"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 19
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Brig"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("10 Downing Street, London SW1A 2AA, Inggris"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Taskcase 20
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Brig");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "10"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 21
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Bunches of Beauties");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl. Merdeka No. 123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
  
/*Taskcase 22
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Bunches of Beauties");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl."); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 23
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Bunc"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl. Merdeka No. 123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 24
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Bunc");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl."); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 25
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Enchanting Gifts7");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl. Jendral Sudirman No. 456"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*	Taskcase 26
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Enchanting Gifts7");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl."); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Taskcase 27
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Ench"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl. Jendral Sudirman No. 456"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*28
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Ench");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Jl."); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 29
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Flower Express");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl.Jl. Mawar No. 10, RT 03/RW 05"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 30
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Flow");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Mawa"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 31
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Flow"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Jl. Mawar No. 10, RT 03/RW 05"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Tackcase 32
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Flow");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Mawa"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Taskcase 33
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Flower Wonderland");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Calle Principal No. 789"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 34
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Flower Wonderland");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Call"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 35
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "land"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Calle Principal No. 789"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 36
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "land");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Call"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Taskcase 37
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Fresh Happiness");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("123 Green Street"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 38
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Fresh Happiness");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 39
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Fres"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("123 Green Street"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Taskcase 40
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Fres");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 41
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Garden Dreams");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("House No. 789, Street 12"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase42
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Garden Dreams");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Hous"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/* Testcase 43
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Gard"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("House No. 789, Street 12"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 44
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Gard");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Hous"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 45
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Little Flower Market");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("456 Zhongshan Road"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 46
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Little Flower Market");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "456"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 47
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Litt"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("456 Zhongshan Road"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 48
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Litt");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "456"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 49
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Luscious Stems");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Via Roma, 789"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 50
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Luscious Stems");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Via"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 51
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Lusc"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Via Roma, 789"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 52
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Lusc");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Via"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 53
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("My Lovely Flower Shop");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Calle Principal, 123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 54
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("My Lovely Flower Shop");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Cal"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 55
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "My"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Calle Principal, 123"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 56
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "My");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Call"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 57
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("North Dakota Flower Company");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("27 Rue de la Paix"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 58
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("North Dakota Flower Company");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "27"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 59
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Nort"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("27 Rue de la Paix"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 60
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Nort");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "27"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 61
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Wild Roses");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Rua das Flores, 456, São Paulo, Brasil"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 62
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Wild Roses");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Rua"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 63
  @Given("^open chrome and start application$") public void
  open_chrome_and_start_application() throws Throwable {
  System.setProperty("webdriver.chrome.driver",
  "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
  
  driver = new ChromeDriver(); driver.manage().window().maximize();
  driver.get("http://127.0.0.1:8000/login"); }
  
  @When("^I enter valid username and valid password$") public void
  I_enter_valid_username_and_valid_password() throws Throwable {
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
  )).sendKeys("penjual@gmail.com");
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
  )).sendKeys("penjual"); }
  
  @Then("I click the sign in button") public void iClickTheSignInButton() { WebElement
  submitButton = driver.findElement(By.xpath(
  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click(); }
  
  @Then("I click the store in button") public void iClickTheStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a")); submitButton.click(); }
  
  @Then("I click the add store in button") public void iClickTheAddStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  "  /html/body/div/div[4]/div[2]/a")); submitButton.click(); }
  
  @When("^I enter valid name and address$") public void I_enter_valid_name_and_valid_password() 
     throws Throwable { driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys("Wild");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys("Rua das Flores, 456, São Paulo, Brasil"); }
  
  @Then("I click the save submit button") public void iClickTheSaveButton() {WebElement 
	  submitButton = driver.findElement(By.xpath(
	  "//*[@id=\"login-form\"]/div/button")); submitButton.click();
	  }
*
*/
  
/*Testcase 64
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
 * "Wild");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Rua"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
  
/*Testcase 65
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Sunny Day Flower Shop");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
 * sendKeys("Calle Principal, 123, Ciudad de México, Meksiko"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
/*Testcase 66
 * @Given("^open chrome and start application$") public void
 * open_chrome_and_start_application() throws Throwable {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
 * 
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://127.0.0.1:8000/login"); }
 * 
 * @When("^I enter valid username and valid password$") public void
 * I_enter_valid_username_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
 * )).sendKeys("penjual@gmail.com");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
 * )).sendKeys("penjual"); }
 * 
 * @Then("I click the sign in button") public void iClickTheSignInButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
 * }
 * 
 * @Then("I click the store in button") public void iClickTheStoreButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
 * submitButton.click(); }
 * 
 * @Then("I click the add store in button") public void
 * iClickTheAddStoreButton() { WebElement submitButton =
 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter valid name and address$") public void
 * I_enter_valid_name_and_valid_password() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
 * sendKeys("Sunny Day Flower Shop");
 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
 * "Cal"); }
 * 
 * @Then("I click the save submit button") public void iClickTheSaveButton()
 * {WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
 */
  
 /* Testcase 67
  @Given("^open chrome and start application$") public void
  open_chrome_and_start_application() throws Throwable {
  System.setProperty("webdriver.chrome.driver",
  "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
  
  driver = new ChromeDriver(); driver.manage().window().maximize();
  driver.get("http://127.0.0.1:8000/login"); }
  
  @When("^I enter valid username and valid password$") public void
  I_enter_valid_username_and_valid_password() throws Throwable {
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
  )).sendKeys("penjual@gmail.com");
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
  )).sendKeys("penjual"); }
  
  @Then("I click the sign in button") public void iClickTheSignInButton() { WebElement
  submitButton = driver.findElement(By.xpath(
  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click(); }
  
  @Then("I click the store in button") public void iClickTheStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a")); submitButton.click(); }
  
  @Then("I click the add store in button") public void iClickTheAddStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  "  /html/body/div/div[4]/div[2]/a")); submitButton.click(); }
  
  @When("^I enter valid name and address$") public void I_enter_valid_name_and_valid_password() 
     throws Throwable { driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys("Sunn");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys("Calle Principal, 1230"); }
  
  @Then("I click the save submit button") public void iClickTheSaveButton() {WebElement 
	  submitButton = driver.findElement(By.xpath(
	  "//*[@id=\"login-form\"]/div/button")); submitButton.click();
	  }*/

		/*Testcase 68
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Sunn");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Cal"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 69
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("The Queen’s Fresh Picks");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("  Jl. Mawar No. 10, RT 03/RW 05, Kota Mekar Jaya, Indonesia"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 70
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("The Queen’s Fresh Picks");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "RW"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 71
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "The"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jl. Mawar No. 10, RT 03/RW 05, Kota Mekar Jaya, Indonesia"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 72
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "The");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Jl."); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 73
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("The Happy Florist");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Ahmad Dahlan No. 15, Yogyakarta"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 74
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("The Happy Florist");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Dahl"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 75
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Happ"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Ahmad Dahlan No. 15, Yogyakarta"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
  
		/*Testcase 76
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Happ");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Dahl"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 77
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Sunshine Daisies");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Sudirman No. 25, Denpasar, Bali"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 78
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Sunshine Daisies");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Bali"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 79
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Suns"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Sudirman No. 25, Denpasar, Bali"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 80
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Suns");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Bali"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 81
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("No Thorns Flower Shops");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Ahmad Yani No. 50, Bandung, Jawa Barat"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 82
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("No Thorns Flower Shops");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Jawa"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
  
  
		/*Testcase 83
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "No"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Ahmad Yani No. 50, Bandung, Jawa Barat"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 84
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "No");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Jawa"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 85
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Pink Memory");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Gajah Mada No. 100, Surabaya, Jawa Timur"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 86
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Pink Memory");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Mada"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 87
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Pink"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Gajah Mada No. 100, Surabaya, Jawa Timur"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 89
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Pink");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Mada"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 90
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("House of Blossoms");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Raya Merdeka No. 10, Jakarta Pusat, DKI Jakarta"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 91
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("House of Blossoms");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Raya"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 92
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Hous"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Raya Merdeka No. 10, Jakarta Pusat, DKI Jakarta"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  

		/*Testcase 93
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "Hous");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Raya"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 94
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Flowers All-day");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Malioboro No. 555, Yogyakarta"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 95
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Flowers All-day");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Mali"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 96
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "day"); driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("Jalan Malioboro No. 555, Yogyakarta"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 97
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys(
		 * "day");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Mali"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
  
		/*Testcase 98
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Flower Wishlist Shop");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).
		 * sendKeys("  Jalan Pemuda No. 999, Makassar, Sulawesi Selatan"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
		/*Testcase 99
		 * @Given("^open chrome and start application$") public void
		 * open_chrome_and_start_application() throws Throwable {
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
		 * 
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://127.0.0.1:8000/login"); }
		 * 
		 * @When("^I enter valid username and valid password$") public void
		 * I_enter_valid_username_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
		 * )).sendKeys("penjual@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
		 * )).sendKeys("penjual"); }
		 * 
		 * @Then("I click the sign in button") public void iClickTheSignInButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click();
		 * }
		 * 
		 * @Then("I click the store in button") public void iClickTheStoreButton() {
		 * WebElement submitButton = driver.findElement(By.xpath(
		 * " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @Then("I click the add store in button") public void
		 * iClickTheAddStoreButton() { WebElement submitButton =
		 * driver.findElement(By.xpath( "  /html/body/div/div[4]/div[2]/a"));
		 * submitButton.click(); }
		 * 
		 * @When("^I enter valid name and address$") public void
		 * I_enter_valid_name_and_valid_password() throws Throwable {
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).
		 * sendKeys("Flower Wishlist Shop");
		 * driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(
		 * "Pemu"); }
		 * 
		 * @Then("I click the save submit button") public void iClickTheSaveButton()
		 * {WebElement submitButton = driver.findElement(By.xpath(
		 * "//*[@id=\"login-form\"]/div/button")); submitButton.click(); }
		 */
  
 /* Testcase 100
  @Given("^open chrome and start application$") public void
  open_chrome_and_start_application() throws Throwable {
  System.setProperty("webdriver.chrome.driver",
  "C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
  
  driver = new ChromeDriver(); driver.manage().window().maximize();
  driver.get("http://127.0.0.1:8000/login"); }
  
  @When("^I enter valid username and valid password$") public void
  I_enter_valid_username_and_valid_password() throws Throwable {
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]"
  )).sendKeys("penjual@gmail.com");
  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]"
  )).sendKeys("penjual"); }
  
  @Then("I click the sign in button") public void iClickTheSignInButton() { WebElement
  submitButton = driver.findElement(By.xpath(
  "//*[@id=\"login-form\"]/div/div[1]/div/div/button")); submitButton.click(); }
  
  @Then("I click the store in button") public void iClickTheStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  " /html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[2]/a")); submitButton.click(); }
  
  @Then("I click the add store in button") public void iClickTheAddStoreButton() { WebElement
	  submitButton = driver.findElement(By.xpath(
	  "  /html/body/div/div[4]/div[2]/a")); submitButton.click(); }
  
  @When("^I enter valid name and address$") public void I_enter_valid_name_and_valid_password() 
     throws Throwable { driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[2]")).sendKeys("Flow");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/input[3]")).sendKeys(" 999"); }
  
  @Then("I click the save submit button") public void iClickTheSaveButton() {WebElement 
	  submitButton = driver.findElement(By.xpath(
	  "//*[@id=\"login-form\"]/div/button")); submitButton.click();
	  }
}*/

  
  