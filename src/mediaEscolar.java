import java.util.Scanner;
public class mediaEscolar {
    public static void executar() {
       Scanner leitura = new Scanner(System.in);
       String mensagem = """
                *****************************************
                * SISTEMA DE CÁLCULO PARA MÉDIA ESCOLAR *
                *****************************************
                         """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ****************************************************************************
                                   SISTEMA DE CÁLCULO PARA MÉDIA ESCOLAR
                ****************************************************************************
                
                Este sistema consiste em avaliar se o aluno está aprovado ou não, calculando
                a média de suas notas nos 4 bimestres, a fim de estudos do if e else.
                
                ****************************************************************************
                                             CÓDIGO PRINCIPAL:
                ****************************************************************************
                    System.out.println("Digite as 4 notas da matéria por favor.
                    \\nVamos começar?");
                    System.out.println("Digite a primeira nota:");
                    Double notaUm = leitura.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    Double notaDois = leitura.nextDouble();
                    System.out.println("Digite a terceira nota:");
                    Double notaTres = leitura.nextDouble();
                    System.out.println("Digite a quarta nota:");
                    Double notaQuatro = leitura.nextDouble();
                    Double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
                    if(media >= 7){
                        System.out.println("Parabéns!\\nSua média é: "+media+"
                        \\nVocê foi APROVADO!");
                    }else if (media >= 5 && media < 7){
                        System.out.println("Estude!\\nSua média foi: "+media+"
                        \\nVocê está de RECUPERAÇÃO!");
                    }else{
                        System.out.println("Poxa :(\\nSua média foi: "+media+"
                        \\nVocê foi REPROVADO!");
                    }
                ****************************************************************************
                """;

        System.out.println(mensagem);
        while (true){
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg){
                case 1:
                    System.out.println("Digite as 4 notas da matéria por favor.\nVamos começar?");
                    System.out.println("Digite a primeira nota:");
                    Double notaUm = leitura.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    Double notaDois = leitura.nextDouble();
                    System.out.println("Digite a terceira nota:");
                    Double notaTres = leitura.nextDouble();
                    System.out.println("Digite a quarta nota:");
                    Double notaQuatro = leitura.nextDouble();
                    Double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
                    if(media >= 7){
                        System.out.println("Parabéns!\nSua média é: "+media+"\nVocê foi APROVADO!");
                    }else if (media >= 5 && media < 7){
                        System.out.println("Estude!\nSua média foi: "+media+"\nVocê está de RECUPERAÇÃO!");
                    }else{
                        System.out.println("Poxa :(\nSua média foi: "+media+"\nVocê foi REPROVADO!");
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
