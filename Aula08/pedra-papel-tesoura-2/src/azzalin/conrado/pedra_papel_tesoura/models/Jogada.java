package azzalin.conrado.pedra_papel_tesoura.models;

import azzalin.conrado.pedra_papel_tesoura.enumeracoes.Resultado;

public abstract class Jogada {
    final public Resultado verificaResultado(Jogada jogada){
        if(verificaSeGanhei(jogada)){
            return Resultado.GANHEI;
        }
        if(verificaSePerdi(jogada)){
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }
    public abstract boolean verificaSeGanhei(Jogada jogada);
    public abstract boolean verificaSePerdi(Jogada jogada);
}
