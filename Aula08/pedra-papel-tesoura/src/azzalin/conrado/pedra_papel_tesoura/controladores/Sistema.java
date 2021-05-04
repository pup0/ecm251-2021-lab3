package azzalin.conrado.pedra_papel_tesoura.controladores;

import azzalin.conrado.pedra_papel_tesoura.models.*;
import azzalin.conrado.pedra_papel_tesoura.models.classico.Papel;
import azzalin.conrado.pedra_papel_tesoura.models.classico.Pedra;
import azzalin.conrado.pedra_papel_tesoura.models.classico.Tesoura;

import java.util.Random;

public class Sistema {
    private Jogador player1;
    private Jogador player2;
    private Scanner scanner;
    private final Jogada[] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};

    public Sistema(){
        this.scanner = new Scanner(System.in);
        InicializaPlayers();
    }

    private void InicializaPlayers(){
        System.out.println("Informe seu nome:");
        String nome = scanner.next();
        this.player1 = new Jogador(nome, true);
        this.player2 = new Jogador("Cid");
    }

    public void run(){
        while(true){
            System.out.println(player1 + " vs "+player2);
            player1.setJogada(selecionarJogada());
            player2.setJogada(sortearJogada());
            System.out.println("Jogadas:");
            System.out.println(player1+":"+player1.getJogada());
            System.out.println(player2+":"+player2.getJogada());
            System.out.println("Resultado:" + player1.getJogada().verificaResultado(player2.getJogada()));
        }
    }

    private Jogada selecionarJogada(){
        int escolha;
        System.out.println("Escolha:\n0 - Pedra\n1 - Papel\n2 - Tesoura");
        escolha = scanner.nextInt();
        Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};
        return jogadas[];
    }

    private Jogada sortearJogada(){
        return jogadas[new Random().nextInt(jogadas.length)];
    }
}
