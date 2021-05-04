package azzalin.conrado.pedra_papel_tesoura_2.controladores;

import azzalin.conrado.pedra_papel_tesoura_2.models.*;
import azzalin.conrado.pedra_papel_tesoura_2.models.bazinga.Lagarto;
import azzalin.conrado.pedra_papel_tesoura_2.models.bazinga.Spock;
import azzalin.conrado.pedra_papel_tesoura_2.models.classico.Papel;
import azzalin.conrado.pedra_papel_tesoura_2.models.classico.Pedra;
import azzalin.conrado.pedra_papel_tesoura_2.models.classico.Tesoura;

import java.util.Random;

public class Sistema {
    private Jogador player1;
    private Jogador player2;
    private Scanner scanner;
    private final Jogada[] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura(), new Spock(), new Lagarto()};

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
        System.out.println("Escolha:");
        for(int i = 0; i < jogadas.length; i++){
            System.out.println(""+i+" - "+jogadas[i]);
        }
        escolha = scanner.nextInt();
        return jogadas[escolha];
    }

    private Jogada sortearJogada(){
        return jogadas[new Random().nextInt(jogadas.length)];
    }
}
