import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String cabecalho = """
                ***********************************************
                INSTITUIÇÃO: ALURA.
                CURSO: PRATICANDO JAVA: CONDICIONAIS IF E ELSE.
                ALUNO: JORGE AUGUSTO NEVES OLIVEIRA
                ***********************************************
                """;

        String menuPrincipal = """
                ************************************************
                *                MENU PRINCIPAL                *
                ************************************************
                [1] Aplicar Desconto
                [2] Sistema de Números Iguais
                [3] Sistema de Média Escolar
                [4] Sistema do Número Maior
                [5] Sistema de Par ou Ímpar
                [6] Sistema de Login
                [7] Sistema do Dia Útil
                [8] Sistema Validador de Empréstimos
                [9] Sistema de Cálculo Triângular
                [10] Sistema de Validação para Doador Sanguíneo
                [11] Sistema para Permissão de Acesso
                [0] Sair
                ************************************************
                Escolha uma opção:
                """;
        System.out.println(cabecalho);

        while (true) {
            System.out.println(menuPrincipal);
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    aplicarDesconto.executar();
                    break;
                case 2:
                    equals.executar();
                    break;
                case 3:
                    mediaEscolar.executar();
                    break;
                case 4:
                    numeroMaior.executar();
                    break;
                case 5:
                    parOuImpar.executar();
                    break;
                case 6:
                    senha.executar();
                    break;
                case 7:
                    diaUtil.executar();
                    break;
                case 8:
                    validadorEmprestimo.executar();
                    break;
                case 9:
                    calculoTriangular.executar();
                    break;
                case 10:
                    doadorSangue.executar();
                    break;
                case 11:
                    permissaoAcesso.executar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    leitura.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
