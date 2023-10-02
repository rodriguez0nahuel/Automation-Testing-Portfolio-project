package icaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home extends Base  {

    public Home(WebDriver driver) {super(driver);}
    private final By DropdownBy = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
    private final By RegisterBy = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

    public void get (String url){
        driver.get(url);
    }
    public void clickRegisterLink(){
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(DropdownBy));
                dropdownElement.click();
        WebElement registerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(RegisterBy));
                registerElement.click();
    }
}