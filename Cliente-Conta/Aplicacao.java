public class Aplicacao {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.nome = "Jean";
        c1.endereco = "Rua txurusbangos";
        c1.cpf = "156.456.889-94";

        Conta conta1 = new Conta();
        conta1.saldo = 1000.0;
        conta1.limite = 5000.0;
        conta1.nome = "Poupança";
        conta1.numero = 1234;
        conta1.cliente = c1;

        conta1.depositar(2000.0);
        System.out.println(conta1.sacar(500.0));

        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 100.0;
        conta2.limite = 50000.0;
        conta2.nome = "Corrente";
        conta2.numero = 5678;
        conta2.cliente = c1;

        conta1.transferir(conta2, 1000.0);
        System.out.println("Saldo atual da conta 2 = " + conta2.saldo);
    }
}
