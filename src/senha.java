import java.util.Objects;
import java.util.Scanner;

public class senha {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagemPrincipal = """
                *******************************
                * BEM VINDO AO NOSSO SISTEMA! *
                *******************************
                """;

        String menu = """
                | [1] - Cadastrar e Fazer Login |
                | [2] - Readme                  |
                | [0] - Sair                    |
                """;

        String readme = """
                **********************************************************************
                                     SISTEMA DE SENHA COM TENTATIVAS
                **********************************************************************
                
                Este sistema permite ao usuário:
                - Cadastrar uma senha;
                - Tentar fazer login digitando a senha correta;
                - Após 3 tentativas incorretas, o sistema bloqueia o acesso;
                
                O sistema utiliza:
                - Comparação de Strings com `Objects.equals`;
                - Controle de fluxo com `if`, `else`, `switch`, e `while`;
                - Armazenamento temporário de senha apenas em tempo de execução;
                
                **********************************************************************
                                       FLUXO PRINCIPAL DO SISTEMA
                **********************************************************************
                    System.out.println("Digite uma senha:");
                    String msg = leitura.next();
                    ...
                    while (true) {
                        System.out.println("Digite a senha:");
                        String senha = leitura.next();
                        if (senha.equals(msg)) {
                            System.out.println("Login efetuado!");
                            break;
                        } else {
                            // tentar de novo ou bloquear
                        }
                    }
                **********************************************************************
                """;

        System.out.println(mensagemPrincipal);

        while (true) {
            System.out.println(menu);
            int opcao = leitura.nextInt();
            leitura.nextLine(); // consumir o \n

            switch (opcao) {
                case 1:
                    String cadastro = """
                            **************CADASTRO***************
                            Por favor, cadastre uma SENHA ABAIXO:
                            Tecle ENTER para confirmar.
                            """;

                    String entrar = """
                            \n**************LOGIN***************
                            Por favor insira sua SENHA ABAIXO:
                            Tecle ENTER para confirmar.
                            """;

                    System.out.println(cadastro);
                    String msg = leitura.nextLine();
                    System.out.println("Senha armazenada com sucesso.\n");

                    int maxTentativas = 3;
                    int tentativa = 0;

                    while (true) {
                        System.out.println(entrar);
                        String senha = leitura.nextLine();

                        if (Objects.equals(senha, msg)) {
                            System.out.println("Login efetuado com Sucesso!");
                            System.out.println("Obrigado pela sua visita!");
                            System.out.println("Até a próxima!");
                            break;
                        } else {
                            tentativa++;
                            System.out.println("SENHA INCORRETA\nTentativa " + tentativa + " de 3");

                            if (tentativa == maxTentativas) {
                                System.out.println("Você excedeu o número de tentativas!");
                                System.out.println("Tente novamente mais tarde!");
                                System.out.println("Tchau!");
                                break;
                            }
                        }
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
