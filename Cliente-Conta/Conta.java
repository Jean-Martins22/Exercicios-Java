public class Conta {
    Cliente cliente;
    int numero;
    double saldo;
    double limite;
    String nome;

    boolean sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    void depositar(double valor){
        if(valor <= limite){
            saldo+= valor;
            System.out.println("Operação Concluida com Sucesso!\n" + "Saldo Atual:" + saldo);
        }
        else{
            System.out.println("Operação não foi efetuada! Valor é maior que o limite!");
        }
    }

    void transferir(Conta destino, double valor){
        if(valor <= saldo && valor > 0){
            destino.saldo += valor;
            saldo -= valor;
            System.out.println("Operação concluída com sucesso!\n" + "Saldo atual: " + saldo);
        }
        else{
            System.out.println("Impossível concluir a operação");
        }
    }

}