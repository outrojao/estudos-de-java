public class TesteCondicional {
    public static void main (String[] args){
        System.out.println("Testando condicionais");

        int idade = 20;
        int qntdPessoas = 3;

        if (idade > 18){
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (qntdPessoas >= 2) {

            } else {
                System.out.println("Infelizmente voce nao pode entrar");
            }
        }
    }
}
