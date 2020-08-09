package runnerTest.webPages;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepDefinition.HomePageSD;

import java.util.List;

public class HomePage extends ElementUtil{

    private By navigationButton = By.cssSelector(".currentLocationButton");
    private By todayBtn = By.xpath("//span[contains(text(),'Today')]");


    public void clickNavigationButton() throws InterruptedException {
        clickOn(navigationButton);
        Thread.sleep(7000);
    }
    public void clickElementByJS() {
        WebElement element = webAction(todayBtn);
        JavascriptExecutor js = (JavascriptExecutor) BasePage.get();
        js.executeScript("arguments[0].click();", element);
    }
    public void verifyTemp(){
        String currentTemp = BasePage.get().findElement(By.cssSelector(".summary.swap")).getText();
        System.out.println("Current Temp:" + currentTemp);
        List<WebElement> allTemps = BasePage.get().findElements(By.cssSelector(".temps span:last-child"));
        int temp = Integer.parseInt(currentTemp.substring(0, 2));
        int highestTemp = temp;
        int lowestTemp = temp;
        for (WebElement tempInTime: allTemps) {
            String sLIneTemp = tempInTime.getText();
            int lineTemp = Integer.parseInt(sLIneTemp.substring(0, 2));
            System.out.println(lineTemp);
            if (lineTemp >= highestTemp){
                highestTemp  = lineTemp;
            }
            if (lineTemp <= lowestTemp ){
                lowestTemp = lineTemp;
            }
        }
        System.out.println("Highest Temp:" + Integer.toString(highestTemp));
        System.out.println("Lowest Temp:" + Integer.toString(lowestTemp ));
    }
}







