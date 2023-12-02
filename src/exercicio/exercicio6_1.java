package exercicio;

import java.util.Scanner;

public class exercicio6_1 {

    public static void main(String[] args){
        //Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.


        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        System.out.println("Digite o quarto numero:");
        int numero4 = entrada.nextInt();

        int maior1, maior2, maior;

        if (numero > numero2) {
            maior1 = numero;
        }
        else{
            maior1 = numero2;
        }

        if (numero3 > numero4){
            maior2 = numero3;
        }
        else {
            maior2 = numero4;
        }
        if (maior1 > maior2){
            maior = maior1;
        }
        else{
            maior = maior2;
        }
        System.out.println("O número " + maior + " é maior");

    }
}
