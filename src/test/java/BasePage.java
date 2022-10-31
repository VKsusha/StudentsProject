import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    int BASIC_TIME = 30;

    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public WebElement waitElementToBeVisible(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public List<WebElement> waitElementsToBeVisible(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

}
