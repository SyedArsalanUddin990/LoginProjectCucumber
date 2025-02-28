
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginSteps {
    WebDriver driver;

    @Given("User is on SauceDemo login page")
    public void user_is_on_sauce_demo_login_page() {
        // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @When("User adds {string} to the cart")
    public void user_adds_product_to_the_cart(String product) {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @When("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a")).click();
        driver.findElement(By.id("checkout")).click();
    }

    @When("User enters first name {string}, last name {string}, and postal code {string}")
    public void user_enters_first_name_last_name_and_postal_code(String firstName, String lastName, String postalCode) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
        driver.findElement(By.id("last-name")).sendKeys(lastName);
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
    }

    @When("User clicks on the continue button")
    public void user_clicks_on_the_continue_button() {
        driver.findElement(By.id("continue")).click();
    }

    @When("User completes the order")
    public void user_completes_the_order() {
        driver.findElement(By.id("finish")).click();
    }

    @Then("User should see the order confirmation")
    public void user_should_see_the_order_confirmation() {
        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));
        assert confirmationMessage.getText().equals("Thank you for your order!");
        driver.quit();
    }
}


