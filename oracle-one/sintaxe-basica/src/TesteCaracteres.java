public class TesteCaracteres {
    public static void main (String[] args){
        char letra = 'a';
        System.out.println(letra);

        char valor = 65;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String frase = "O ano é ";
        String outraFrase = frase + 2023;
        System.out.println(outraFrase);
    }
}
