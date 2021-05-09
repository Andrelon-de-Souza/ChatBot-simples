package projeto.n1;

import java.util.ArrayList;

public class RespostaContador extends Resposta{
    
    protected int contador;
    
    public RespostaContador(String conta) {
        
        super(conta);
        this.contador = 0;
        
    }
    @Override
    public boolean verifica(String conta) {
        
        String palavras[] = conta.split(" ");
        
        if(palavras.equals("conta")) {
            
                contador++;
                return true;
                
    }else{
            
            return false;
            
        }
        
    }
    @Override
    public String produz() {
        
        return "" + contador;
        
    }
    
}
