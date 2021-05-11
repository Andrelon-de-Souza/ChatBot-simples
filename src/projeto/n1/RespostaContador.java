package projeto.n1;

import java.util.ArrayList;

public class RespostaContador extends Resposta {

    private int contador;

    public RespostaContador(String entrada) {

        super(entrada);
        this.contador = 0;

    }

    @Override
    public boolean verifica(String conta) {

        String palavras[] = conta.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].equals(entrada)) {

                contador++;
                return true;

            }

        }

        return false;

    }

    @Override
    public String produz() {

        return "A conta atualmente está em " + contador;

    }

}
