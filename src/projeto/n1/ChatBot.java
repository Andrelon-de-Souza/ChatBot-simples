package projeto.n1;

import java.util.ArrayList;

public class ChatBot {

    ArrayList<Resposta> resposta;

    public ChatBot() {

        resposta = new ArrayList<>();

    }

    public void adiciona(Resposta r) {

        resposta.add(r);

    }

    public String processar(String texto) {

        for (Resposta r : resposta) {

            if (r.verifica(texto)) {

                String resp = r.produz();
                return resp;

            }

        }

        return "Desculpa, não entendi! :(";

    }
}
