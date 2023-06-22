public class TesteMetodos {

  public static void main(String[] args) {
    Conta contaDoJoao = new Conta();
    contaDoJoao.deposita(50);
    System.out.println(contaDoJoao.saldo);

    boolean conseguiuSacar = contaDoJoao.saca(30);
    System.out.println(conseguiuSacar);
    System.out.println(contaDoJoao.saldo);

    Conta contaDaRaissa = new Conta();

    boolean conseguiuTransferir = contaDoJoao.transfere(20, contaDaRaissa);
    System.out.println(conseguiuTransferir);
    System.out.println(contaDaRaissa.saldo);
    System.out.println(contaDoJoao.saldo);
  }
}
