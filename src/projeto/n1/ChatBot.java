package projeto.n1;

public class ChatBot {
    
    private String resposta[];
    private int c;
    
    public ChatBot() {
        
        this.resposta = null;
        this.c = 50;
        
    }
    
    public void adiciona(Resposta r) {
        
        for(int i = 0; i > c; i++) {
            
            this.resposta[c] = r.toString();
            
        }
        
    }
    public void processar(String texto) {
        
        
        
    }
}
