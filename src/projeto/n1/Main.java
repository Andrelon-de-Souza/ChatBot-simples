package projeto.n1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChatBot bot = new ChatBot();
        
        // Criando as resposta:
        Resposta respSimples = new RespostaSimples("nome", "Meus amigos me chamam de AnhembiBot.");
        Resposta respData = new RespostaData("dia");
        Resposta respHora = new RespostaHora("horas");
        Resposta respContador = new RespostaContador("conta");
        
        // Criando as piadas:
        ArrayList<String> piada = new ArrayList<>();
        piada.add("Qual é a fórmula da água? H Deus O!");
        piada.add("Um caipira chega à casa de uma amigo que está vendo TV e pergunta: -E aí, firme? - E o outro responde: - Não, futebor!");
        piada.add("Qual é o mercado que voa? É o super-mercado!");
        Resposta respConta = new RespostaAleatoria("conta", piada);
        
        
        Scanner entrada = new Scanner(System.in);
        String texto;
        while(true) {
            System.out.println("Agora são: " + respHora.produz());
            System.out.println("Hoje é dia: " + respData.produz());
            System.out.println(respSimples.produz());
            System.out.println("O conta atual está em " + respContador.produz());
            //System.out.println("> ");
            texto = entrada.nextLine();
            //System.out.println(bot.processar(texto));
        }
        
    }
    
}
