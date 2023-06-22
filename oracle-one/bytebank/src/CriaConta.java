public class CriaConta {

  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;
    System.out.println("A primeira conta possuia: " + primeiraConta.saldo);

    primeiraConta.saldo += 100;
    System.out.println("Agora possui: " + primeiraConta.saldo);

    Conta segundaConta = new Conta();
    segundaConta.saldo = 500;
    System.out.println("A segunda conta possui: " + segundaConta.saldo);
  }
}
