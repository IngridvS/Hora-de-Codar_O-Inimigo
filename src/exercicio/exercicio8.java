package exercicio;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args){
        /*Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser
        lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
        O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.*/

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        double numero2;

        do {
            System.out.print("Digite o segundo número (o segundo número não pode ser zero ou negativo): ");
            numero2 = entrada.nextDouble();
        } while (numero2 <= 0);


        double resultado = numero1 / numero2;
        System.out.println("O resultado da divisão é: " + resultado);

    }
}
