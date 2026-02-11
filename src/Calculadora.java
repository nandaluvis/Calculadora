import java.util.Scanner;

public class Calculadora{

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora!");
        System.out.println("Digite um número de 1 a 4 para escolher a operação desejada de acordo com a tabela abaixo");
        System.out.println("1 = + (Soma)");
        System.out.println("2 = - (Subtração)");
        System.out.println("3 = x (Multiplicação)");
        System.out.println("4 = / (Divisão)");

         System.out.println("Digite um número de 1 a 4");

         int menu = scanner.nextInt();

        switch (menu){

                case 1:
                        System.out.println("Digite o primeiro número para realizar a operação");

                        double numeroEscolhidoSomaUm = scanner.nextDouble();

                        System.out.println("Digite o segundo número para realizar a operação");

                        double numeroEscolhidoSomaDois = scanner.nextDouble();

                        System.out.println("O resultado da soma é " + (numeroEscolhidoSomaUm + numeroEscolhidoSomaDois));
                        break;
                case 2:
                        System.out.println("Digite o primeiro número para realizar a operação");

                        double numeroEscolhidoMenosUm = scanner.nextDouble();

                        System.out.println("Digite o segundo número para realizar a operação");

                        double numeroEscolhidoMenosDois = scanner.nextDouble();

                        System.out.println("O resultado da subtração é " + (numeroEscolhidoMenosUm - numeroEscolhidoMenosDois));
                        break;
                case 3:
                        System.out.println("Digite o primeiro número para realizar a operação");

                        double numeroEscolhidoVezesUm = scanner.nextDouble();

                        System.out.println("Digite o segundo número para realizar a operação");

                        double numeroEscolhidoVezesDois = scanner.nextDouble();

                        System.out.println("O resultado da multiplicação é " + (numeroEscolhidoVezesUm * numeroEscolhidoVezesDois));
                        break;
                case 4:
                        System.out.println("Digite o primeiro número para realizar a operação");

                        double numeroEscolhidoDivideUm = scanner.nextDouble();

                        System.out.println("Digite o segundo número para realizar a operação");

                        double numeroEscolhidoDivideDois = scanner.nextDouble();

                        System.out.println("O resultado da divisão é " + (numeroEscolhidoDivideUm / numeroEscolhidoDivideDois));
                        break;
                default:
                        System.out.println("Número inválido. Digite de um número de 1 a 4");
        }

}
}