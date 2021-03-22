package azzalin.conrado;

import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Scanner scanner;
    private Conta conta;


    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
        this.conta = new Conta(1236, 1000, "Toad");
        

    }

    public void executar(){
            while(continuarExecucao){
                exibirMenu();
                int opcao = scanner.nextInt();
                avaliarOpcao(opcao);
            }

        }

    private void avaliarOpcao(int opcao) {
        switch(opcao){
            case 0:
                System.out.println("Obrigado por ter utilizado nosso sistema!");
                this.continuarExecucao = false;
                break;
            default:
                System.out.println("Funcionalidade ainda não implementada");
                break;

        }
    }

    private void exibirMenu() {
        System.out.println("Bem Vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar Dinheiro");
        System.out.println("3 - Sacar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar Títutlo");
        System.out.println("6 - Sair do Sistema");

    }
}
