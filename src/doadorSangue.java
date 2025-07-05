import java.util.Scanner;
public class doadorSangue {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                *******************************************
                * SISTEMA PARA AUTORIZAR DOADOR SANGUÍNEO *
                *******************************************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ***************************************************************************
                                   SISTEMA PARA AUTORIZAR DOADOR SANGUÍNEO
                ***************************************************************************
                
                Este sistema consiste em avaliar a idade e o peso verificando se os dados
                informados correspondem a um doador válido, a fim de estudos do if e else.
                
                ***************************************************************************
                                             CÓDIGO PRINCIPAL:
                ***************************************************************************
                    System.out.println("Digite a idade do doador:");
                    int idade = leitura.nextInt();
                    System.out.println("Digite o peso do doador:");
                    int peso = leitura.nextInt();
                    boolean idadeValida = idade >= 18 && idade <= 65;
                    boolean pesoValido = peso >= 50;
                    if(!idadeValida){
                        System.out.println("O doador não é compatível:
                        \\nMotivo: A idade deve ser entre 18 e 65 anos.");
                    }else if(!pesoValido){
                        System.out.println("O doador não é compatível:
                        \\nMotivo: O peso deve ser igual ou superior a 50kg.");
                    }else{
                        System.out.println("***DOADOR COMPATÍVEL!***");
                    }
                ***************************************************************************
                """;

        System.out.println(mensagem);
        while (true){
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg){
                case 1:
                    System.out.println("Digite a idade do doador:");
                    int idade = leitura.nextInt();
                    System.out.println("Digite o peso do doador:");
                    int peso = leitura.nextInt();
                    boolean idadeValida = idade >= 18 && idade <= 65;
                    boolean pesoValido = peso >= 50;
                    if(!idadeValida){
                        System.out.println("O doador não é compatível:\nMotivo: A idade deve ser entre 18 e 65 anos.");
                    }else if(!pesoValido){
                        System.out.println("O doador não é compatível:\nMotivo: O peso deve ser igual ou superior a 50kg.");
                    }else{
                        System.out.println("***DOADOR COMPATÍVEL!***");
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



