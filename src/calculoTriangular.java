import java.util.Scanner;
public class calculoTriangular {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                *********************************
                * SISTEMA DE CÁLCULO TRIÂNGULAR *
                *********************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                       SISTEMA DE CÁLCULO TRIÂNGULAR
                ***************************************************************************
                
                Este sistema consiste em calcular as medidas um e dois, comparando se é
                maior ou não com a terceira, avaliando se as medidas formam ou não um
                triângulo válido a fim de estudos do if e else.
                
                ***************************************************************************
                                             CÓDIGO PRINCIPAL:
                ***************************************************************************
                System.out.println("Veja se a medida dos lados podem formar um triângulo.
                \\nVamos Começar?\\n");
                System.out.println("Digite a medida do primeiro lado");
                Double medida1 = leitura.nextDouble();
                System.out.println("Digite a medida do segundo lado");
                Double medida2 = leitura.nextDouble();
                System.out.println("Digite a medida do terceiro lado");
                Double medida3 = leitura.nextDouble();
                boolean calculoMedida = (medida1 + medida2) > medida3;
                if (calculoMedida) {
                   System.out.println("As medidas informadas podem formar um triângulo.");
                
                } else {
                System.out.println("As medidas informadas não podem formar um triângulo.");
                }
                ***************************************************************************
                """;
        System.out.println(mensagem);
        while(true) {
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg) {
                case 1:
                System.out.println("Veja se a medida dos lados podem formar um triângulo.\nVamos Começar?\n");
                System.out.println("Digite a medida do primeiro lado");
                Double medida1 = leitura.nextDouble();
                System.out.println("Digite a medida do segundo lado");
                Double medida2 = leitura.nextDouble();
                System.out.println("Digite a medida do terceiro lado");
                Double medida3 = leitura.nextDouble();
                boolean calculoMedida = (medida1 + medida2) > medida3;
                if (calculoMedida) {
                    System.out.println("As medidas informadas podem formar um triângulo.");

                } else {
                    System.out.println("As medidas informadas não podem formar um triângulo.");
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
