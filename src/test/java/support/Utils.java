package support;

import java.util.Random;
import runner.RunCucumber;

import java.util.Random;

public class Utils extends RunCucumber {

    static Random random = new Random();

    public static String getRandomEmail() {
        String email_init = "luan_";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String geraSenhaRamdom(){
        String senhaInit = "S3";
        String senhaFinal = "Nh@";

        Random random = new Random();
        int minimo = 1980;
        int maximo = 2022;

        int resultado = random.nextInt(maximo-minimo);

        return senhaInit + resultado + senhaFinal;
    }

    public static String geraNomeRandom(){

        String[] names = {"Eduardo Lucas da Silva", "Sandra Maria de Jesus", "José Henrrique de Anchieta", "Luciana Marques de Paula", "Fernando Nunes da Rocha",
                "Lucas Silva Rodrigues", "Maria Antonierta Santos", "Matheus Crause Barcelos", "Lenadro Barreto Martins", "Fernanda Cowskine de Paula"};

        int minimo = 0;
        int maximo = (names.length) - 1;

        int posicao = random.nextInt(maximo-minimo) + minimo;

        return names[posicao];
    }

    public static String geraNumeroCelular(boolean comPontos){
        String numerosConcatenados;
        //numeros gerados
        String DDD = "27";
        String operadora = "99";
        int n1 = random.nextInt(10);
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);
        int n4 = random.nextInt(10);
        int n5 = random.nextInt(10);
        int n6 = random.nextInt(10);
        int n7 = random.nextInt(10);

        if (comPontos){
            numerosConcatenados = "(" + DDD + ")" + operadora + n1 + n2 + n3 + "-" + n4 + n5 + n6 + n7;
        }else{
            numerosConcatenados = DDD + operadora + n1 + n2 + n3 + n4 + n5 + n6 + n7;
        }

        return numerosConcatenados;
    }
}
