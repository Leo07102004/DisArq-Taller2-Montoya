package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
//import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClientProxy;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();

        // Crear una instancia del proxy y pasarle el cliente original
        MessageSender proxyClient = new MessagingClientProxy(originalClient);

        // Utilizar la funcionalidad del proxy en lugar del cliente original
        proxyClient.sendMessage("Hola, ¿cómo estás?");
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
    }
}
