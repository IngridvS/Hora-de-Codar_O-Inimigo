package exercicio;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args){
        /*Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba
         os números informados e escreva a média aritmética desses valores lidos.*/

        Scanner entrada = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + " valor: ");
            valores[i] = entrada.nextDouble();
            soma += valores[i];
        }

        System.out.println("\n Números informados:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        double media = soma / 10;
        System.out.println("\n\n Média Aritmética: " + media);

    }
}
