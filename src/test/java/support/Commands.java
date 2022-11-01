package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

public class Commands extends RunCucumber {
    public static void waitElementClickable(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementVisible(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void clickElement(By element){
        System.out.println("###############################################################");
        System.out.println("");
        try {
            System.out.println("************ Vai Clicar no elemento:" + element);
            waitElementClickable(element, 10000);
            getDriver().findElement(element).click();
            System.out.println("************ Clicou no elemento:" + element);
        } catch (Exception error){
            System.out.println("************ Aconteceu um Erro ao tentar clicar no elemento: " + element);
            System.out.println(error);
        }
        System.out.println("");
        System.out.println("###############################################################");

    }

    public static void fillField(By element, String value){
        System.out.println("###############################################################");
        System.out.println("");
        try {
            System.out.println("************ Vai preencher o campo:" + element);
            waitElementVisible(element, 10000);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("************ Preencgeu o Campp:" + element);
        } catch (Exception error){
            System.out.println("************ Aconteceu um Erro ao tentar preencher o campo: " + element);
            System.out.println(error);
        }
        System.out.println("");
        System.out.println("###############################################################");

    }

    public static void checkMessage(By element, String excpectedMessage) {
        String actualMessage = "";

        System.out.println("");
        System.out.println("###############################################################");
        System.out.println("");

        System.out.println("Vai validar mensagem:" + excpectedMessage);
        waitElementVisible(element, 10000);
        actualMessage = getDriver().findElement(element).getText();

        // Quando não der certo Vai quebrar o teste
        Assert.assertEquals("Erro ao Validar Mensagem!!!", excpectedMessage, actualMessage);
        // Quando não der certo Vai quebrar o teste

        System.out.println("Validou a  mensagem:" + excpectedMessage);

        System.out.println("");
        System.out.println("###############################################################");
        System.out.println("");

    }
}
