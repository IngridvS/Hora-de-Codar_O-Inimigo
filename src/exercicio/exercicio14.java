package exercicio;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args){

        //Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado
        // novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

        Scanner entrada = new Scanner(System.in);
        int aprovados = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.next();

            System.out.print("Digite a nota 1: ");
            double nota1 = entrada.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = entrada.nextDouble();

            System.out.print("Digite a nota 3: ");
            double nota3 = entrada.nextDouble();

            System.out.print("Digite a nota 4: ");
            double nota4 = entrada.nextDouble();

            System.out.print("Digite a nota 5: ");
            double nota5 = entrada.nextDouble();

            System.out.print("Digite a nota 6: ");
            double nota6 = entrada.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6.0;


            if (media >= 6.5) {
                System.out.printf("%.1f\n", media);
                System.out.println(nome + " aprovado!");
                aprovados++;
            } else  {
                System.out.println(nome + " em recuperação");
            }

            System.out.println("Calcular a média de outro aluno Sim/Não?");
            resposta = entrada.next();
        } while (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("sim"));

        System.out.println("Total de alunos aprovados: " + aprovados);
    }
}
