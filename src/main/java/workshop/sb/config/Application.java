package workshop.sb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


// TODO 1 utwórz pakiety workshop.sb.config.controller i workshop.sb.config.service
// TODO 2 w pakiecie ... controller, utwórz GreetController i oznacz adnotacją właściwą dla kontrolera
// TODO 3 w pakiecie ... service, utwórz GreetService i oznacz adnotacją właściwą dla serwisu
// TODO 4 w GreetService zadeklaruj metodę getMsg() zwracającą "Hello World!"
// TODO 5 w GreetController zdefiniuj metodę String greet() obsługującą URL "/greet"
// TODO 6 wstrzyknij do kontrolera GreetService
// TODO 7 wywołaj metodę serwisu w metodzie kontrolera
