package icaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessReg extends Base {

    public SuccessReg(WebDriver driver) {
        super(driver);
    }
    private By continueBy = By.xpath("//*[@id=\"content\"]/div/div/a");
    private By textoBy = By.xpath("//*[@id=\"content\"]/p[1]");

    public void clickContinue (){
        WebElement continueElement = wait.until(ExpectedConditions.presenceOfElementLocated(continueBy));
        continueElement.click();
    }
    public String getText(){
        WebElement textoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(textoBy));
        return textoElement.getText();
    }
}
