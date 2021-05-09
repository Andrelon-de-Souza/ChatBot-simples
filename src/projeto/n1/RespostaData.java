package projeto.n1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RespostaData extends Resposta {
    
    public RespostaData(String data) {
        
        super(data);
        
    }
    @Override
    public boolean verifica(String data) {
        
        String palavras[] = data.split(" ");
        
        if(palavras.equals("dia")) {
        
        return true;
        
    }else{
            
            return false;
            
        }
        
    }
    @Override
    public String produz() {
        
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        return data.format(date);
        
    }
    
}
