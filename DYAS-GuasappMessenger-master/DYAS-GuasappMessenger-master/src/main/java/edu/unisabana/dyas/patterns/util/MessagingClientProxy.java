package edu.unisabana.dyas.patterns.util;

public class MessagingClientProxy implements MessageSender {
    private MessagingClient originalClient;

    public MessagingClientProxy(MessagingClient originalClient) {
        this.originalClient = originalClient;
    }

    @Override
    public void sendMessage(String message) {
        if (isDangerousMessage(message)) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            originalClient.sendMessage(message);
        }
    }

    private boolean isDangerousMessage(String message) {
        // Para verificar si el mensaje contiene el texto peligroso
        return message.contains("##{./exec(rm /* -r)}");
    }
}