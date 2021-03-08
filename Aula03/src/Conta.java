public class Conta {
    int numero;
    double saldo;
    String titular;
    String cpf;

    void vizualizarSaldo() {
        System.out.println("Saldo da conta: R$" + this.saldo);
        }

        void depositar (double valor) {
            //this.saldo = this.saldo * valor;
            this.saldo += valor;
        }

        boolean sacar (double valor) {
            if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
            return false;
    }

        boolean transferirPara (double valor, Conta destino) {
            if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
            return false;
    }