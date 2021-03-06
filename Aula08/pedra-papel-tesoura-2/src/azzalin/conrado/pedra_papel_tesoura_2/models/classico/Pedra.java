package azzalin.conrado.pedra_papel_tesoura_2.models.classico;

import azzalin.conrado.pedra_papel_tesoura_2.models.Jogada;
import azzalin.conrado.pedra_papel_tesoura_2.models.bazinga.Lagarto;
import azzalin.conrado.pedra_papel_tesoura_2.models.bazinga.Spock;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Spock()};
    }

    @Override
    public String toString(){
        return "Pedra";
    }
}
