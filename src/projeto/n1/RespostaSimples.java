package projeto.n1;

public class RespostaSimples extends Resposta {
    
    protected String resp;
    
    public RespostaSimples(String entrada, String resp) {
        
        super(entrada);
        this.resp = resp;
        
    }
    @Override
    public boolean verifica(String entrada) {
        
        String palavras[] = entrada.split(" ");
        
        if(palavras.equals("nome")) {
        
        return true;
        
    }else{
            
            return false;
            
        }

    }
    @Override
    public String produz() {
        
            return resp;
        
    }
    
}
