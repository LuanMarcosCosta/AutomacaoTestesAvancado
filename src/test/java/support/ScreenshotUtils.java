package support;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static runner.RunBase.getDriver;

public class ScreenshotUtils {
    public static void addScreenshotOnScenario(Scenario scenario){
        // A foto está em tipo array Byte, pego os dados e coloco na minha variável
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);

        // Aqui eu pego esse Byte e o converto em imagem passando os parâmetros
        scenario.embed(screenshot, "image/png");
    }
}
