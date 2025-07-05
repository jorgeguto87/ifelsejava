import java.util.Scanner;
public class permissaoAcesso {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                ************************************
                * SISTEMA PARA PERMISSÃO DE ACESSO *
                ************************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                       SISTEMA PARA PERMISSÃO DE ACESSO
                ***************************************************************************
                
                Este sistema consiste em comparar o código de acesso e o nível de acesso
                permitindo ou não o acesso além de informar o motivo caso os valores não
                corresponderem as credenciais válidas pelo sistema, a fim de estudos do if 
                e else.
                
                ***************************************************************************
                                              CÓDIGO PRINCIPAL:
                ***************************************************************************
                    System.out.println("Digite o código de acesso");
                    int codigo = leitura.nextInt();
                    System.out.println("Digite o nível de permissão:");
                    int nivel = leitura.nextInt();
                    boolean codigoAcesso = codigo == 2023;
                    boolean nivelAcesso = (nivel == 1 || nivel == 2 || nivel == 3);
                    if(!codigoAcesso){
                        System.out.println("***ACESSO NEGADO***
                        \\nMotivo: Código de acesso inválido!");
                    }else if(!nivelAcesso){
                        System.out.println("***ACESSO NEGADO***
                        \\nMotivo: Nível de acesso inválido!");
                    }else{
                        System.out.println("***ACESSO PERMITIDO!***");
                    }
                ***************************************************************************
                """;

        System.out.println(mensagem);
        while (true){
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg){
                case 1:
                    System.out.println("Digite o código de acesso");
                    int codigo = leitura.nextInt();
                    System.out.println("Digite o nível de permissão:");
                    int nivel = leitura.nextInt();
                    boolean codigoAcesso = codigo == 2023;
                    boolean nivelAcesso = (nivel == 1 || nivel == 2 || nivel == 3);
                    if(!codigoAcesso){
                        System.out.println("***ACESSO NEGADO***\nMotivo: Código de acesso inválido!");
                    }else if(!nivelAcesso){
                        System.out.println("***ACESSO NEGADO***\nMotivo: Nível de acesso inválido!");
                    }else{
                        System.out.println("***ACESSO PERMITIDO!***");
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



