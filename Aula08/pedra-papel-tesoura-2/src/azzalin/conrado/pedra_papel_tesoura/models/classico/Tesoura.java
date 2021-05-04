package azzalin.conrado.pedra_papel_tesoura.models.classico;

import azzalin.conrado.pedra_papel_tesoura.models.Jogada;

public class Tesoura extends Jogada {

    @java.lang.Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @java.lang.Override
    public boolean verificaSePerdi(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @java.lang.Override
    public String toString(){
        return "Tesoura";
    }
}