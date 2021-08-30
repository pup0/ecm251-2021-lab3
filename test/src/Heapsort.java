public class Heapsort {

    private static int tam;

    private static int[] vetor;



    public static void heapsort(int[] array) {

        vetor = array;

        tam = vetor.length - 1;



        constroiHeap();



        for (int i = tam; i > 0; i--) {

            troca(0, tam);

            tam -= 1;

            maxHeapifica(0);

        }

    }



    private static void constroiHeap() {

        int meio = (tam/2);



        for (int i = meio - 1; i >= 0; i--) {

            maxHeapifica(i);

        }

    }



    private static void troca(int i, int j) {

        int aux;

        aux = vetor[i];

        vetor[i] = vetor[j];

        vetor[j] = aux;

    }



    private static void maxHeapifica(int pai) {

        int maior = pai,

                esquerda = 2 * pai + 1,

                direita = 2 * pai + 2;



        if (esquerda <= tam && vetor[esquerda] > vetor[maior])

            maior = esquerda;



        if (direita <= tam && vetor[direita] > vetor[maior])

            maior = direita;



        if (maior != pai) {

            troca(pai, maior);

            maxHeapifica(maior);

        }

    } public static void main(String[] args) {

        int[] vetorDesordenado = {9, 1, 8, 3, 7, 4, 6, 5};



        heapsort(vetorDesordenado);

        String saida = "";



        for(int valor: vetorDesordenado) {

            saida += valor + " ";

        }

        System.out.println(saida);

    }

}

