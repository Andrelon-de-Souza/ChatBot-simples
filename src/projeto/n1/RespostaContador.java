package projeto.n1;

import java.util.ArrayList;

public class RespostaContador extends Resposta{
    
    private int contador;
    
    public RespostaContador(String conta) {
        
        super(conta);
        this.contador = 0;
        
    }
    @Override
    public boolean verifica(String conta) {
        
        String frase = conta;
        String palavras[] = frase.split(" ");
        
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
