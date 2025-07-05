import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class diaUtil {
    public static void executar() {
        Scanner leitura = new Scanner(System.in);

        String mensagem = """
                **********************
                * SISTEMA DO DIA ÚTL *
                **********************
                """;
        String menu = """
               | [1] - Para iniciar |
               | [2] - Readme       |
               | [0] - Para Sair    |
               """;

        String readme = """
                ******************************************************************************
                                               SISTEMA DO DIA ÚTL
                ******************************************************************************
                
                Este sistema consiste em avaliar se o nome do dia digitado corresponde a 
                um dia útil ou fim de semana a fim de estudos do if e else.
                
                ******************************************************************************
                                                CÓDIGO PRINCIPAL:
                ******************************************************************************
                String[] diaUtil = {
                "segunda",
                "terça",
                "quarta",
                "quinta",
                "sexta"
                };
                String[] fimDSemana = {
                "sábado",
                "domingo"
                };
                System.out.println("Digite um dia da semana em letras minúsculas por favor:");
                    String dia = leitura.next();
                    if(Arrays.asList(diaUtil).contains(dia)){
                        System.out.println("O dia "+dia+" corresponde a um dia útil.");
                    }else if(Arrays.asList(fimDSemana).contains(dia)){
                        System.out.println("O dia "+dia+" corresponde a um fim de semana.");
                    }
                    else{
                        System.out.println("O nome "+dia+" não corresponde a um dia válido.");
                    }
                
                ******************************************************************************
                """;

        String[] diaUtil = {
                "segunda",
                "terça",
                "quarta",
                "quinta",
                "sexta"
        };
        String[] fimDSemana = {
                "sábado",
                "domingo"
        };
        System.out.println(mensagem);
        while (true){
            System.out.println(menu);
            int msg = leitura.nextInt();
            switch (msg){
                case 1:
                    System.out.println("Digite um dia da semana em letras minúsculas por favor:");
                    String dia = leitura.next();
                    if(Arrays.asList(diaUtil).contains(dia)){
                        System.out.println("O dia "+dia+" corresponde a um dia útil.");
                    }else if(Arrays.asList(fimDSemana).contains(dia)){
                        System.out.println("O dia "+dia+" corresponde a um fim de semana.");
                    }
                    else{
                        System.out.println("O nome "+dia+" não corresponde a um dia válido.");
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



