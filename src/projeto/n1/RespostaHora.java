package projeto.n1;

import java.util.Calendar;

public class RespostaHora extends Resposta {

    public RespostaHora(String entrada) {

        super(entrada);

    }

    @Override
    public boolean verifica(String hora) {

        String palavras[] = hora.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].equals(entrada)) {

                return true;

            }

        }

        return false;

    }

    @Override
    public String produz() {

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);

        return "Agora são " + hora + "h" + ":" + min + "min";

    }

}
