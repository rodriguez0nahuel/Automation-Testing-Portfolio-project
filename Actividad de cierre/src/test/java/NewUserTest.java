import icaro.Home;
import icaro.RegisterAccount;
import icaro.SuccessReg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class NewUserTest {
    private WebDriver driver;
    private Home home;
    private RegisterAccount registerAccount;
    private SuccessReg successReg;

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        this.driver = new ChromeDriver(options);
        home = new Home(driver);
        registerAccount = new RegisterAccount(driver);
        successReg = new SuccessReg(driver);

    }

    @Test
    public void crearUsuario() {
        home.get("https://opencart.abstracta.us/");
        home.clickRegisterLink();
        registerAccount.ingresarNombre("tester");
        registerAccount.ingresarApellido("auto");
        registerAccount.ingresarMail("quierosertesterauto@gmail.com");
        registerAccount.ingresartelefono("0800");
        registerAccount.ingresarPassword("1234");
        registerAccount.confirmarPassword("1234");
        registerAccount.recibirNews(false);
        registerAccount.clickAgree();
        registerAccount.clickContinue();

        String textoEsperado = "Congratulations! Your new account has been successfully created!";
        String texto =successReg.getText();
        Assert.assertEquals(texto,textoEsperado);
        successReg.clickContinue();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

