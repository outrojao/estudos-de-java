import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Tipos de variaveis
        char sexo;
        int idade;
        int soma = 3 + 9;
        sexo = 'M';
        idade = 17;
        boolean eAdmin;
        eAdmin = true;

        float divisor = (float) 5 / 2; /*cast*/

        // Condicionais
        String message = eAdmin && divisor > 3 ? "É adm" : "Não é adm";

        if(message == "É adm"){
            System.out.println("Você pode acessar");
        } else {
            System.out.println("Você não pode acessar");
        }

        // Manipulando strings
        String nome = "João";
        String outroNome = "joão";

        nome.toUpperCase(); //retorna a string toda em maisculo
        nome.toLowerCase(); // retorna a string toda em minusculo
        nome.length(); // retorna a quantidade de caracteres da string

        nome.equals(outroNome); // verifica se uma string é igual a outra validando também se estão em maisculo ou minusculo
        nome.equalsIgnoreCase(outroNome); // verifica se as strings sem iguais ignorando se estão em lowerCase ou upperCase
        nome.endsWith("o"); // verifica se uma string termina com alguma letra

        // Representando datas
        LocalDate date = LocalDate.now();

        Locale brasil = new Locale("pt", "BR");
        String dayOfWekk = date.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        LocalDateTime now = LocalDateTime.now();
        String saudacao;
        if(now.getHour() >= 0 && now.getHour() < 12){
            saudacao = "bom dia";
        } else if(now.getHour() >= 12 && now.getHour() < 18) {
            saudacao = "boa tarde";
        } else if(now.getHour() >= 18 && now.getHour() < 24){
            saudacao = "boa noite";
        } else {
            saudacao = "Olá.";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, dayOfWekk, saudacao.toUpperCase());

        // Laços numéricos
        for (int i = 1; i <= 10; i++){ // faz a tabuada do 1 ao 10
            for (int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d %n", i, j, i*j);
            }
        }

        for (int i = 0; i <= 100; i+=5){ // vai de 0 à 100 de 5 em 5
            System.out.println(i);
        }

        // Vetores
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int num : numeros) { // para cada int num em numeros o exiba no terminal
            System.out.println(num);
        }


        String[] letras = {"A", "B", "C", "D"};

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));


        int[] nums = {6, 8, 12, 4};
        int maior = nums[0];
        int menor = nums[0];
        int media = 0;

        for (int num : nums) {
            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

            media += num;
        }

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media / numeros.length);

        //Funções
        saudacao(nome);
        System.out.println(soma(2, 3));
    }

    public static void saudacao(String nomeParametro){
        System.out.println("Olá, " + nomeParametro);
    }

    public static int soma(int num1, int num2){
        return num1 + num2;
    }
}