package azzalin.conrado.pedra_papel_tesoura_2.models;

public class Jogador {
    private String nome;
    private boolean ehHumano;
    private Jogada jogada;

    public Jogador(String nome, boolean ehHumano) {
        this.nome = nome;
        this.ehHumano = ehHumano;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.ehHumano = false;
    }

    public String getNome() {
        if (isEhHumano())
            return nome;
        return "(BOT)" + nome;
    }

    public boolean isEhHumano() {
        return ehHumano;
    }

    @java.lang.Override
    public String toString() {
        return getNome();
    }

    public Jogada getJogada(){
        return jogada;
    }

    public void setJogada(Jogada jogada){
        this.jogada = jogada;
    }
}