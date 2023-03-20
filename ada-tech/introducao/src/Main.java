public class Main {
    public static void main(String[] args) {
        // String nome;
        // char sexo;
        // int idade;
        // int soma = 3 + 9;

        // nome = "João";
        // sexo = 'M';
        // idade = 17;

        boolean eAdmin;
        eAdmin = true;

        float divisor = (float) 5 / 2; /*cast*/

        String message = eAdmin && divisor > 3 ? "É adm" : "Não é adm";

        System.out.println(message);
    }
}