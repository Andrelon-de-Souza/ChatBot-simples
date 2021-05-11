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
        piada.add("O que o pato disse para a pata? Vem Quá!");
        piada.add("Porque o menino estava falando no telefone deitado? Para não cair a ligação;");
        piada.add("Porque o rádio não pode ter filhos? Porque ele é stereo.");
        piada.add("Por que o policial não usa sabão? Porque ele prefere deter gente.");
        piada.add("Por que as plantas pequenas não falam? Porque elas são mudinhas.");
        piada.add("Qual a fruta que anda de trem? kiwiiiii.");
        piada.add("O que é um astrólogo andando a cavalo? Um Cavaleiro do Zodíaco.");
        Resposta respConta = new RespostaAleatoria("piada", piada);

        // adicionando as respostas ao chatbot
        bot.adiciona(respSimples);
        bot.adiciona(respData);
        bot.adiciona(respHora);
        bot.adiciona(respContador);
        bot.adiciona(respConta);

        System.out.println(" ------------------------------------");
        System.out.println(" Iniciando o chatbot ");
        System.out.println(" ------------------------------------");
        Scanner entrada = new Scanner(System.in);
        String texto;
        while (true) {
            texto = entrada.nextLine();
            System.out.print("> ");
            System.out.println(bot.processar(texto));

        }

    }

}
