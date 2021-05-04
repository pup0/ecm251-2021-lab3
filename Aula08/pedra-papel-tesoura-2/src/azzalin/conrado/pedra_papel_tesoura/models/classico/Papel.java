package azzalin.conrado.pedra_papel_tesoura.models.classico;

import azzalin.conrado.pedra_papel_tesoura.models.Jogada;
import azzalin.conrado.pedra_papel_tesoura.models.bazinga.Lagarto;
import azzalin.conrado.pedra_papel_tesoura.models.bazinga.Spock;

public class Papel extends Jogada {

    @java.lang.Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Spock);
    }

    @java.lang.Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Lagarto);
    }
    @java.lang.Override
    public String toString(){
        return "Papel";
    }
}