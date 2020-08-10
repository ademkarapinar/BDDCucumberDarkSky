package runnerTest.webPages;

import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends ElementUtil{

    private By navigationButton = By.cssSelector(".currentLocationButton");
    private By todayBtn = By.xpath("//span[contains(text(),'Today')]");
    By firstTemp = By.xpath("((//*[@class='temps'])[2]/span)/span[contains(text(), '°')][1]");
    By allTemps = By.xpath("((//*[@class='temps'])[2]/span)/span[contains(text(), '°')]");


    public void clickNavigationButton() throws InterruptedException {
        clickOn(navigationButton);
        Thread.sleep(7000);
        scrollByPixel("0", "1000");

    }
    public void clickElementByJS() {
        WebElement element = webAction(todayBtn);
        JavascriptExecutor js = (JavascriptExecutor) BasePage.get();
        js.executeScript("arguments[0].click();", element);
    }
    public void verifyTemp() throws InterruptedException {
        Thread.sleep(3000);

        String stringFirstTemp = getTextFromElement(firstTemp);
        String text = stringFirstTemp.replaceAll("°", "");
        int intFirstTemp = Integer.parseInt(text);
        int lowest = intFirstTemp;
        int highest = intFirstTemp;
        List<WebElement> allDHourlyTemps = BasePage.get().findElements(allTemps);
        for (int i = 0; i < allDHourlyTemps.size(); i++) {
            String stringTepms = allDHourlyTemps.get(i).getText();
            String text1 = stringTepms.replaceAll("°", "");
            int intTemp = Integer.parseInt(text1);
            if (lowest > intTemp) {
                lowest = intTemp;
            }
            if (highest < intTemp) {
                highest = intTemp;
            }
        }
        System.out.println("Lowest " + lowest + "°");
        System.out.println("Highest " + highest + "°");
    }
}







