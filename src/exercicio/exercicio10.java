package exercicio;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args){
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a
        // média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0
        // a média mínima para aprovação e 4 notas informadas)

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota da primeira: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a nota da segunda: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a nota da terceira: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Digite a nota da quarta: ");
        double nota4 = entrada.nextDouble();


        double media = (nota1 + nota2 + nota3 + nota4) / 4;


        if (media >= 6.0) {
            System.out.println("Média do semestre: " + media);
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println(" Você não foi aprovado.");
        }
    }
}

