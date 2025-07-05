import java.util.Scanner;

public class validadorEmprestimo {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagemPrincipal = """
                *****************************************
                * SISTEMA PARA VALIDAÇÃO DE EMPRÉSTIMOS *
                *****************************************
                """;

        String menu = """
                | [1] - Para Iniciar |
                | [2] - Readme       |
                | [0] - Para Sair    |
                """;

        String readme = """
                *****************************************************************************************
                                       SISTEMA PARA VALIDAÇÃO DE EMPRÉSTIMOS
                *****************************************************************************************

                Este sistema simula uma validação de empréstimo com base em um valor mínimo e máximo permitido.
                O usuário informa um valor desejado, e o sistema verifica se está dentro do intervalo aceito.

                Utiliza:
                - Leitura de dados com Scanner;
                - Comparação booleana com operadores relacionais;
                - Estrutura condicional if/else;
                - Controle de fluxo com switch e loop while.

                Intervalo aceito para empréstimo:
                - Valor mínimo: R$ 1000
                - Valor máximo: R$ 5000

                Exemplo do trecho principal:
                -------------------------------------------------------------------
                    System.out.println("Digite o valor do empréstimo:");
                    int valor = leitura.nextInt();
                    boolean valorValido = valor >= 1000 && valor <= 5000;

                    if (valorValido) {
                        System.out.println("***EMPRÉSTIMO CONCEDIDO***");
                    } else {
                        System.out.println("***EMPRÉSTIMO NEGADO***");
                    }
                -------------------------------------------------------------------

                *****************************************************************************************
                """;

        System.out.println(mensagemPrincipal);

        while (true) {
            System.out.println(menu);
            int msg = leitura.nextInt();

            switch (msg) {
                case 1:
                    System.out.println("Digite o valor do empréstimo:");
                    int valor = leitura.nextInt();
                    int valorMinimo = 1000;
                    int valorMaximo = 5000;
                    boolean valorValido = valor >= valorMinimo && valor <= valorMaximo;

                    if (valorValido) {
                        System.out.println("O valor solicitado: R$ " + valor);
                        System.out.println("Está dentro dos valores permitidos.");
                        System.out.println("***EMPRÉSTIMO CONCEDIDO***");
                    } else {
                        System.out.println("O valor solicitado: R$ " + valor);
                        System.out.println("Não está dentro dos valores permitidos.");
                        System.out.println("***EMPRÉSTIMO NEGADO***");
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
