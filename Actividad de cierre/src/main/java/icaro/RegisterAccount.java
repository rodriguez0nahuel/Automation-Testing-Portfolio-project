package icaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterAccount extends Base {
    public RegisterAccount(WebDriver driver) {
        super(driver);
    }

    private By firstNameBy = By.name("firstname");
    private By lastNameBy = By.name("lastname");
    private By emailBy = By.name("email");
    private By telephoneBy = By.name("telephone");
    private By passwordBy = By.name("password");
    private By confirmBy = By.name("confirm");
    private By newsletterBy = By.name("newsletter");
    private By agreeBy = By.name("agree");
    private By continueBy = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

    public void ingresarNombre(String nombre) {
        WebElement nombreElement = wait.until(ExpectedConditions.presenceOfElementLocated(firstNameBy));
        nombreElement.sendKeys(nombre);
    }

    public void ingresarApellido(String apellido) {
        WebElement apelidoElement = wait.until(ExpectedConditions.presenceOfElementLocated(lastNameBy));
        apelidoElement.sendKeys(apellido);
    }

    public void ingresarMail(String mail) {
        WebElement mailElement = wait.until(ExpectedConditions.presenceOfElementLocated(emailBy));
        mailElement.sendKeys(mail);
    }

    public void ingresartelefono(String telefono) {
        WebElement telefonoElement = wait.until(ExpectedConditions.presenceOfElementLocated(telephoneBy));
        telefonoElement.sendKeys(telefono);
    }

    public void ingresarPassword(String password) {
        WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(passwordBy));
        passwordElement.sendKeys(password);
    }

    public void confirmarPassword(String password) {
        WebElement confirmElement = wait.until(ExpectedConditions.presenceOfElementLocated(confirmBy));
        confirmElement.sendKeys(password);
    }

    public void recibirNews(boolean enable) {
        WebElement recibirElement = wait.until(ExpectedConditions.presenceOfElementLocated(newsletterBy));
        recibirElement.isEnabled();
    }

    public void clickAgree() {
        WebElement agreeElement = wait.until(ExpectedConditions.presenceOfElementLocated(agreeBy));
        agreeElement.click();
    }

    public void clickContinue() {
        WebElement continueElement = wait.until(ExpectedConditions.presenceOfElementLocated(continueBy));
        continueElement.click();
    }
}
