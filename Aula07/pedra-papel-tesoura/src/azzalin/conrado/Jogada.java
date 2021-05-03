package azzalin.conrado;

public class Jogada {
    public Resultado verificaResultado(Jogada jogada){
        if(verificaSeGanhei(jogada)){
            return Resultado.GANHEI;
        }
        if(verificaSePerdi(jogada)){
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }
    public boolean verificaSeGanhei(Jogada jogada){
        return true;
    }
    public boolean verificaSePerdi(Jogada jogada){
        return true;
    }
}
