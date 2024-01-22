package Holidayzer;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um data no formato dd-mm-aaaa: ");
        String dataInserida = scanner.nextLine();

        scanner.close();

        ArrayList<Feriado> arrayFeriados = new ArrayList<>();

        String[] datas = {"01-01-2024",
        "12-02-2024",
        "13-02-2024",
        "29-03-2024",
        "21-04-2024",
        "01-05-2024",
        "30-05-2024",
        "07-09-2024",
        "12-10-2024",
        "02-11-2024",
        "15-11-2024",
        "20-11-2024",
        "25-12-2024"};
        String[] nomeDosFeriados = { "Confraternização Mundial",
        "Carnaval",
        "Carnaval",
        "Sexta-feira Santa",
        "Tiradentes",
        "Dia do Trabalho",
        "Corpus Christi",
        "Independência do Brasil",
        "Nossa Senhora Aparecida",
        "Finados",
        "Proclamação da República",
        "Dia Nacional de Zumbi e da Consciência Negra",
        "Natal"};

        for (int i = 0; i < 12; i++) {
            Feriado feriadosDoAno = new Feriado(datas[i], nomeDosFeriados[i]);
            arrayFeriados.add(feriadosDoAno);
        }

        for (Feriado feriado : arrayFeriados) {
            String data = feriado.getDate();
            if(data.equals(dataInserida)){
                System.out.println(feriado);
            }
        }
        
    }
}
