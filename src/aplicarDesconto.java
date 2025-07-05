import java.util.Scanner;
public class aplicarDesconto {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                ***************************************
                * SISTEMA PARA APLICAÇÃO DE DESCONTOS *
                ***************************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                   SISTEMA PARA APLICAÇÃO DE DESCONTOS
                ***************************************************************************
                
                Este sistema consiste em avaliar se o valor digitado pode ou não receber 
                10% de desconto a fim de estudos do if e else.
                
                ***************************************************************************
                                             CÓDIGO PRINCIPAL:
                ***************************************************************************
                    System.out.println("Digite o valor:");
                    Double valor = leitura.nextDouble();
                    Double desconto = valor * 10/100;
                    Double valorComDesconto = valor - desconto;
                    if(valor > 100){
                        System.out.println("O cliente possui 10% de desconto!
                        \\nValor Total: R$ " + valorComDesconto + "
                        \\nEconomia de R$ "+ desconto);
                    }else{
                        System.out.println("O cliente não possui desconto!
                        \\nValor Total: R$ "+ valor);
                    }
                ***************************************************************************
                """;

        System.out.println(mensagem);
        while (true){
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg){
                case 1:
                    System.out.println("Digite o valor:");
                    Double valor = leitura.nextDouble();
                    Double desconto = valor * 10/100;
                    Double valorComDesconto = valor - desconto;
                    if(valor > 100){
                        System.out.println("O cliente possui 10% de desconto!\nValor Total: R$ " + valorComDesconto + "\nEconomia de R$ "+ desconto);
                    }else{
                        System.out.println("O cliente não possui desconto!\nValor Total: R$ "+ valor);
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




