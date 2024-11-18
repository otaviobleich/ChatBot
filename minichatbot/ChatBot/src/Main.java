import java.util.Scanner;

class MiniChatbot {

    public String responderSaudacao(String input) {
        if (input.equalsIgnoreCase("oi") || input.equalsIgnoreCase("olá")) {
            return "Olá! Como posso ajudar você hoje?";
        }
        return null;
    }

    public String responderNome(String input) {
        if (input.toLowerCase().contains("seu nome")) {
            return "Meu nome é MiniChatbot!";
        }
        return null;
    }

    public String responderComoEsta(String input) {
        if (input.toLowerCase().contains("como você esta")) {
            return "Estou funcionando perfeitamente, obrigado!";
        }
        return null;
    }

    public String respostaPadrao() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniChatbot chatbot = new MiniChatbot();

        System.out.println("Bem-vindo ao MiniChatbot! Digite 'sair' para encerrar a conversa.");

        while (true) {
            System.out.print("Você: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("MiniChatbot: Até logo! Foi bom conversar com você.");
                break;
            }

            String resposta = chatbot.responderSaudacao(input);
            if (resposta == null) resposta = chatbot.responderNome(input);
            if (resposta == null) resposta = chatbot.responderComoEsta(input);
            if (resposta == null) resposta = chatbot.respostaPadrao();

            System.out.println("MiniChatbot: " + resposta);
        }

        scanner.close();
    }
}