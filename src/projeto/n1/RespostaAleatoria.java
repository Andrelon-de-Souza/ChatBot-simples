package projeto.n1;

import java.util.ArrayList;

public class RespostaAleatoria extends Resposta {
    
    private ArrayList arrayPiada;
    
    public RespostaAleatoria(String piada, ArrayList<String> arrayPiada) {
        
       super(piada);
       this.arrayPiada = arrayPiada;
        
    }
    @Override
    public boolean verifica(String piada) {
        
        String frase = piada;
        String palavras[] = frase.split(" ");
        
        if(palavras.equals("piada")) {
            
                return true;
                
    }else{
            
            return false;
            
        }
        
    }
    @Override
    public String produz() {
        
        return "" + arrayPiada;
        
    }
    
}