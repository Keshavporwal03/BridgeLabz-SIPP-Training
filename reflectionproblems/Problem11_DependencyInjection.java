package reflectionproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void serve() { System.out.println("Service is running..."); }
}

class Client {
    @Inject
    Service service;
}

public class Problem11_DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field field : Client.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, new Service());
            }
        }
        client.service.serve();
    }
}