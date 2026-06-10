interface MessageService {
    void send();
}

class Whatsapp implements MessageService {
    public void send() {
        System.out.println("Message sent on WhatsApp");
    }
}

class Email implements MessageService {
    public void send() {
        System.out.println("Message sent on Email");
    }
}

class Sms implements MessageService {
    public void send() {
        System.out.println("Message sent on SMS");
    }
}

class Service {

    private MessageService service;

    public Service(MessageService service) {
        this.service = service;
    }

    public void notifyUser() {
        service.send();
    }
}

public class GoodDIP {

    public static void main(String[] args) {

        MessageService a = new Email();

        Service b = new Service(a);

        b.notifyUser();
    }
}