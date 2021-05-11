package projeto.n1;

import java.util.ArrayList;
import java.util.Collections;

public class RespostaAleatoria extends Resposta {

    private ArrayList piadas;

    public RespostaAleatoria(String entrada, ArrayList<String> piadas) {

        super(entrada);
        this.piadas = piadas;

    }

    @Override
    public boolean verifica(String piada) {

        String palavras[] = piada.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].equals(entrada)) {

                return true;

            }

        }

        return false;

    }

    @Override
    public String produz() {

        Collections.shuffle(piadas);
        return "" + piadas.get(0);

    }

}
