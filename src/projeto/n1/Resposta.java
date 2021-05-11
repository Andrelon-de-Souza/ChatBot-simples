package projeto.n1;

public abstract class Resposta {

    protected String entrada;

    public Resposta(String entrada) {

        this.entrada = entrada;

    }

    public abstract boolean verifica(String entrada);

    public abstract String produz();

}
