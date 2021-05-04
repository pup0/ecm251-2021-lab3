package azzalin.conrado.pedra_papel_tesoura_2.models;

import azzalin.conrado.pedra_papel_tesoura_2.enumeracoes.Resultado;

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
    private boolean verificaSeGanhei(Jogada jogada){
        for(Jogada jogadaAtual:
        jogadasQueGanho()){
            if(jogadaAtual.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    }
    private boolean verificaSePerdi(Jogada jogada){
        for(Jogada jogadaAtual:
                jogadasQuePerco()){
            if(jogadaAtual.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    }

    public abstract Jogada[] jogadasQueGanho();
    public abstract Jogada[] jogadasQuePerco();
}
