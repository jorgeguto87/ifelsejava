import java.util.Scanner;
public class parOuImpar {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                ***************************************
                * SISTEMA COMPARATIVO DE PAR OU ÍMPAR *
                ***************************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                    SISTEMA COMPARATIVO DE PAR OU ÍMPAR
                ***************************************************************************
                
                Este sistema consiste em comparar se um número
                é par ou ímpar a fim de estudos do if e else.
                
                ***************************************************************************
                                             CÓDIGO PRINCIPAL:
                ***************************************************************************                            
                
                System.out.println("Digite um número por favor:");
                                    int numero = leitura.nextInt();
                                    boolean par = (numero %2 == 0);
                                    if (par) {
                                        System.out.println("Os números informado é par.");
                                    } else {
                                        System.out.println("O número informado é ímpar.");
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
                    int numero = leitura.nextInt();
                    boolean par = (numero %2 == 0);
                    if (par) {
                        System.out.println("Os números informado é par.");
                    } else {
                        System.out.println("O número informado é ímpar.");
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

