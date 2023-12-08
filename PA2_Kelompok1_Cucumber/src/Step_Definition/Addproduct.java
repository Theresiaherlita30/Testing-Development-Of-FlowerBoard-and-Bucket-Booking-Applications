//// Test case 01
//package Step_Definition;
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
//public class Addproduct {
//	 WebDriver driver;
//	 @Given("^open chrome and start application$")
//	 public void open_chrome_and_start_application() throws Throwable {
//		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//			driver = new ChromeDriver(); driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/login");
//	 }
//	 @When("^I enter valid username and valid password$")
//	 public void I_enter_valid_username_and_valid_password() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
//	 }
//	 @Then("^I click the sign in button$")
//	 public void I_click_the_sign_in_button() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//	 }
//	 @When("^I click the shop now button$")
//	 public void I_click_the_shop_now_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
//		 Thread.sleep(1000);
//	 }
//	 @Then("^I click the add product button$")
//	 public void I_click_the_add_product_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div[1]/div[1]/div/a")).click();
//	 }
//	 @When("^I enter product name, category product, subdistrict, price, and description$")
//	 public void I_enter_product_name_category_product_subdistrict_price_and_description() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Buket Uang");
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Uang sesuai dengan ketentuan");
//		 Thread.sleep(3000);
//	 }
//	 @When("^I upload choose file$")
//	 public void I_upload_choose_file() throws Throwable {
//		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
//		 fileInput.sendKeys("D:\\buket\\buketUang.jpg");
//		 Thread.sleep(1000);
//	 }
//	 @Then("^I click the save$")
//	 public void I_click_the_save() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
//	 }
//}

////// Test Case 02
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter product name, category product, subdistrict, price, and description$")public void I_enter_product_name_category_product_subdistrict_price_and_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the save$")public void I_click_the_save() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
//
////// Test Case 03
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 04
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 05
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter I enter valid product name, valid invalid category, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_I_enter_valid_product_name_valid_invalid_category_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
//
////// Test Case 06
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter I enter valid product name, valid invalid category, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_I_enter_valid_product_name_valid_invalid_category_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Graduation");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 07
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter I enter valid product name, valid valid category, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_I_enter_valid_product_name_valid_valid_category_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 08
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter I enter valid product name, valid valid category, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_I_enter_valid_product_name_valid_valid_category_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Graduation");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 09
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 10
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Graduation");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 11
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Graduation");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(4000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 12
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(4000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 13
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan bunga dengan berbagai varian warna");
////		 Thread.sleep(4000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 14
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Graduation");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan bunga dengan berbagai varian warna");
////		 Thread.sleep(4000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 15
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan bunga dengan berbagai varian warna");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 16
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan bunga dengan berbagai varian warna");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 17
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
//
////// Test Case 18
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145500");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 19
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 20
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 21
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 22
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
////
////// Test Case 23
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 24
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, valid price, dan valid description$")
////   public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
////
////// Test Case 25
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 26
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Papan Bunga Sukses ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
////
////// Test Case 27
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
////
////// Test Case 28
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
////
////
////// Test Case 29
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 30
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
//// 	 @When("^I enter valid product name, invalid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 31
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 32
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
//// 	 @When("^I enter valid product name, invalid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihn");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 33
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket cokelat dengan ketentuan permintaan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 34
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, valid category product, invalid subdistrict, invalid price, dan valid description$")
////	public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan beragam warna");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 35
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 36
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, valid category product, invalid subdistrict, valid price, dan invalid description$")
////	public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 37
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[4]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket cokelat dengan ketentuan permintaan");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 38
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, valid category product, invalid subdistrict, valid price, dan valid description$")
////	public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan beragam warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 39
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 40
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 41
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket cokelat dengan ketentuan permintaan");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 42
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan beragam warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 43
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 44
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	@When("^I enter valid product name, valid category product, valid subdistrict, valid price, dan invalid description$")
////	public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 45
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket coket sesuai dengan permintaan ");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 46
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 47
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket coklat sesuai dengan permintaan");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////		 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 48
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 49
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////		 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 50
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 } 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 51
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket coklat sesuai dengan permintaan");
////		 Thread.sleep(3000);
////	 }
////		 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 52
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 53
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buket dengan Isi Cokelat sesuai dengan ketentuan");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 54
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
//// 	 @When("^I enter invalid product name, valid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////	  	 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////	 	 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna dan piihan");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 55
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 56
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////	  	 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////	 	 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////	 }
////
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 57
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Buket dengan Isi Cokelat sesuai dengan ketentuan ");
////		 Thread.sleep(3000);
////	 }
////
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 58
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////	  	 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////	 	 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan berbagai warna dan piihan");
////		 Thread.sleep(3000);
////	 }
////
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 59
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 60
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////		@When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 61
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 62
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 63
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 64
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////		@When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 65
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 66
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////		@When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 67
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 68
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 69
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 70
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////		@When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 71
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 72
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 73
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 75
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 76
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 77
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 79
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 80
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" ");
////		 Thread.sleep(3000);
////	 }
////		@When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 81
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 82
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" ");
////		 Thread.sleep(3000);
////	 }
////		@When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////		fileInput.sendKeys("D:\\buket\\PapanBunga.jpg");
////}
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 83
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Buker cokelat sesuai request");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 84
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 85
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 86
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 87
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, valid subdistrict, invalid price, dan invalid descriptio$")
////	 public void I_enter_valid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_invalid_descriptio() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 88
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, valid category product, invalid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 89
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" ");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 90
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("  ");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
////	 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
////	 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 91
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, invalid price, dan valid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" Papan Bunga dengan Berbagai warna");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
//
////// Test Case 92
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, Invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_Invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[3]")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 93
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name, invalid category product, invalid subdistrict, valid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("Papan Bunga Sukses");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" ");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 94
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
////	 }
////	 @When("^I enter valid product name,invalid category product, invalid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_valid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" Buket Cokelat ");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 95
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, valid category product, invalid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_valid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[1]/div/div/ul/li[2]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
////// Test Case 96
////package Step_Definition;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import cucumber.api.java.en.When;
////
////public class Addproduct {
////	 WebDriver driver;
////	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
////		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
////			driver = new ChromeDriver(); driver.manage().window().maximize();
////			driver.get("http://127.0.0.1:8000/login");
////	 }
////	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
////	 }
////	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
////	 }
////	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
////		 Thread.sleep(1000);
////	 }
////	 @Then("^I click the add product button$")
////	 public void I_click_the_add_product_button() throws Throwable {
////		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
////	 }
////	 @When("^I enter invalid product name, invalid category product, valid subdistrict, invalid price, dan invalid description$")
////	 public void I_enter_invalid_product_name_invalid_category_product_valid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
////		 Thread.sleep(1000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div")).click();
////		 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[2]/div/div/ul/li[3]")).click();
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
////		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" ");
////		 Thread.sleep(3000);
////	 }
////	 @Then("^I click the button save not succes$")
////	 public void I_click_the_button_save_not_succes() throws Throwable {
////		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
////	 }
////}
//
//// Test Case 97
//package Step_Definition;
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
//public class Addproduct {
//	 WebDriver driver;
//	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
//		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//			driver = new ChromeDriver(); driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/login");
//	 }
//	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
//	 }
//	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//	 }
//	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
//		 Thread.sleep(1000);
//	 }
//	 @Then("^I click the add product button$")
//	 public void I_click_the_add_product_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
//	 }
//	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, valid price, dan invalid description$")
//	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_valid_price_dan_invalid_description() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys(" ");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("145000");
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
//		 Thread.sleep(3000);
//	 }
//	 
//	 @Then("^I click the button save not succes$")
//	 public void I_click_the_button_save_not_succes() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
//	 }
//}

//// Test Case 98
//package Step_Definition;
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
//public class Addproduct {
//	 WebDriver driver;
//	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
//		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//			driver = new ChromeDriver(); driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/login");
//	 }
//	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
//	 }
//	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//	 }
//	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
//		 Thread.sleep(1000);
//	 }
//	 @Then("^I click the add product button$")
//	 public void I_click_the_add_product_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/div[4]/div[3]/div/div/div/div[1]/div/a")).click();
//	 }
//	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, invalid price, dan valid description$")
//	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_valid_description() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
//		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("Papan Bunga dengan berbagai warna");
//		 Thread.sleep(3000);
//	 }
//	 @Then("^I click the button save not succes$")
//	 public void I_click_the_button_save_not_succes() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
//	 }
//}

//// Test Case 99
//package Step_Definition;
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
//public class Addproduct {
//	 WebDriver driver;
//	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
//		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//			driver = new ChromeDriver(); driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/login");
//	 }
//	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
//	 }
//	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//	 }
//	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[2]/a")).click();
//		 Thread.sleep(1000);
//	 }
//	 @Then("^I click the add product button$")
//	 public void I_click_the_add_product_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/div[4]/div[5]/div/div/div[1]/div[1]/div/a")).click();
//	 }
//	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, invalid price, dan invalid description$")
//	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys(" ");
//		 Thread.sleep(3000);
//	 }
//	 @When("^I upload choose file$") public void I_upload_choose_file() throws Throwable {
//		 WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[7]"));
//		 fileInput.sendKeys("D:\\buket\\buketCokelat.jpg");
//	 }
//	 @Then("^I click the button save not succes$")
//	 public void I_click_the_button_save_not_succes() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
//	 }
//}

//// Test Case 100
//package Step_Definition;
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
//public class Addproduct {
//	 WebDriver driver;
//	 @Given("^open chrome and start application$") public void open_chrome_and_start_application() throws Throwable {
//		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver.exe" );
//			driver = new ChromeDriver(); driver.manage().window().maximize();
//			driver.get("http://127.0.0.1:8000/login");
//	 }
//	 @When("^I enter valid username and valid password$") public void I_enter_valid_username_and_valid_password() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[1]")).sendKeys("seller2014@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/input[2]")).sendKeys("penjual2014");Thread.sleep(2000);
//	 }
//	 @Then("^I click the sign in button$")public void I_click_the_sign_in_button() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div/div/button")).click();
//	 }
//	 @When("^I click the shop now button$")public void I_click_the_shop_now_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/a")).click();
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("/html/body/div/header/div/div/div/div[2]/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
//		 Thread.sleep(1000);
//	 }
//	 @Then("^I click the add product button$")
//	 public void I_click_the_add_product_button() throws Throwable {
//		 driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/div/div/div[1]/div/a")).click();
//	 }
//	 @When("^I enter invalid product name, invalid category product, invalid subdistrict, invalid price, dan invalid description$")
//	 public void I_enter_invalid_product_name_invalid_category_product_invalid_subdistrict_invalid_price_dan_invalid_description() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[2]")).sendKeys("");
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[4]")).sendKeys("");
//		  driver.findElement(By.xpath("//*[@id=\"toko-form\"]/input[5]")).sendKeys("");
//		 Thread.sleep(3000);
//	 }
//	 @Then("^I click the button save not succes$")
//	 public void I_click_the_button_save_not_succes() throws Throwable {
//		 driver.findElement(By.xpath("//*[@id=\"toko-form\"]/div[3]/button")).click();
//	 }
//}

