package projeto.n1;

public class ChatBot {
    
    protected String resposta[];
    protected int c;
    protected RespostaSimples simples;
    protected RespostaData data;
    protected RespostaHora hora;
    protected RespostaContador contador;
    protected RespostaAleatoria piada;
    
    public ChatBot() {
        
        this.resposta = null;
        this.c = 50;
        
    }
    
    public void adiciona(Resposta r) {
        
        for(int i = 0; i > c; i++) {
            
            this.resposta[c] = r.toString();
            
        }
        
    }
    public String processar(String texto) {
        
        if(simples.verifica(texto)) {
            
            return simples.produz();
            
        } else if(data.verifica(texto)) {
            
            return data.produz();
            
        }else if(hora.verifica(texto)) {
            
            return hora.produz();
            
        } else if(contador.verifica(texto)) {
            
            return contador.produz();
            
        } else if(piada.verifica(texto)) {
            
            return piada.produz();
            
        }else {
            
            System.out.println("Desculpa, não entendi! :(");
            return "";
            
        }
                
}
    
}
