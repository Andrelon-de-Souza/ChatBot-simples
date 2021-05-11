package projeto.n1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RespostaData extends Resposta {

    public RespostaData(String entrada) {

        super(entrada);

    }

    @Override
    public boolean verifica(String data) {

        String palavras[] = data.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].equals(entrada)) {

                return true;

            }

        }

        return false;

    }

    @Override
    public String produz() {

        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        return "Hoje é dia " + data.format(date);

    }

}
