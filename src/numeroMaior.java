import java.util.Scanner;
public class numeroMaior {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                **********************************
                * SISTEMA DE COMPARAÇÃO NUMÉRICA *
                **********************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                       SISTEMA DE COMPARAÇÃO NUMÉRICA
                ***************************************************************************
                
                Este sistema consiste em comparar dois valores numéricos, informando qual
                número é maior e se os números são iguais, a fim de estudos do if e else.
                
                ***************************************************************************
                                             CÓDIGO PRINCIPAL:
                ***************************************************************************
                    System.out.println("Digite o primeiro número:");
                    int numUm = leitura.nextInt();
                    System.out.println("Digite o segundo número:");
                    int numDois = leitura.nextInt();
                
                    if(numUm == numDois){
                        System.out.println("Resultado!\\nOs números "+numUm+" e "+numDois+"
                        \\nSão iguais!");
                    }else if (numUm > numDois){
                        System.out.println("Resultado!\\nO número "+numUm+"
                        \\nÉ maior que "+numDois);
                    }else{
                        System.out.println("Resultado!\\nO número "+numDois+"
                        \\nÉ maior que "+numUm);
                    }
                ***************************************************************************
                """;


        System.out.println(mensagem);
        while (true){
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg){
                case 1:
                    System.out.println("Digite o primeiro número:");
                    int numUm = leitura.nextInt();
                    System.out.println("Digite o segundo número:");
                    int numDois = leitura.nextInt();

                    if(numUm == numDois){
                        System.out.println("Resultado!\nOs números "+numUm+" e "+numDois+"\nSão iguais!");
                    }else if (numUm > numDois){
                        System.out.println("Resultado!\nO número "+numUm+"\nÉ maior que "+numDois);
                    }else{
                        System.out.println("Resultado!\nO número "+numDois+"\nÉ maior que "+numUm);
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


