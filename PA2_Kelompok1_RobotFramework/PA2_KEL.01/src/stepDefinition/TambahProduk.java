/*
 * package stepDefinition;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.And; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class TambahProduk { WebDriver driver;
 * 
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
 * 
 * @When("I click the shop now button") public void iClickTheShopNowButton() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "/html/body/div/div[4]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/a"
 * )); submitButton.click(); }
 * 
 * @Then("I click the add product button") public void
 * iClickTheAddProductButton() { WebElement submitButton =
 * driver.findElement(By.xpath(
 * "/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a"));
 * submitButton.click(); }
 * 
 * @When("^I enter product name$") public void I_enter_name_product() throws
 * Throwable { driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]"
 * )).sendKeys("Bunga Mawar");}
 * 
 * @Then("I click the choose product category") public void
 * iClickTheChooseProductCategory() { WebElement submitButton =
 * driver.findElement(By.xpath( "//*[@id=\"toko-form\"]/div[1]/div/div"));
 * submitButton.click(); }
 * 
 * @Then("I click the choose product") public void iClickTheChooseProduct() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")); submitButton.click(); }
 * 
 * @Then("I click the choose location") public void iClickTheChooseLocation() {
 * WebElement submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"toko-form\"]/div[2]/div/div")); submitButton.click(); }
 * 
 * @Then("I click the location") public void iClickTheLocation() { WebElement
 * submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[2]")); submitButton.click(); }
 * 
 * @When("^I enter price$") public void I_enter_price() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]"
 * )).sendKeys("Rp.100.000");}
 * 
 * @When("^I enter description product$") public void
 * I_enter_description_product() throws Throwable {
 * driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]"
 * )).sendKeys("Bunga hias blalalalala");}
 * 
 * @Then("I click choose file") public void iClickChooseFile() { WebElement
 * submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"toko-form\"]/input[7]")); submitButton.click(); }
 * 
 * @Then("I click save button") public void iClickSaveButton() { WebElement
 * submitButton = driver.findElement(By.xpath(
 * "//*[@id=\"toko-form\"]/div[3]/button")); submitButton.click(); }
 * 
 * 
 * }
 */