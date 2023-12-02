package exercicio;

import java.util.Scanner;

public class exercicio7_1 {

    public static void main(String[] args){
        //Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        System.out.print("Digite o quarto número: ");
        int numero4 = entrada.nextInt();

        System.out.print("Digite o quinto número: ");
        int numero5 = entrada.nextInt();

        int maior1, maior2;

        if (numero1 > numero2) {
            maior1 = numero1;
            maior2 = numero2;
        } else {
            maior1 = numero2;
            maior2 = numero1;
        }

        if (numero3 > maior1) {
            maior2 = maior1;
            maior1 = numero3;
        } else if (numero3 > maior2) {
            maior2 = numero3;
        }

        if (numero4 > maior1) {
            maior2 = maior1;
            maior1 = numero4;
        } else if (numero4 > maior2) {
            maior2 = numero4;
        }

        if (numero5 > maior1) {
            maior2 = maior1;
            maior1 = numero5;
        } else if (numero5 > maior2) {
            maior2 = numero5;
        }


        int soma = maior1 + maior2;
        System.out.println("A soma dos dois maiores números é: " + soma);


    }
}
