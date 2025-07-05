import java.util.Scanner;
public class equals {
    public static void executar() {


        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                *****************************************
                * SISTEMA COMPARATIVO DE NÚMEROS IGUAIS *
                *****************************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                   SISTEMA COMPARATIVO DE NÚMEROS IGUAIS
                ***************************************************************************
                
                Este sistema consiste em comparar se um número
                é igual ao outro a fim de estudos do if e else.
                
                ***************************************************************************
                                             CÓDIGO PRINCIPAL:
                ***************************************************************************
                
                System.out.println("Digite um número por favor:");
                                    int leituraUm = leitura.nextInt();
                                    System.out.println("Digite outro número por favor:");
                                    int leituraDois = leitura.nextInt();
                                    if (leituraUm != leituraDois) {
                                    System.out.println("Os números são diferentes");
                                    } else {
                                    System.out.println("Os números são iguais");
                
                                    }
                ***************************************************************************
                """;
        System.out.println(mensagem);

        while (true) {
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg) {
                case 1:
                System.out.println("Digite um número por favor:");
                int leituraUm = leitura.nextInt();
                System.out.println("Digite outro número por favor:");
                int leituraDois = leitura.nextInt();
                if (leituraUm != leituraDois) {
                    System.out.println("Os números são diferentes");
                } else {
                    System.out.println("Os números são iguais");

                }
                break;
                case 2:
                    System.out.println(readme);
                    break;
                case 0:
                    System.out.println("Até a próxima...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
