package azzalin.conrado.pedra_papel_tesoura_2.models.classico;

import azzalin.conrado.pedra_papel_tesoura_2.models.Jogada;
import azzalin.conrado.pedra_papel_tesoura_2.models.bazinga.Lagarto;
import azzalin.conrado.pedra_papel_tesoura_2.models.bazinga.Spock;

public class Papel extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Spock()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    };
    }
    @java.lang.Override
    public String toString(){
        return "Papel";
    }
}