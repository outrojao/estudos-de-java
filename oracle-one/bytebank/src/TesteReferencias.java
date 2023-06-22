public class TesteReferencias {

  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 300;

    Conta segundaConta = primeiraConta;
    System.out.println(segundaConta.saldo);

    segundaConta.saldo += 100;
    System.out.println(primeiraConta.saldo);

    //* as variávies "primeiraConta" e "segundaConta" nada mais são que referencias para o objeto conta que estamos criando, sendo assim estamos definindo duas referencias para um mesmo objeto.
    if (primeiraConta == segundaConta) {
      System.out.println("São a mesma conta");
    } else {
      System.out.println("São contas diferentes");
    }
  }
}
