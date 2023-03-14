public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(123, 456);
        contaCorrente.deposita(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(123, 123);
        contaPoupanca.deposita(200);


        contaCorrente.transfere(10, contaPoupanca);
        System.out.println("Conta Corrente " + contaCorrente.getSaldo());
        System.out.println("Conta Poupanca " + contaPoupanca.getSaldo());

    }
}
