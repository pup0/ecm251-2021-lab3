package azzalin.conrado;

import java.util.Random;

public class Dado {
    private int numeroLados;
    private int faceAtual;
    private int[] FACES;


    public Dado(int numeroLados){
        this.numeroLados = numeroLados;
        FACES = new int[this.numeroLados];
        for(int i = 0;i < this.numeroLados; i++){
            FACES[i] = i+1;
        }
        lancarDado();
    }

    private void lancarDado(){
        Random random = new Random();
        this.faceAtual = random.nextInt(this.numeroLados);
    }
    public int lerFaceAtual(){
        return FACES[this.faceAtual];
    }

    public int lancarDadoELerFace(){
        lancarDado();
        return lerFaceAtual();
    }
}

