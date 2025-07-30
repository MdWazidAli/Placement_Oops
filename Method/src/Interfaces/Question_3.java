package Interfaces;

//❓ Question 3:
//You are building a messaging app that sends messages through different platforms.
//Create an abstract class Messenger with a method sendMessage(String message).
//Then create two subclasses:
//
//WhatsAppMessenger → prints: "Sent via WhatsApp: " + message
//
//EmailMessenger → prints: "Sent via Email: " + message
//
//In main(), send the following messages:
//
//        "Hey, are we meeting today?" via WhatsApp
//
//"Your appointment is confirmed." via Email


abstract class Messenger {
    abstract void sendMessage(String message);
}

class WhatsAppMessenger extends Messenger {
    void sendMessage(String message) {
        System.out.println("Hey, are we meeting today? " + message );
    }
}

class EmailMessenger extends Messenger {
    @Override
    void sendMessage(String message) {
        System.out.println("your appointment is confirmed." + message );
    }
}

public class Question_3 {

    public static void main(String[] args) {
        Messenger msg = new WhatsAppMessenger();

        Messenger esg = new EmailMessenger();

        msg.sendMessage(" via WhatsApp");
        esg.sendMessage(" via Email");
    }
}
