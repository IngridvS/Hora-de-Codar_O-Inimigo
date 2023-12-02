package exercicio;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args){
        //Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        int Maiores;

        if (numero1 > numero2 && numero1 > numero3) {
            Maiores = numero1 + Math.max(numero2, numero3);
        } else if (numero2 > numero1 && numero2 > numero3) {
            Maiores = numero2 + Math.max(numero1, numero3);
        } else {
            Maiores = numero3 + Math.max(numero1, numero2);
        }

        System.out.println("A soma dos dois maiores números é: " + Maiores);

    }
}
