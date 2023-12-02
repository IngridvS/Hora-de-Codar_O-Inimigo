package exercicio;

public class exercicio15 {

    public static void main(String[] args){
        // Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3
        // centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que
        // Felisberto seja maior que Anacleto.

        //Anacleto
        int alturaA = 150;
        int crescimentoA = 2;

        //Felisberto
        int alturaF = 110;
        int crescimentoF = 3;

        int anos = 0;

        while (alturaF <= alturaA) {
            alturaA += crescimentoA;
            alturaF += crescimentoF;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");
    }
}
