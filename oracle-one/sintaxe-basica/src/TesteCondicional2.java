public class TesteCondicional2 {
    public static void main (String[] args){
        System.out.println("Testando condicionais");

        int idade = 20;
        int qntdPessoas = 3;
        boolean acompanhado = qntdPessoas >= 2;

        if (idade > 18 || acompanhado){
            System.out.println("Seja bem vindo");
        } else {
                System.out.println("Infelizmente voce nao pode entrar");
        }

    }
}
