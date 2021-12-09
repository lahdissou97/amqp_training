package fr.lernejo.chat;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication

public class Launcher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean start = true;
        System.out.println("Saisissez un message, nous vous l'enverrons (q pour quitter)");
        input = scanner.nextLine();

        while(!(input.equals("q"))) {
            System.out.println("message envoyé, Saisissez un message, nous vous l'enverrons (q pour quitter)");
            input = scanner.nextLine();

        }
    }
}
