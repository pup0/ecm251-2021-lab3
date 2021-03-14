package azzalin.conrado;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5a temporada ai!");
	//criar uma referência para a Conta
        Conta c1;
        //instanciar um objeto Conta
        c1 = new Conta();
        c1.cliente = new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;

        c1.visualizarSaldo();
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.cliente.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visualizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        if(c1.sacar(1000)) {
            System.out.println("Deu bom!");
        }else{
                System.out.println("Deu merda!!");
        }
        c1.visualizarSaldo();

        if(c1.transferirPara(100, c2)) {
            System.out.println("Transferiu!!");
        }else{
            System.out.println("Não transferiu!");
        }

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());

    }
}