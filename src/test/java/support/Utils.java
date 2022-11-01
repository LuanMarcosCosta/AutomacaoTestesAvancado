package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.util.Random;

public class Utils extends RunCucumber {

    public static String getRandomEmail() {
        String email_init = "luan_";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }
}
