package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Методы для обслуживания фреймворка
 */
public class FrameworkMaintenance {

    @Attachment(value = "screenshotOnFail" , type="image/png")
    public byte[] attachScreenshotOnFail() {
        final byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
        return screenshot;
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        getWebDriver().quit();

    }
}
