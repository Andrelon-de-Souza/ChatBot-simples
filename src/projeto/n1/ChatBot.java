package projeto.n1;

public class ChatBot {
    
    protected String resposta[];
    protected int c;
    protected Resposta resp;
    protected RespostaSimples simples;
    protected RespostaData data;
    protected RespostaHora hora;
    protected RespostaContador contador;
    protected RespostaAleatoria piada;
    
    public ChatBot() {
        
        this.resposta = null;
        this.c = 0;
        
    }
    
    public void adiciona(Resposta r) {
        
        for(int i = 0; i > c; i++) {
            
            this.resposta[i] = r.toString();
            
        }
        
    }
    public String processar(String texto) {
        
        if(resposta.equals("nome") == simples.verifica(texto)) {
        
            return simples.produz();
            
    } else if (resposta.equals("dia") == data.verifica(texto)) {
        
        return data.produz();
        
    } else if (resposta.equals("horas") == hora.verifica(texto)) {
        
        return hora.produz();
        
    } else if (resposta.equals("conta") == contador.verifica(texto)) {
        
        return contador.produz();
        
    } else if (resposta.equals("piada") == piada.verifica(texto)) {
        
        return piada.produz();
        
    } else {
        
        return "";
        
    }
    
    }
    
}
