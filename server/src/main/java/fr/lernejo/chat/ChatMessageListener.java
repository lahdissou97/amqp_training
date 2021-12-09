package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    public ChatMessageRepository repo;

    public void onMessage (String message){
        System.out.println(message);

    }
}
