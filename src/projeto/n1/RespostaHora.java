package projeto.n1;

import java.util.Calendar;

public class RespostaHora extends Resposta{
    
    public RespostaHora(String hora) {
        
        super(hora);
        
    }
    @Override
    public boolean verifica(String hora) {
        
        String palavras[] = hora.split(" ");
        
        if(palavras.equals("horas")) {
         
        return true;
        
    }else{
            
            return false;
            
        }
        
    }
    @Override
    public String produz() {
        
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY); 
        int min = data.get(Calendar.MINUTE);
        
        return hora + "h" + ":" + min + "min";
        
    }
    
}
