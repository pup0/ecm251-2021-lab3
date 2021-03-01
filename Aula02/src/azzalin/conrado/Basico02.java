package azzalin.conrado;

public class Basico02 {
    //Estruturas de decisão
    public static void main(String[] args) {
        int ano = 2021;

//        //Estrutura de decisão simples               crtl + /
//        if (ano % 2 == 0) {
//            System.out.println("Ano par!");
//        }
//        if (ano % 2 == 1) {
//            System.out.println("Ano ímpar!");
//        }


//        //Estrutura de decisão composta
//        if(ano % 2 == 0){
//            System.out.println("Ano par!");
//        }else{
//            System.out.println("Ano ímpar!");
//        }


        //Várias decisões
        switch(ano){
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1996:
                System.out.println("Pokemon Red!");
                break;
            default:
                System.out.println("Quase Boku no Hero saindo");
                break;
        }
    }
}