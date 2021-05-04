package azzalin.conrado.pedra_papel_tesoura.models.bazinga;

import azzalin.conrado.pedra_papel_tesoura.models.Jogada;
import azzalin.conrado.pedra_papel_tesoura.models.classico.Papel;
import azzalin.conrado.pedra_papel_tesoura.models.classico.Tesoura;

public class Spock extends Jogada {

    @java.lang.Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @java.lang.Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @java.lang.Override
    public String toString(){
        return "Spock";
    }
}
