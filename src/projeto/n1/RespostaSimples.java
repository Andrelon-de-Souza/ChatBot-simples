package projeto.n1;

public class RespostaSimples extends Resposta {

    private String resp;

    public RespostaSimples(String entrada, String resp) {

        super(entrada);
        this.resp = resp;

    }

    @Override
    public boolean verifica(String nome) {

        String palavras[] = nome.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            if (palavras[i].equals(entrada)) {

                return true;

            }

        }

        return false;

    }

    @Override
    public String produz() {

        return resp;

    }

}
