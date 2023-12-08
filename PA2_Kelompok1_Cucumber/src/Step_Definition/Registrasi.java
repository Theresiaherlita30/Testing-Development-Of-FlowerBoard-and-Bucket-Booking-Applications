////=================================================================================================
////											VARIANSI 01
////=================================================================================================
// // TESTCASE 01 
//package Step_Definition;
//import static org.junit.Assert.assertEquals;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
//
//public class Registrasi {
//	 WebDriver driver;
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//
//	driver = new ChromeDriver(); driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/register");
//}
//
//@When("^I enter valid username,valid email, valid no.telp, valid password, and valid role$")
//public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Ignacia Manurung");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("ignacia123@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08976548903165");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("angelica");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
//}
//
//@Then("^I click the role option$")
//public void I_click_the_role_option() throws Throwable {
//	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
//	dropdown.click();
//}
//
//@Then("^I click button submit succesfull$")
//public void I_click_button_submit_succesfull() throws Throwable {
//	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//}
//}

//// // TESTCASE 02
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(3000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("LunaPinky");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("lunelove@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089723443165");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("angelica");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(2000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 03
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////}
////
////@When("^I enter valid username,valid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Luana Clariza");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("clarixalu@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("0892554564165");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("clarixalu");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////}
////
////
////@Then("^I click button submit succesfull$")
////public void I_click_button_submit_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 04
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////}
////
////@When("^I enter valid username,valid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Mutiara Breka");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("utiiiiiii@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("081239764165");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("utiiiiiii");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////}
////
////
////@Then("^I click button submit succesfull$")
////public void I_click_button_submit_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 02
////=================================================================================================
// // TESTCASE 05
//package Step_Definition;
//import static org.junit.Assert.assertEquals;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
//
//public class Registrasi {
//	 WebDriver driver;
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//
//	driver = new ChromeDriver(); driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/register");
//	Thread.sleep(1000);
//}
//
//@When("^I enter invalid username,valid email, valid no.telp, valid password, and valid role$")
//public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
//	Thread.sleep(3000);
//}
//
//@Then("^I click the role option$")
//public void I_click_the_role_option() throws Throwable {
//	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
//	dropdown.click();
//	Thread.sleep(1000);
//}
//
//@Then("^I click button submit not succesfull$")
//public void I_click_button_submit_not_succesfull() throws Throwable {
//	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//}
//}
//
//// // TESTCASE 06
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 07
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
////
//// // TESTCASE 08
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("loveflower@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089319428534");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("loveflower");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
////
//
////=================================================================================================
////											VARIANSI 03
////=================================================================================================
//// // TESTCASE 09
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 10
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 11
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
////
//// // TESTCASE 12
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("loveflower");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089319428534");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("loveflower");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 04
////=================================================================================================
//// // TESTCASE 13
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 14
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 15
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 05
////=================================================================================================
//// // TESTCASE 16
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("085675432718");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 17
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089624432718");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 18
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089624564278");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 06
////=================================================================================================
//// // TESTCASE 19
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("085675432718");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 20
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089624432718");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("officialkiki");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 21
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089624564278");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 07
////=================================================================================================
//// // TESTCASE 22
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 23
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 24
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
////=================================================================================================
////											VARIANSI 08
////=================================================================================================
//// // TESTCASE 25
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 26
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("kikioff@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 27
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 09
////=================================================================================================
//// // TESTCASE 28
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 29
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("kikioff@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 30
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 10
////=================================================================================================
//// // TESTCASE 31
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandracyutt");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 32
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("kikioff@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	Thread.sleep(3000);
////}
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 33
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 11
////=================================================================================================
//// // TESTCASE 34
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 35
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 36
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 12
////=================================================================================================
//// // TESTCASE 37
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("082272620936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 38
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08227268966");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 39
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08242956936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 13
////=================================================================================================
//// // TESTCASE 40
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("082272620936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 41
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08227268966");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("officialkiki");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 42
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08242956936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 14
////=================================================================================================
////  //TESTCASE 43
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 44
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 45
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 15
////=================================================================================================
//// // TESTCASE 46
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////
//// // TESTCASE 47
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("officialkiki");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 48
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 16
////=================================================================================================
//// // TESTCASE 49
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("088755693623");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 50
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08247853256");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 51
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08242956936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 17
////=================================================================================================
//
//// // TESTCASE 52
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 53
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 54
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, valid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_valid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 18
////=================================================================================================
//// // TESTCASE 55
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 56
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 57
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 19
////=================================================================================================
//// // TESTCASE 58
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, valid password, invalid valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_valid_password_invalid_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234542365");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandracyutt");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 59
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, valid password, invalid valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_valid_password_invalid_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089234541234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	Thread.sleep(3000);
////}
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 60
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, valid password, invalid valid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_valid_password_invalid_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("089391287234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 20
////=================================================================================================
//// // TESTCASE 61
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandrakyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 62
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("kikioff@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 63
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 21
////=================================================================================================
//// // TESTCASE 64
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, valid password, invalid valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_valid_password_invalid_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandrakyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandrakyutt");
////}
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 65
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, valid password, invalid valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_valid_password_invalid_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("kikioff@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 66
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, valid password, invalid valid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_valid_password_invalid_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 22
////=================================================================================================
//// // TESTCASE 67
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 68
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 69
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
////=================================================================================================
////											VARIANSI 23
////=================================================================================================
//// // TESTCASE 70
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 71
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("kikioff");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 72
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 24
////=================================================================================================
//// // TESTCASE 73
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("alexandra");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandrakyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 74
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("kikioff");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("kikioff@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 75
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,valid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_valid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 25
////=================================================================================================
//// // TESTCASE 76
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("088755693623");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 77
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08247853256");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 78
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08242956936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 26
////=================================================================================================
//// // TESTCASE 79
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("alexandracyutt");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("088755693623");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 80
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08247853256");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////// TESTCASE 81
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08242956936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 27
////=================================================================================================
//// // TESTCASE 82
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("alexandracyutt");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 83
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("officialkiki");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////// TESTCASE 84
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("oioioioioi");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 28
////=================================================================================================
//// // TESTCASE 85
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexandracyutt@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 86
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("officialkiki@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 87
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,valid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_valid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("oioioioioi@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 29
////=================================================================================================
//// // TESTCASE 88
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("088755693623");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 89
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08247853256");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////// TESTCASE 90
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter valid username,invalid email, valid no.telp, invalid password, and invalid role$")
////public void I_enter_valid_username_invalid_email_valid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("08242956936");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
////=================================================================================================
////											VARIANSI 30
////=================================================================================================
//// // TESTCASE 91
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("alexandra");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 92
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("officialkiki");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 93
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, valid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_valid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("oioioioioi");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 31
////=================================================================================================
////  //TESTCASE 94
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 95
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[2]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 96
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and valid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_valid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div")).click();
////	Thread.sleep(3000);
////}
////
////@Then("^I click the role option$")
////public void I_click_the_role_option() throws Throwable {
////	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/div[1]/div/div/ul/li[3]")); 
////	dropdown.click();
////	Thread.sleep(1000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
////=================================================================================================
////											VARIANSI 32
////=================================================================================================
//// // TESTCASE 97
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("alexanderky");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//
//// // TESTCASE 98
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("1234");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
//// // TESTCASE 99
////package Step_Definition;
////import static org.junit.Assert.assertEquals;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.Select;
////import org.openqa.selenium.support.ui.WebDriverWait;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.WebElement;
////
////public class Registrasi {
////	 WebDriver driver;
////@Given("^open chrome and start application$")
////public void open_chrome_and_start_application() throws Throwable {
////	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////
////	driver = new ChromeDriver(); driver.manage().window().maximize();
////	driver.get("http://127.0.0.1:8000/register");
////	Thread.sleep(1000);
////}
////
////@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and invalid role$")
////public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
////	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
////	Thread.sleep(3000);
////}
////
////@Then("^I click button submit not succesfull$")
////public void I_click_button_submit_not_succesfull() throws Throwable {
////	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////}
////}
//
// // TESTCASE 100
//package Step_Definition;
//import static org.junit.Assert.assertEquals;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
//
//public class Registrasi {
//	 WebDriver driver;
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//
//	driver = new ChromeDriver(); driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/register");
//	Thread.sleep(1000);
//}
//
//@When("^I enter invalid username,invalid email, invalid no.telp, invalid password, and invalid role$")
//public void I_enter_invalid_username_invalid_email_invalid_no_telp_invalid_password_and_invalid_role() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[1]")).sendKeys("Lu");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[2]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[3]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div/input[4]")).sendKeys("");
//	Thread.sleep(3000);
//}
//
//@Then("^I click button submit not succesfull$")
//public void I_click_button_submit_not_succesfull() throws Throwable {
//	driver.findElement(By.xpath( "//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//}
//}